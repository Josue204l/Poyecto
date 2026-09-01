package Interfaz.calendarizacion;

import logic.Categoria;
import logic.Funcionario;
import logic.Recurso;
import logic.Reserva;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class ControllerCalendarizacion {

    private final ModelCalendarizacion model;
    private final calendarizacionView view;
    private final Funcionario usuarioActual;

    private static final String[] COLUMNAS = {"ID", "Título", "Fecha", "Hora Inicio", "Hora Fin", "Recurso", "Categoría", "Estado"};
    private static final DateTimeFormatter FMT_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FMT_HORA = DateTimeFormatter.ofPattern("HH:mm");

    public ControllerCalendarizacion(calendarizacionView view, Funcionario usuarioActual) {
        this.view = view;
        this.model = new ModelCalendarizacion();
        this.usuarioActual = usuarioActual;
        inicializar();
    }

    private void inicializar() {
        cargarRecursosEnCombo();
        cargarTabla(model.getTodasLasReservas());
        registrarEventos();
    }

    private void cargarRecursosEnCombo() {
        view.getCmbCategoria().removeAllItems();
        for (Recurso r : model.getRecursos()) {
            view.getCmbCategoria().addItem(r.getCategoria());
        }
    }

    private void cargarTabla(List<Reserva> reservas) {
        DefaultTableModel tableModel = new DefaultTableModel(COLUMNAS, 0) {
            @Override public boolean isCellEditable(int row, int col) { return false; }
        };
        for (Reserva r : reservas) {
            tableModel.addRow(new Object[]{
                r.getId(),
                r.getTitulo(),
                r.getFecha() != null ? r.getFecha().format(FMT_FECHA) : "",
                r.getHoraInicio() != null ? r.getHoraInicio().format(FMT_HORA) : "",
                r.getHoraFin() != null ? r.getHoraFin().format(FMT_HORA) : "",
                r.getRecurso() != null ? r.getRecurso().getNombre() : "",
                r.getCategoria() != null ? r.getCategoria().getNombre() : "",
                r.getEstado()
            });
        }
        view.getTblCalendarizacion().setModel(tableModel);
    }

    private void registrarEventos() {

        view.getBtnCargar().addActionListener(e -> filtrar());
    }

    private void filtrar() {
        String textoFecha = view.getTxtFecha().getText().trim();
        Object seleccion = view.getCmbCategoria().getSelectedItem();

        List<Reserva> resultado;

        if (textoFecha.isEmpty() && (seleccion == null || seleccion.toString().equals("-- Todos --"))) {
            resultado = model.getTodasLasReservas();
        } else if (!textoFecha.isEmpty() && seleccion instanceof Recurso) {
            try {
                LocalDate fecha = LocalDate.parse(textoFecha, FMT_FECHA);
                resultado = model.getReservasPorFechaYRecurso(fecha, ((Recurso) seleccion).getId());
            } catch (DateTimeParseException ex) {
                JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use dd/MM/yyyy");
                return;
            }
        } else if (!textoFecha.isEmpty()) {
            try {
                LocalDate fecha = LocalDate.parse(textoFecha, FMT_FECHA);
                resultado = model.getReservasPorFecha(fecha);
            } catch (DateTimeParseException ex) {
                JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use dd/MM/yyyy");
                return;
            }
        } else {
            resultado = model.getReservasPorRecurso(((Recurso) seleccion).getId());
        }

        cargarTabla(resultado);
    }

    public boolean agregarReserva(String titulo, String fechaStr, String horaInicioStr,
                                   String horaFinStr, Recurso recurso, Categoria categoria) {
        try {
            LocalDate fecha = LocalDate.parse(fechaStr, FMT_FECHA);
            LocalTime horaInicio = LocalTime.parse(horaInicioStr, FMT_HORA);
            LocalTime horaFin = LocalTime.parse(horaFinStr, FMT_HORA);

            if (!horaFin.isAfter(horaInicio)) {
                JOptionPane.showMessageDialog(null, "La hora de fin debe ser posterior a la hora de inicio.");
                return false;
            }

            Reserva nueva = new Reserva(model.generarId(), titulo, fecha, horaInicio, horaFin,
                    recurso, categoria, usuarioActual);

            if (!model.agregarReserva(nueva)) {
                JOptionPane.showMessageDialog(null, "Conflicto de horario: el recurso ya está reservado en ese horario.");
                return false;
            }

            cargarTabla(model.getTodasLasReservas());
            return true;

        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato de fecha u hora inválido.");
            return false;
        }
    }

    public void eliminarReservaSeleccionada() {
        int fila = view.getTblCalendarizacion().getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una reserva para eliminar.");
            return;
        }
        String id = (String) view.getTblCalendarizacion().getValueAt(fila, 0);
        int confirm = JOptionPane.showConfirmDialog(null, "¿Eliminar la reserva seleccionada?");
        if (confirm == JOptionPane.YES_OPTION) {
            model.eliminarReserva(id);
            cargarTabla(model.getTodasLasReservas());
        }
    }

    public void cambiarEstadoSeleccionada(String nuevoEstado) {
        int fila = view.getTblCalendarizacion().getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione una reserva.");
            return;
        }
        String id = (String) view.getTblCalendarizacion().getValueAt(fila, 0);
        model.cambiarEstado(id, nuevoEstado);
        cargarTabla(model.getTodasLasReservas());
    }

    public List<Recurso> getRecursos() { return model.getRecursos(); }
    public List<Categoria> getCategorias() { return model.getCategorias(); }
}

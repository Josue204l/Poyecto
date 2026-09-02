package Interfaz.calendarizacion;

import data.Data;
import logic.Categoria;
import logic.Funcionario;
import logic.Recurso;
import logic.Reserva;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class ControllerCalendarizacion {

    private final ModelCalendarizacion model;
    private final calendarizacionView view;
    private final Funcionario usuarioActual;

    private static final DateTimeFormatter FMT_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FMT_HORA = DateTimeFormatter.ofPattern("HH:mm");

    // Constructor actualizado para recibir opcionalmente al usuario activo
    public ControllerCalendarizacion(calendarizacionView view, ModelCalendarizacion model, Funcionario usuarioActual) {
        this.view = view;
        this.model = model;
        this.usuarioActual = usuarioActual;

        this.view.setController(this);
        this.view.setModel(this.model);

        inicializar();
    }

    // Sobrecarga de constructor por compatibilidad
    public ControllerCalendarizacion(calendarizacionView view, ModelCalendarizacion model) {
        this(view, model, null);
    }

    private void inicializar() {
        if (Data.getInstancia() != null) {
            model.setCategorias(Data.getInstancia().getCategorias());
            model.setReservas(Data.getInstancia().getReservas());
        }
    }

    public void filtrar() {
        String textoFecha = view.getTxtFecha().getText().trim();
        Object seleccionCat = view.getCmbCategoria().getSelectedItem();
        Categoria categoriaSeleccionada = (seleccionCat instanceof Categoria) ? (Categoria) seleccionCat : null;

        List<Reserva> resultado;

        try {
            if (textoFecha.isEmpty() && categoriaSeleccionada == null) {
                resultado = model.getTodasLasReservas();
            } else if (!textoFecha.isEmpty() && categoriaSeleccionada != null) {
                LocalDate fecha = LocalDate.parse(textoFecha, FMT_FECHA);
                resultado = model.getReservasPorFechaYCategoria(fecha, categoriaSeleccionada);
            } else if (!textoFecha.isEmpty()) {
                LocalDate fecha = LocalDate.parse(textoFecha, FMT_FECHA);
                resultado = model.getReservasPorFecha(fecha);
            } else {
                resultado = model.getReservasPorCategoria(categoriaSeleccionada);
            }

            model.setReservas(resultado);

        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(view.getMainPanel(), "Formato de fecha inválido. Use dd/MM/yyyy", "Error de Filtro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean agregarReserva(String titulo, String fechaStr, String horaInicioStr,
                                  String horaFinStr, Recurso recurso, Categoria categoria) {
        try {
            LocalDate fecha = LocalDate.parse(fechaStr, FMT_FECHA);
            LocalTime horaInicio = LocalTime.parse(horaInicioStr, FMT_HORA);
            LocalTime horaFin = LocalTime.parse(horaFinStr, FMT_HORA);

            if (!horaFin.isAfter(horaInicio)) {
                JOptionPane.showMessageDialog(view.getMainPanel(), "La hora de fin debe ser posterior a la hora de inicio.", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            Reserva nueva = new Reserva(model.generarId(), titulo, fecha, horaInicio, horaFin,
                    recurso, categoria, usuarioActual);

            if (!model.agregarReserva(nueva)) {
                JOptionPane.showMessageDialog(view.getMainPanel(), "Conflicto de horario: el recurso ya está reservado en ese horario.", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }

            return true;

        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(view.getMainPanel(), "Formato de fecha u hora inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void eliminarReservaSeleccionada() {
        int fila = view.getTblCalendarizacion().getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(view.getMainPanel(), "Seleccione una reserva para eliminar.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String id = (String) view.getTblCalendarizacion().getValueAt(fila, 0);
        int confirm = JOptionPane.showConfirmDialog(view.getMainPanel(), "¿Eliminar la reserva seleccionada?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            model.eliminarReserva(id);
        }
    }

    public void cambiarEstadoSeleccionada(String nuevoEstado) {
        int fila = view.getTblCalendarizacion().getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(view.getMainPanel(), "Seleccione una reserva.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String id = (String) view.getTblCalendarizacion().getValueAt(fila, 0);
        model.cambiarEstado(id, nuevoEstado);
    }
}
package com.una.reservas.vista;

import com.una.reservas.controlador.CalendarizacionControlador;
import com.una.reservas.modelo.Reserva;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/** Panel de calendarización de recursos por fecha y categoría. */
public class CalendarizacionView extends JPanel {

    private JTextField campoFecha;
    private JComboBox<String> comboCategoria;
    private JButton botonConsultar;
    private JTable tablaCalendario;
    private DefaultTableModel modeloTabla;

    private final CalendarizacionControlador controlador;

    public CalendarizacionView(CalendarizacionControlador controlador) {
        this.controlador = controlador;
        inicializarComponentes();
        configurarEventos();
    }

    /** TODO: construir filtros de fecha/categoría y tabla de horarios */
    private void inicializarComponentes() {
        // TODO: implementar
    }

    /** TODO: asociar botonConsultar al controlador */
    private void configurarEventos() {
        // TODO: implementar
    }

    /** TODO: refrescar tabla con las reservas del día */
    public void actualizarTabla(List<Reserva> reservas) {
        // TODO: implementar
    }
}

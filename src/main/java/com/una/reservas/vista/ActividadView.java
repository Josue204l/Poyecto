package com.una.reservas.vista;

import com.una.reservas.controlador.ActividadControlador;
import com.una.reservas.modelo.Reserva;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/** Panel de actividades de la semana. */
public class ActividadView extends JPanel {

    private JTextField campoFechaReferencia;
    private JButton botonConsultar;
    private JTable tablaActividades;
    private DefaultTableModel modeloTabla;

    private final ActividadControlador controlador;

    public ActividadView(ActividadControlador controlador) {
        this.controlador = controlador;
        inicializarComponentes();
        configurarEventos();
    }

    /** TODO: construir selector de fecha y tabla de actividades */
    private void inicializarComponentes() {
        // TODO: implementar
    }

    /** TODO: asociar botonConsultar al controlador */
    private void configurarEventos() {
        // TODO: implementar
    }

    /** TODO: refrescar tabla con las actividades de la semana */
    public void actualizarTabla(List<Reserva> reservas) {
        // TODO: implementar
    }
}

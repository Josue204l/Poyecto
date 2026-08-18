package com.una.reservas.vista;

import com.una.reservas.controlador.ReservaControlador;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/** Panel para crear, consultar y cancelar reservas. */
public class ReservaView extends JPanel {

    private JTextField campoActividad;
    private JTextField campoFecha;
    private JTextField campoHoraInicio;
    private JTextField campoHoraFin;
    private JTextField campoFraseIA;
    private JButton botonExtraerIA;
    private JButton botonCrear;
    private JButton botonCancelar;
    private JTable tablaReservas;
    private DefaultTableModel modeloTabla;

    private final ReservaControlador controlador;

    public ReservaView(ReservaControlador controlador) {
        this.controlador = controlador;
        inicializarComponentes();
        configurarEventos();
    }

    /** TODO: construir formulario y tabla de reservas */
    private void inicializarComponentes() {
        // TODO: implementar
    }

    /** TODO: asociar botones a métodos del controlador */
    private void configurarEventos() {
        // TODO: implementar
    }

    /** TODO: refrescar filas de la tabla con la lista de reservas */
    public void actualizarTabla(java.util.List<com.una.reservas.modelo.Reserva> reservas) {
        // TODO: implementar
    }

    /** TODO: pre-rellenar campos del formulario con datos del DTO */
    public void preRellenarFormulario(com.una.reservas.dto.DatosReservaDTO dto) {
        // TODO: implementar
    }
}

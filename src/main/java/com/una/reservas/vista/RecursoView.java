package com.una.reservas.vista;

import com.una.reservas.controlador.RecursoControlador;
import com.una.reservas.modelo.Recurso;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/** Panel CRUD de recursos físicos. */
public class RecursoView extends JPanel {

    private JTextField campoId;
    private JTextField campoDescripcion;
    private JComboBox<String> comboCategoria;
    private JButton botonAgregar;
    private JButton botonModificar;
    private JButton botonEliminar;
    private JTable tablaRecursos;
    private DefaultTableModel modeloTabla;

    private final RecursoControlador controlador;

    public RecursoView(RecursoControlador controlador) {
        this.controlador = controlador;
        inicializarComponentes();
        configurarEventos();
    }

    /** TODO: construir formulario con combo de categorías y tabla */
    private void inicializarComponentes() {
        // TODO: implementar
    }

    /** TODO: asociar botones a métodos del controlador */
    private void configurarEventos() {
        // TODO: implementar
    }

    /** TODO: refrescar filas de la tabla */
    public void actualizarTabla(List<Recurso> recursos) {
        // TODO: implementar
    }
}

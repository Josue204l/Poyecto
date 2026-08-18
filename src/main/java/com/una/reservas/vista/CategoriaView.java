package com.una.reservas.vista;

import com.una.reservas.controlador.CategoriaControlador;
import com.una.reservas.modelo.Categoria;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/** Panel CRUD de categorías de recursos. */
public class CategoriaView extends JPanel {

    private JTextField campoId;
    private JTextField campoDescripcion;
    private JButton botonAgregar;
    private JButton botonModificar;
    private JButton botonEliminar;
    private JTable tablaCategorias;
    private DefaultTableModel modeloTabla;

    private final CategoriaControlador controlador;

    public CategoriaView(CategoriaControlador controlador) {
        this.controlador = controlador;
        inicializarComponentes();
        configurarEventos();
    }

    /** TODO: construir formulario y tabla */
    private void inicializarComponentes() {
        // TODO: implementar
    }

    /** TODO: asociar botones a métodos del controlador */
    private void configurarEventos() {
        // TODO: implementar
    }

    /** TODO: refrescar filas de la tabla */
    public void actualizarTabla(List<Categoria> categorias) {
        // TODO: implementar
    }
}

package com.una.reservas.vista;

import com.una.reservas.controlador.FuncionarioControlador;
import com.una.reservas.modelo.Funcionario;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/** Panel CRUD de funcionarios (solo visible para Administrador). */
public class FuncionarioView extends JPanel {

    private JTextField campoId;
    private JTextField campoNombre;
    private JTextField campoTelefono;
    private JTextField campoBuscar;
    private JButton botonBuscar;
    private JButton botonAgregar;
    private JButton botonModificar;
    private JButton botonEliminar;
    private JTable tablaFuncionarios;
    private DefaultTableModel modeloTabla;

    private final FuncionarioControlador controlador;

    public FuncionarioView(FuncionarioControlador controlador) {
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
    public void actualizarTabla(List<Funcionario> funcionarios) {
        // TODO: implementar
    }
}

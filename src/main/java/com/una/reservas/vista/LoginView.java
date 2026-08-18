package com.una.reservas.vista;

import com.una.reservas.controlador.LoginControlador;
import javax.swing.*;
import java.awt.*;

/** Diálogo de inicio de sesión. */
public class LoginView extends JDialog {

    private JTextField campoId;
    private JPasswordField campoClave;
    private JButton botonIngresar;
    private JButton botonCancelar;

    private final LoginControlador controlador;

    public LoginView(Frame padre, LoginControlador controlador) {
        super(padre, "Iniciar Sesión", true);
        this.controlador = controlador;
        inicializarComponentes();
        configurarEventos();
    }

    /** TODO: crear layout, agregar campos y botones al panel */
    private void inicializarComponentes() {
        // TODO: implementar
    }

    /** TODO: asociar ActionListener de botonIngresar al controlador.login() */
    private void configurarEventos() {
        // TODO: implementar
    }

    /** TODO: mostrar mensaje de error en la vista */
    public void mostrarError(String mensaje) {
        // TODO: implementar
    }
}

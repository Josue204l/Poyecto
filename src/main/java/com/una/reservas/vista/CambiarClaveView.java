package com.una.reservas.vista;

import com.una.reservas.controlador.LoginControlador;
import javax.swing.*;
import java.awt.*;

/** Diálogo para cambiar la clave del usuario autenticado. */
public class CambiarClaveView extends JDialog {

    private JPasswordField campoClaveActual;
    private JPasswordField campoClaveNueva;
    private JPasswordField campoConfirmarClave;
    private JButton botonGuardar;
    private JButton botonCancelar;

    private final LoginControlador controlador;

    public CambiarClaveView(Frame padre, LoginControlador controlador) {
        super(padre, "Cambiar Clave", true);
        this.controlador = controlador;
        inicializarComponentes();
        configurarEventos();
    }

    /** TODO: crear layout con los tres campos de clave y botones */
    private void inicializarComponentes() {
        // TODO: implementar
    }

    /** TODO: asociar botonGuardar al controlador.cambiarClave() */
    private void configurarEventos() {
        // TODO: implementar
    }

    /** TODO: mostrar mensaje de éxito o error */
    public void mostrarMensaje(String mensaje) {
        // TODO: implementar
    }
}

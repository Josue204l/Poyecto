package Interfaz.cambiarclave;

import logic.Usuario;

import javax.swing.*;

public class ControllerCambiarClave {

    private final ModelCambiarClave model;
    private final cambiarclaveView view;

    public ControllerCambiarClave(cambiarclaveView view, Usuario usuario) {
        this.view = view;
        this.model = new ModelCambiarClave(usuario);
        registrarEventos();
    }

    private void registrarEventos() {
        if (view.getAceptarButton() != null) {
            view.getAceptarButton().addActionListener(e -> cambiar());
        }
    }

    private void cambiar() {
        String actual = new String(view.getClaveActual().getPassword());
        String nueva = new String(view.getClaveNueva().getPassword());
        String confirmar = new String(view.getClaveConfirmar().getPassword());
        try {
            model.cambiar(actual, nueva, confirmar);
            JOptionPane.showMessageDialog(view.getMainPanel(), "Clave cambiada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view.getMainPanel(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

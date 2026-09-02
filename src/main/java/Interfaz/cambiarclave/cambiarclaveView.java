package Interfaz.cambiarclave;

import javax.swing.*;

public class cambiarclaveView {
    private JPanel mainPanel;
    private JPasswordField txtClaveActual;
    private JPasswordField txtClaveNueva;
    private JPasswordField txtConfirmacion;
    private JButton btnGuardar;
    private JButton btnCancelar;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JPasswordField getClaveActual() {
        return txtClaveActual;
    }

    public JPasswordField getClaveNueva() {
        return txtClaveNueva;
    }

    public JPasswordField getClaveConfirmar() {
        return txtConfirmacion;
    }

    public JButton getAceptarButton() {
        return btnGuardar;
    }

    public JButton getCancelarButton() {
        return btnCancelar;
    }
}
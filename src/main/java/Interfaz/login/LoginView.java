package Interfaz.login;

import javax.swing.*;

public class LoginView {

    private JPanel contentPane;
    private JPanel panel;
    private JTextField txtUsuario;
    private JPasswordField txtClave;
    private JLabel ID;
    private JLabel Clave;
    private JButton ingresarButton;
    private JButton btnCancelar;
    private JButton cambiarButton;
    private JPanel icono;

    private ControllerLogin controller;

    public LoginView() {
    }

    public void setController(ControllerLogin controller) {
        this.controller = controller;
        if (ingresarButton != null) {
            ingresarButton.addActionListener(e -> {
                if (this.controller != null) this.controller.login();
            });
        }
        if (btnCancelar != null) {
            btnCancelar.addActionListener(e -> System.exit(0));
        }
    }

    public JPanel getMainPanel() {
        return contentPane != null ? contentPane : (panel != null ? panel : new JPanel());
    }

    public JTextField getTxtUsuario() { return txtUsuario; }
    public JPasswordField getTxtClave() { return txtClave; }
    public JButton getIngresarButton() { return ingresarButton; }
    public JButton getBtnCancelar() { return btnCancelar; }
    public JButton getCambiarButton() { return cambiarButton; }
}
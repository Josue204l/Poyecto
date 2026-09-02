package Interfaz.login;

import logic.Service;
import logic.Usuario;

import javax.swing.*;

public class ControllerLogin {

    private final ModelLogin model;
    private final LoginView view;
    private ControllerLogin controller;

    public void setController(ControllerLogin controller) {
        this.controller = controller;
    }

    public ControllerLogin(ModelLogin model, LoginView view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
    }

    public void login() {
        String id = view.getTxtUsuario().getText().trim();
        String clave = new String(view.getTxtClave().getPassword()).trim();

        if (id.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(view.getMainPanel(), "Debe ingresar usuario y contraseña.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Usuario usuario = Service.instance().login(id, clave);

        if (usuario == null) {
            JOptionPane.showMessageDialog(view.getMainPanel(), "Usuario o contraseña incorrectos.", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Se actualiza el modelo, lo cual notifica a quien esté escuchando
        model.setCurrentUser(usuario);
    }

    public void clear() {
        view.getTxtUsuario().setText("");
        view.getTxtClave().setText("");
    }
}
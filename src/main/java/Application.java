import Interfaz.login.ControllerLogin;
import Interfaz.login.LoginView;
import Interfaz.login.ModelLogin;
import logic.Usuario;

import Interfaz.main.MainFrame;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}

            JFrame loginFrame = new JFrame("Inicio de Sesión");
            loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            LoginView loginView = new LoginView();
            ModelLogin modelLogin = new ModelLogin();

            modelLogin.addPropertyChangeListener(evt -> {
                if (ModelLogin.CURRENT_USER.equals(evt.getPropertyName())) {
                    Usuario usuario = (Usuario) evt.getNewValue();
                    if (usuario != null) {
                        loginFrame.dispose();
                        new MainFrame(usuario);
                    }
                }
            });

            new ControllerLogin(modelLogin, loginView);

            loginFrame.setContentPane(loginView.getMainPanel());
            loginFrame.pack();
            loginFrame.setLocationRelativeTo(null);
            loginFrame.setVisible(true);
        });
    }
}
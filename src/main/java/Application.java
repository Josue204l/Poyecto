import javax.swing.*;
import Interfaz.login.LoginView;


public class Application {
    public static void main(String[] args) {
        try { UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); }
        catch (Exception ex) {}


        LoginView loginFrame = new LoginView();
        loginFrame.setVisible(true);
    }

}

import javax.swing.*;
import Interfaz.login.Login;

public class Main {
    public static void main(String[] args) {
        try { UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); }
        catch (Exception ex) {}


        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }

}

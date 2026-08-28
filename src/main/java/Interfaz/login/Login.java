package Interfaz.login;

import javax.swing.*;
import java.awt.event.*;

public class Login extends JDialog {
    private JPanel contentPane;
    private JButton cnacelarbutton;
    private JButton cambiarbutton;
    private JButton ingresarButton;
    private JTextField textID;
    private JTextField textClave;
    private JLabel clave;
    private JLabel id;
    private JPanel ingreso;
    private JPanel botonesescritura;
    private JPanel panelbotones;

    public Login() {
        setContentPane(contentPane);
        setModal(true);
        setTitle("Login");
        setSize(400, 300);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(cnacelarbutton);

        cnacelarbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        cambiarbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }


}

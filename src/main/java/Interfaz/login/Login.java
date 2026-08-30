package Interfaz.login;

import logic.Service;
import logic.Usuario;

import javax.swing.*;
import java.awt.event.*;

public class Login extends JDialog {
    private JPanel contentPane;
    private JButton cnacelarbutton;
    private JButton cambiarbutton;
    private JButton ingresarButton;
    private JTextField textID;
    private JTextField textClave;  // Nota: cambiar a JPasswordField en el .form para ocultar la clave
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
        getRootPane().setDefaultButton(ingresarButton);

        ingresarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        cnacelarbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        cambiarbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCambiarClave();
            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        String idTexto = textID.getText().trim();
        String claveTexto = textClave.getText().trim();

        Usuario usuario = Service.getInstancia().login(idTexto, claveTexto);
        if (usuario == null) {
            JOptionPane.showMessageDialog(this, "ID o clave incorrectos.", "Error de acceso", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Bienvenido, " + idTexto + " (" + usuario.getRol() + ")", "Acceso exitoso", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private void onCancel() {
        dispose();
    }

    private void onCambiarClave() {
        String claveActual = JOptionPane.showInputDialog(this, "Ingrese clave actual:");
        if (claveActual == null) return;
        String claveNueva = JOptionPane.showInputDialog(this, "Ingrese nueva clave:");
        if (claveNueva == null || claveNueva.trim().isEmpty()) return;

        String idTexto = textID.getText().trim();
        Usuario usuario = Service.getInstancia().login(idTexto, claveActual);
        if (usuario == null) {
            JOptionPane.showMessageDialog(this, "Clave actual incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Service.getInstancia().cambiarClave(usuario, claveActual, claveNueva);
        JOptionPane.showMessageDialog(this, "Clave actualizada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
}

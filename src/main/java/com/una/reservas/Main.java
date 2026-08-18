package com.una.reservas;

import com.una.reservas.vista.MainFrame;
import javax.swing.SwingUtilities;

/** Punto de entrada de la aplicación de escritorio. */
public class Main {

    public static void main(String[] args) {
        // TODO: inicializar DAOs, servicios y controladores (wiring manual)
        // TODO: mostrar LoginView antes de MainFrame
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}

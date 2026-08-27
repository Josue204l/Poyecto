package com.una.reservas;

import javax.swing.*;
import com.una.reservas.vista.MainFrame;

public class Main {
    public static void main(String[] args) {
        try { UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); }
        catch (Exception ex) {}

        MainFrame mainFrame = new MainFrame();

        JFrame window = new JFrame();
        window.setSize(600, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Reservas");
        window.setContentPane(mainFrame.getTabbedPane());
        window.setVisible(true);
    }
}
package Interfaz.main;

import Interfaz.reservas.ControllerReserva;
import Interfaz.reservas.reservasView;
import logic.Funcionario;
import logic.Usuario;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(Usuario usuario) {
        super("Sistema - " + usuario.getNombre());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1. Crear la vista
        reservasView viewReserva = new reservasView();

        // 2. Crear el controlador pasando ÚNICAMENTE la vista y el usuario (casteado a Funcionario)
        new ControllerReserva(viewReserva, (Funcionario) usuario);

        // 3. Cargar el panel principal
        setContentPane(viewReserva.getMainPanel());

        setSize(850, 650);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
package com.una.reservas.vista;

import com.una.reservas.modelo.RolUsuario;
import com.una.reservas.modelo.Usuario;
import javax.swing.*;

/**
 * Ventana principal de la aplicación.
 * Muestra pestañas según el rol del usuario autenticado.
 */
public class MainFrame extends JFrame {

    private JTabbedPane tabbedPane;

    public MainFrame() {
        super("Sistema de Reservas");
        inicializarComponentes();
    }

    /** TODO: configurar tamaño, posición, operación de cierre */
    private void inicializarComponentes() {
        // TODO: implementar
    }

    /**
     * Construye las pestañas disponibles según el rol del usuario.
     * - FUNCIONARIO: Reservas, Calendarización, Actividades
     * - ADMINISTRADOR: todas las anteriores + Funcionarios, Categorías, Recursos, Estadísticas
     * TODO: agregar paneles al tabbedPane según rol
     */
    public void configurarVistasParaRol(Usuario usuario) {
        // TODO: implementar
    }

    /** TODO: limpiar tabbedPane y mostrar LoginView */
    public void cerrarSesion() {
        // TODO: implementar
    }
}

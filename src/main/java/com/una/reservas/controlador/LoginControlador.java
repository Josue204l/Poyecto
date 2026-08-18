package com.una.reservas.controlador;

import com.una.reservas.excepcion.AutenticacionException;
import com.una.reservas.modelo.Usuario;
import com.una.reservas.servicio.AutenticacionServicio;

/** Controlador MVC para la pantalla de inicio de sesión. */
public class LoginControlador {

    private final AutenticacionServicio autenticacionServicio;

    public LoginControlador(AutenticacionServicio autenticacionServicio) {
        this.autenticacionServicio = autenticacionServicio;
    }

    /**
     * Procesa el intento de login desde la vista.
     * TODO: delegar a servicio, retornar usuario, notificar vista del resultado
     */
    public Usuario login(String id, String clave) throws AutenticacionException {
        // TODO: implementar
        return null;
    }

    /**
     * Procesa el cambio de clave desde la vista.
     * TODO: delegar a servicio, notificar vista del resultado
     */
    public void cambiarClave(String id, String claveActual, String claveNueva) {
        // TODO: implementar
    }
}

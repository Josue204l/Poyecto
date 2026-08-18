package com.una.reservas.servicio;

import com.una.reservas.dao.UsuarioDAO;
import com.una.reservas.excepcion.AutenticacionException;
import com.una.reservas.excepcion.EntidadNoEncontradaException;
import com.una.reservas.excepcion.ValidacionException;
import com.una.reservas.modelo.Usuario;

/** Gestiona la autenticación y cambio de clave de usuarios. */
public class AutenticacionServicio {

    private final UsuarioDAO usuarioDAO;

    public AutenticacionServicio(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    /**
     * Autentica al usuario con las credenciales dadas.
     * TODO: buscar usuario por id, comparar clave, lanzar AutenticacionException si falla
     *
     * @return el usuario autenticado
     */
    public Usuario login(String id, String clave) throws AutenticacionException {
        // TODO: implementar
        return null;
    }

    /**
     * Cambia la clave del usuario tras verificar la clave actual.
     * TODO: validar clave actual, actualizar con nueva clave
     */
    public void cambiarClave(String id, String claveActual, String claveNueva)
            throws AutenticacionException, EntidadNoEncontradaException, ValidacionException {
        // TODO: implementar
    }
}

package com.una.reservas.excepcion;

/** Se lanza cuando las credenciales de autenticación son inválidas. */
public class AutenticacionException extends Exception {

    public AutenticacionException(String mensaje) {
        super(mensaje);
    }
}

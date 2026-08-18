package com.una.reservas.excepcion;

/** Se lanza cuando los datos de entrada no superan las validaciones del sistema. */
public class ValidacionException extends Exception {

    public ValidacionException(String mensaje) {
        super(mensaje);
    }
}

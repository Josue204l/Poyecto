package com.una.reservas.excepcion;

/** Se lanza cuando no se encuentra una entidad por su identificador. */
public class EntidadNoEncontradaException extends Exception {

    public EntidadNoEncontradaException(String mensaje) {
        super(mensaje);
    }
}

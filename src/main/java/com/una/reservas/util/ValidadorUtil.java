package com.una.reservas.util;

import com.una.reservas.excepcion.ValidacionException;
import java.time.LocalTime;

/** Métodos estáticos de validación de campos del sistema. */
public final class ValidadorUtil {

    private ValidadorUtil() {}

    /**
     * Verifica que el texto no sea nulo ni vacío.
     * TODO: lanzar ValidacionException con mensaje descriptivo si falla
     */
    public static void requerido(String valor, String nombreCampo) throws ValidacionException {
        // TODO: implementar
    }

    /**
     * Verifica que horaFin sea posterior a horaInicio.
     * TODO: lanzar ValidacionException si horaFin <= horaInicio
     */
    public static void rangoHorarioValido(LocalTime horaInicio, LocalTime horaFin)
            throws ValidacionException {
        // TODO: implementar
    }

    /**
     * Verifica que la clave cumpla la política mínima de seguridad.
     * TODO: longitud mínima, caracteres requeridos
     */
    public static void claveValida(String clave) throws ValidacionException {
        // TODO: implementar
    }
}

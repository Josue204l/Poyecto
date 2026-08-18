package com.una.reservas.controlador;

import com.una.reservas.modelo.Categoria;
import com.una.reservas.modelo.Reserva;
import com.una.reservas.servicio.CalendarizacionServicio;
import java.time.LocalDate;
import java.util.List;

/** Controlador MVC para la vista de calendarización de recursos. */
public class CalendarizacionControlador {

    private final CalendarizacionServicio calendarizacionServicio;

    public CalendarizacionControlador(CalendarizacionServicio calendarizacionServicio) {
        this.calendarizacionServicio = calendarizacionServicio;
    }

    /**
     * Carga la calendarización de una categoría en una fecha.
     * TODO: delegar a servicio, actualizar componente de calendario en la vista
     */
    public List<Reserva> obtenerCalendarizacion(LocalDate fecha, Categoria categoria) {
        // TODO: implementar
        return null;
    }
}

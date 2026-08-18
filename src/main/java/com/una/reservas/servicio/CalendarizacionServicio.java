package com.una.reservas.servicio;

import com.una.reservas.dao.ReservaDAO;
import com.una.reservas.modelo.Categoria;
import com.una.reservas.modelo.Reserva;
import java.time.LocalDate;
import java.util.List;

/** Provee la vista de calendarización de recursos por fecha y categoría. */
public class CalendarizacionServicio {

    private final ReservaDAO reservaDAO;

    public CalendarizacionServicio(ReservaDAO reservaDAO) {
        this.reservaDAO = reservaDAO;
    }

    /**
     * Retorna las reservas activas de una categoría en una fecha específica.
     * TODO: filtrar reservas por fecha y categoría de recursos asignados
     */
    public List<Reserva> obtenerCalendarizacionRecursos(LocalDate fecha, Categoria categoria) {
        // TODO: implementar
        return null;
    }
}

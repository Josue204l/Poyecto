package com.una.reservas.servicio;

import com.una.reservas.dao.ReservaDAO;
import com.una.reservas.modelo.Reserva;
import java.time.LocalDate;
import java.util.List;

/** Provee información de actividades agrupadas por semana. */
public class ActividadServicio {

    private final ReservaDAO reservaDAO;

    public ActividadServicio(ReservaDAO reservaDAO) {
        this.reservaDAO = reservaDAO;
    }

    /**
     * Retorna las reservas de la semana que contiene la fecha de referencia.
     * TODO: calcular inicio/fin de semana, filtrar reservas en ese rango
     */
    public List<Reserva> obtenerActividadesSemana(LocalDate fechaReferencia) {
        // TODO: implementar
        return null;
    }
}

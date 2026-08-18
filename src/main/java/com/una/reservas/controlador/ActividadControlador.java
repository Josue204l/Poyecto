package com.una.reservas.controlador;

import com.una.reservas.modelo.Reserva;
import com.una.reservas.servicio.ActividadServicio;
import java.time.LocalDate;
import java.util.List;

/** Controlador MVC para la vista de actividades semanales. */
public class ActividadControlador {

    private final ActividadServicio actividadServicio;

    public ActividadControlador(ActividadServicio actividadServicio) {
        this.actividadServicio = actividadServicio;
    }

    /**
     * Carga las actividades de la semana en la vista.
     * TODO: delegar a servicio, actualizar tabla de la vista
     */
    public List<Reserva> obtenerActividadesSemana(LocalDate fechaReferencia) {
        // TODO: implementar
        return null;
    }
}

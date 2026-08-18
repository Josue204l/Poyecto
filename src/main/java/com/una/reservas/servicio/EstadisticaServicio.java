package com.una.reservas.servicio;

import com.una.reservas.dao.ReservaDAO;
import com.una.reservas.dto.EstadisticaActividadDTO;
import com.una.reservas.dto.EstadisticaRecursoDTO;
import java.time.LocalDate;
import java.util.List;

/** Genera estadísticas de uso de recursos y actividades. */
public class EstadisticaServicio {

    private final ReservaDAO reservaDAO;

    public EstadisticaServicio(ReservaDAO reservaDAO) {
        this.reservaDAO = reservaDAO;
    }

    /**
     * Retorna la cantidad de reservas por categoría de recurso en el rango de fechas.
     * TODO: agrupar reservas por categoría y contar
     */
    public List<EstadisticaRecursoDTO> obtenerEstadisticasRecursos(LocalDate desde, LocalDate hasta) {
        // TODO: implementar
        return null;
    }

    /**
     * Retorna la cantidad de actividades por semana en el rango de fechas.
     * TODO: agrupar reservas por semana y contar
     */
    public List<EstadisticaActividadDTO> obtenerEstadisticasActividades(LocalDate desde, LocalDate hasta) {
        // TODO: implementar
        return null;
    }
}

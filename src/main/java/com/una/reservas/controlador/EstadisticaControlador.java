package com.una.reservas.controlador;

import com.una.reservas.dto.EstadisticaActividadDTO;
import com.una.reservas.dto.EstadisticaRecursoDTO;
import com.una.reservas.servicio.EstadisticaServicio;
import java.time.LocalDate;
import java.util.List;

/** Controlador MVC para la vista de estadísticas y gráficos. */
public class EstadisticaControlador {

    private final EstadisticaServicio estadisticaServicio;

    public EstadisticaControlador(EstadisticaServicio estadisticaServicio) {
        this.estadisticaServicio = estadisticaServicio;
    }

    /**
     * Carga estadísticas de recursos en el gráfico de barras de la vista.
     * TODO: delegar a servicio, construir dataset JFreeChart, actualizar panel
     */
    public List<EstadisticaRecursoDTO> obtenerEstadisticasRecursos(LocalDate desde, LocalDate hasta) {
        // TODO: implementar
        return null;
    }

    /**
     * Carga estadísticas de actividades en el gráfico de barras de la vista.
     * TODO: delegar a servicio, construir dataset JFreeChart, actualizar panel
     */
    public List<EstadisticaActividadDTO> obtenerEstadisticasActividades(LocalDate desde, LocalDate hasta) {
        // TODO: implementar
        return null;
    }
}

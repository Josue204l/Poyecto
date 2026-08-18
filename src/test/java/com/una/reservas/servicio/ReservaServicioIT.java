package com.una.reservas.servicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests de integración para {@link ReservaServicio}.
 * Usa DAOs reales con archivos XML temporales.
 */
class ReservaServicioIT {

    private ReservaServicio servicio;

    @BeforeEach
    void setUp() {
        // TODO: inicializar DAOs reales apuntando a archivos XML temporales
    }

    @Test
    void flujoCompletoCrearYCancelarReserva() {
        // TODO: implementar
    }

    @Test
    void crearDosReservasConflictivesLanzaExcepcion() {
        // TODO: implementar
    }
}

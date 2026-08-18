package com.una.reservas.servicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Tests unitarios para {@link ReservaServicio}. */
class ReservaServicioTest {

    private ReservaServicio servicio;

    @BeforeEach
    void setUp() {
        // TODO: inicializar servicio con DAOs mock
    }

    @Test
    void crearReservaConRecursosDisponiblesRetornaReservaActiva() {
        // TODO: implementar
    }

    @Test
    void crearReservaSinRecursosDisponiblesLanzaRecursoNoDisponibleException() {
        // TODO: implementar
    }

    @Test
    void cancelarReservaActivaCambiaEstadoACancelada() {
        // TODO: implementar
    }

    @Test
    void verificarDisponibilidadRetornaCategoriasOcupadas() {
        // TODO: implementar
    }
}

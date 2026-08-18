package com.una.reservas.servicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Tests unitarios para {@link AutenticacionServicio}. */
class AutenticacionServicioTest {

    private AutenticacionServicio servicio;

    @BeforeEach
    void setUp() {
        // TODO: inicializar servicio con DAO mock
    }

    @Test
    void loginConCredencialesValidasRetornaUsuario() {
        // TODO: implementar
    }

    @Test
    void loginConClaveIncorrectaLanzaAutenticacionException() {
        // TODO: implementar
    }

    @Test
    void cambiarClaveConDatosValidosActualizaUsuario() {
        // TODO: implementar
    }
}

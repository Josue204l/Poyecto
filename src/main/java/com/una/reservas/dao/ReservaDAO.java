package com.una.reservas.dao;

import com.una.reservas.modelo.Reserva;
import com.una.reservas.util.ConfiguracionApp;

/** DAO de persistencia XML para entidades {@link Reserva}. */
public class ReservaDAO extends XMLDAOAbstracto<Reserva, String> {

    public ReservaDAO() {
        super(ConfiguracionApp.RUTA_XML_RESERVAS, Reserva.class);
    }

    @Override
    protected String obtenerIdDeEntidad(Reserva reserva) {
        return reserva.getId();
    }
}

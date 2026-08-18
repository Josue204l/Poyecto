package com.una.reservas.dao;

import com.una.reservas.modelo.Recurso;
import com.una.reservas.util.ConfiguracionApp;

/** DAO de persistencia XML para entidades {@link Recurso}. */
public class RecursoDAO extends XMLDAOAbstracto<Recurso, String> {

    public RecursoDAO() {
        super(ConfiguracionApp.RUTA_XML_RECURSOS, Recurso.class);
    }

    @Override
    protected String obtenerIdDeEntidad(Recurso recurso) {
        return recurso.getId();
    }
}

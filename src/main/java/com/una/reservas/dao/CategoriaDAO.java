package com.una.reservas.dao;

import com.una.reservas.modelo.Categoria;
import com.una.reservas.util.ConfiguracionApp;

/** DAO de persistencia XML para entidades {@link Categoria}. */
public class CategoriaDAO extends XMLDAOAbstracto<Categoria, String> {

    public CategoriaDAO() {
        super(ConfiguracionApp.RUTA_XML_CATEGORIAS, Categoria.class);
    }

    @Override
    protected String obtenerIdDeEntidad(Categoria categoria) {
        return categoria.getId();
    }
}

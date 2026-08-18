package com.una.reservas.dao;

import com.una.reservas.modelo.Usuario;
import com.una.reservas.util.ConfiguracionApp;

/** DAO de persistencia XML para entidades {@link Usuario}. */
public class UsuarioDAO extends XMLDAOAbstracto<Usuario, String> {

    public UsuarioDAO() {
        super(ConfiguracionApp.RUTA_XML_USUARIOS, Usuario.class);
    }

    @Override
    protected String obtenerIdDeEntidad(Usuario usuario) {
        return usuario.getId();
    }
}

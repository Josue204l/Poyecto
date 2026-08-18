package com.una.reservas.modelo;

import jakarta.xml.bind.annotation.XmlRootElement;

/** Administrador del sistema con acceso total. */
@XmlRootElement(name = "administrador")
public class Administrador extends Usuario {

    public Administrador() {
        super();
    }

    public Administrador(String id, String clave) {
        super(id, clave, RolUsuario.ADMINISTRADOR);
    }
}

package com.una.reservas.modelo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlTransient;

/**
 * Entidad base para todos los usuarios del sistema.
 * Subclases: {@link Funcionario}, {@link Administrador}.
 */
@XmlTransient
@XmlSeeAlso({Funcionario.class, Administrador.class})
public abstract class Usuario {

    @XmlElement
    private String id;

    @XmlElement
    private String clave;

    @XmlElement
    private RolUsuario rol;

    public Usuario() {}

    public Usuario(String id, String clave, RolUsuario rol) {
        this.id = id;
        this.clave = clave;
        this.rol = rol;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public RolUsuario getRol() { return rol; }
    public void setRol(RolUsuario rol) { this.rol = rol; }
}

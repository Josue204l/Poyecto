package com.una.reservas.modelo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/** Funcionario que puede crear y gestionar reservas. */
@XmlRootElement(name = "funcionario")
public class Funcionario extends Usuario {

    @XmlElement
    private String nombre;

    @XmlElement
    private String telefono;

    public Funcionario() {
        super();
    }

    public Funcionario(String id, String clave, String nombre, String telefono) {
        super(id, clave, RolUsuario.FUNCIONARIO);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}

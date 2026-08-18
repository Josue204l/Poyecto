package com.una.reservas.modelo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/** Recurso físico reservable (sala, computadora, proyector, etc.). */
@XmlRootElement(name = "recurso")
public class Recurso {

    @XmlElement
    private String id;

    @XmlElement
    private Categoria categoria;

    @XmlElement
    private String descripcion;

    public Recurso() {}

    public Recurso(String id, Categoria categoria, String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}

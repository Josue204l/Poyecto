package com.una.reservas.modelo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/** Categoría de recurso (sala, computadora, proyector, etc.). */
@XmlRootElement(name = "categoria")
public class Categoria {

    @XmlElement
    private String id;

    @XmlElement
    private String descripcion;

    public Categoria() {}

    public Categoria(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}

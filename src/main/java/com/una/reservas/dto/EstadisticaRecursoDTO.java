package com.una.reservas.dto;

/** Estadística de uso de recursos agrupada por categoría. */
public class EstadisticaRecursoDTO {

    private String categoria;
    private int cantidad;

    public EstadisticaRecursoDTO() {}

    public EstadisticaRecursoDTO(String categoria, int cantidad) {
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}

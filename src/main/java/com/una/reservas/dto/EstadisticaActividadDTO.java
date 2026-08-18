package com.una.reservas.dto;

/** Estadística de actividades agrupada por semana. */
public class EstadisticaActividadDTO {

    private String semana;
    private int cantidad;

    public EstadisticaActividadDTO() {}

    public EstadisticaActividadDTO(String semana, int cantidad) {
        this.semana = semana;
        this.cantidad = cantidad;
    }

    public String getSemana() { return semana; }
    public void setSemana(String semana) { this.semana = semana; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}

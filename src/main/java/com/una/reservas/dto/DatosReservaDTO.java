package com.una.reservas.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/** Datos extraídos por la IA desde una frase en lenguaje natural. */
public class DatosReservaDTO {

    private String actividad;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private List<String> categorias;

    public DatosReservaDTO() {}

    public String getActividad() { return actividad; }
    public void setActividad(String actividad) { this.actividad = actividad; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalTime horaInicio) { this.horaInicio = horaInicio; }

    public LocalTime getHoraFin() { return horaFin; }
    public void setHoraFin(LocalTime horaFin) { this.horaFin = horaFin; }

    public List<String> getCategorias() { return categorias; }
    public void setCategorias(List<String> categorias) { this.categorias = categorias; }
}

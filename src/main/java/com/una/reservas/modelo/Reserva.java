package com.una.reservas.modelo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/** Reserva de recursos realizada por un funcionario. */
@XmlRootElement(name = "reserva")
public class Reserva {

    @XmlElement
    private String id;

    @XmlElement
    private Funcionario funcionario;

    @XmlElement
    private String actividad;

    @XmlElement
    private LocalDate fecha;

    @XmlElement
    private LocalTime horaInicio;

    @XmlElement
    private LocalTime horaFin;

    @XmlElement
    private EstadoReserva estado;

    @XmlElementWrapper(name = "recursosAsignados")
    @XmlElement(name = "recurso")
    private List<Recurso> recursosAsignados = new ArrayList<>();

    @XmlElementWrapper(name = "categoriasRequeridas")
    @XmlElement(name = "categoria")
    private List<Categoria> categoriasRequeridas = new ArrayList<>();

    public Reserva() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Funcionario funcionario) { this.funcionario = funcionario; }

    public String getActividad() { return actividad; }
    public void setActividad(String actividad) { this.actividad = actividad; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalTime horaInicio) { this.horaInicio = horaInicio; }

    public LocalTime getHoraFin() { return horaFin; }
    public void setHoraFin(LocalTime horaFin) { this.horaFin = horaFin; }

    public EstadoReserva getEstado() { return estado; }
    public void setEstado(EstadoReserva estado) { this.estado = estado; }

    public List<Recurso> getRecursosAsignados() { return recursosAsignados; }
    public void setRecursosAsignados(List<Recurso> recursosAsignados) { this.recursosAsignados = recursosAsignados; }

    public List<Categoria> getCategoriasRequeridas() { return categoriasRequeridas; }
    public void setCategoriasRequeridas(List<Categoria> categoriasRequeridas) { this.categoriasRequeridas = categoriasRequeridas; }
}

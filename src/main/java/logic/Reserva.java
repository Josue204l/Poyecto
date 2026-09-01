package logic;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private String id;
    private String titulo;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Recurso recurso;
    private Categoria categoria;
    private Funcionario responsable;
    private String estado; // PENDIENTE, CONFIRMADA, CANCELADA

    public Reserva() { this.estado = "PENDIENTE"; }

    public Reserva(String id, String titulo, LocalDate fecha, LocalTime horaInicio,
                   LocalTime horaFin, Recurso recurso, Categoria categoria, Funcionario responsable) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.recurso = recurso;
        this.categoria = categoria;
        this.responsable = responsable;
        this.estado = "PENDIENTE";
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalTime horaInicio) { this.horaInicio = horaInicio; }

    public LocalTime getHoraFin() { return horaFin; }
    public void setHoraFin(LocalTime horaFin) { this.horaFin = horaFin; }

    public Recurso getRecurso() { return recurso; }
    public void setRecurso(Recurso recurso) { this.recurso = recurso; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public Funcionario getResponsable() { return responsable; }
    public void setResponsable(Funcionario responsable) { this.responsable = responsable; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public boolean seSolapaCon(Reserva otra) {
        if (!this.fecha.equals(otra.fecha)) return false;
        if (this.recurso == null || otra.recurso == null) return false;
        if (!this.recurso.getId().equals(otra.recurso.getId())) return false;
        return this.horaInicio.isBefore(otra.horaFin) && otra.horaInicio.isBefore(this.horaFin);
    }
}

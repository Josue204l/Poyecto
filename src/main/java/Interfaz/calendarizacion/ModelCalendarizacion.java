package Interfaz.calendarizacion;

import data.Data;
import logic.Categoria;
import logic.Recurso;
import logic.Reserva;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ModelCalendarizacion {

    // Obtiene las reservas activas en una fecha específica
    public List<Reserva> getReservasPorFecha(LocalDate fecha) {
        if (fecha == null) return Collections.emptyList();
        return Data.getInstancia().getReservas().stream()
                .filter(r -> r.getFecha() != null && r.getFecha().equals(fecha))
                .filter(r -> "ACTIVA".equalsIgnoreCase(r.getEstado()))
                .collect(Collectors.toList());
    }

    // Filtra recursos por categoría para armar las columnas de la matriz (Funcionalidad 6)
    public List<Recurso> getRecursosPorCategoria(Categoria categoria) {
        if (categoria == null) return Collections.emptyList();
        return Data.getInstancia().getRecursos().stream()
                .filter(r -> r.getCategoria() != null
                        && r.getCategoria().getId().equals(categoria.getId()))
                .collect(Collectors.toList());
    }

    // Busca si un recurso específico tiene reserva en una fecha y hora determinada
    public Reserva getReservaPorRecursoFechaYHora(String recursoId, LocalDate fecha, int hora) {
        return Data.getInstancia().getReservas().stream()
                .filter(r -> r.getFecha() != null && r.getFecha().equals(fecha))
                .filter(r -> "ACTIVA".equalsIgnoreCase(r.getEstado()))
                .filter(r -> r.getRecurso() != null && r.getRecurso().getId().equals(recursoId))
                .filter(r -> hora >= r.getHoraInicio().getHour() && hora < r.getHoraFin().getHour())
                .findFirst()
                .orElse(null);
    }

    public boolean agregarReserva(Reserva nueva) {
        for (Reserva existente : Data.getInstancia().getReservas()) {
            if ("ACTIVA".equalsIgnoreCase(existente.getEstado())
                    && !existente.getId().equals(nueva.getId())
                    && existente.seSolapaCon(nueva)) {
                return false;
            }
        }
        Data.getInstancia().getReservas().add(nueva);
        return true;
    }

    public boolean eliminarReserva(String id) {
        return Data.getInstancia().getReservas().removeIf(r -> r.getId().equals(id));
    }

    public void cambiarEstado(String id, String nuevoEstado) {
        Data.getInstancia().getReservas().stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .ifPresent(r -> r.setEstado(nuevoEstado));
    }

    public List<Reserva> getReservasPorFechaYRecurso(LocalDate fecha, String recursoId) {
        return Data.getInstancia().getReservas().stream()
                .filter(r -> r.getFecha() != null && r.getFecha().equals(fecha))
                .filter(r -> r.getRecurso() != null && r.getRecurso().getId().equals(recursoId))
                .collect(Collectors.toList());
    }

    public List<Reserva> getReservasPorRecurso(String recursoId) {
        return Data.getInstancia().getReservas().stream()
                .filter(r -> r.getRecurso() != null && r.getRecurso().getId().equals(recursoId))
                .collect(Collectors.toList());
    }

    public List<Recurso> getRecursos() {
        return Data.getInstancia().getRecursos();
    }

    public List<Categoria> getCategorias() {
        return Data.getInstancia().getCategorias();
    }

    public List<Reserva> getTodasLasReservas() {
        return Data.getInstancia().getReservas();
    }

    public String generarId() {
        return "RES-" + String.format("%06d", System.currentTimeMillis() % 1000000);
    }
}
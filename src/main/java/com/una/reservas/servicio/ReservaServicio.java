package com.una.reservas.servicio;

import com.una.reservas.dao.ReservaDAO;
import com.una.reservas.excepcion.EntidadNoEncontradaException;
import com.una.reservas.excepcion.RecursoNoDisponibleException;
import com.una.reservas.excepcion.ValidacionException;
import com.una.reservas.modelo.Categoria;
import com.una.reservas.modelo.Funcionario;
import com.una.reservas.modelo.Recurso;
import com.una.reservas.modelo.Reserva;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/** Gestiona el ciclo de vida completo de las reservas. */
public class ReservaServicio {

    private final ReservaDAO reservaDAO;
    private final RecursoServicio recursoServicio;

    public ReservaServicio(ReservaDAO reservaDAO, RecursoServicio recursoServicio) {
        this.reservaDAO = reservaDAO;
        this.recursoServicio = recursoServicio;
    }

    /**
     * Crea una nueva reserva asignando el primer recurso libre de cada categoría.
     * TODO: verificar disponibilidad, asignar recursos, persistir reserva
     */
    public Reserva crearReserva(Funcionario funcionario, String actividad, LocalDate fecha,
                                LocalTime horaInicio, LocalTime horaFin,
                                List<Categoria> categoriasRequeridas)
            throws RecursoNoDisponibleException, ValidacionException {
        // TODO: implementar
        return null;
    }

    /**
     * Cancela una reserva activa por su identificador.
     * TODO: cambiar estado a CANCELADA, persistir cambio
     */
    public void cancelarReserva(String idReserva)
            throws EntidadNoEncontradaException, ValidacionException {
        // TODO: implementar
    }

    /**
     * Lista todas las reservas de un funcionario específico.
     * TODO: filtrar reservas por funcionario
     */
    public List<Reserva> listarReservasDeFuncionario(String idFuncionario) {
        // TODO: implementar
        return null;
    }

    /**
     * Verifica si hay al menos un recurso libre por cada categoría en el rango horario dado.
     * TODO: cruzar reservas activas con los recursos de cada categoría
     *
     * @return lista de categorías sin disponibilidad (vacía si todo está disponible)
     */
    public List<Categoria> verificarDisponibilidad(LocalDate fecha, LocalTime horaInicio,
                                                   LocalTime horaFin,
                                                   List<Categoria> categorias) {
        // TODO: implementar
        return null;
    }

    /**
     * Retorna el primer recurso libre de la categoría dada en el rango horario indicado.
     * TODO: obtener recursos de la categoría, excluir los ya reservados en ese rango
     */
    public Recurso asignarPrimerRecursoDisponible(Categoria categoria, LocalDate fecha,
                                                  LocalTime horaInicio, LocalTime horaFin)
            throws RecursoNoDisponibleException {
        // TODO: implementar
        return null;
    }
}

package com.una.reservas.controlador;

import com.una.reservas.dto.DatosReservaDTO;
import com.una.reservas.excepcion.EntidadNoEncontradaException;
import com.una.reservas.excepcion.RecursoNoDisponibleException;
import com.una.reservas.excepcion.ValidacionException;
import com.una.reservas.modelo.Categoria;
import com.una.reservas.modelo.Funcionario;
import com.una.reservas.modelo.Reserva;
import com.una.reservas.servicio.IAExtraccionServicio;
import com.una.reservas.servicio.ReservaServicio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/** Controlador MVC para la gestión de reservas. */
public class ReservaControlador {

    private final ReservaServicio reservaServicio;
    private final IAExtraccionServicio iaExtraccionServicio;

    public ReservaControlador(ReservaServicio reservaServicio,
                              IAExtraccionServicio iaExtraccionServicio) {
        this.reservaServicio = reservaServicio;
        this.iaExtraccionServicio = iaExtraccionServicio;
    }

    /**
     * Crea una reserva con los datos del formulario.
     * TODO: delegar a servicio, actualizar vista
     */
    public Reserva crearReserva(Funcionario funcionario, String actividad, LocalDate fecha,
                                LocalTime horaInicio, LocalTime horaFin,
                                List<Categoria> categorias)
            throws RecursoNoDisponibleException, ValidacionException {
        // TODO: implementar
        return null;
    }

    /**
     * Cancela la reserva seleccionada en la vista.
     * TODO: delegar a servicio, refrescar tabla de reservas
     */
    public void cancelarReserva(String idReserva)
            throws EntidadNoEncontradaException, ValidacionException {
        // TODO: implementar
    }

    /**
     * Extrae datos de reserva desde texto libre usando IA y pre-rellena el formulario.
     * TODO: delegar a IAExtraccionServicio, mapear DTO a campos de la vista
     */
    public DatosReservaDTO extraerConIA(String frase) {
        // TODO: implementar
        return null;
    }

    /**
     * Carga las reservas del funcionario en la tabla de la vista.
     * TODO: delegar a servicio, notificar vista
     */
    public List<Reserva> listarReservasDeFuncionario(String idFuncionario) {
        // TODO: implementar
        return null;
    }
}

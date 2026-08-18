package com.una.reservas.controlador;

import com.una.reservas.excepcion.EntidadNoEncontradaException;
import com.una.reservas.excepcion.ValidacionException;
import com.una.reservas.modelo.Funcionario;
import com.una.reservas.servicio.FuncionarioServicio;
import java.util.List;

/** Controlador MVC para la gestión de funcionarios. */
public class FuncionarioControlador {

    private final FuncionarioServicio funcionarioServicio;

    public FuncionarioControlador(FuncionarioServicio funcionarioServicio) {
        this.funcionarioServicio = funcionarioServicio;
    }

    /** TODO: delegar a servicio, cargar resultado en tabla de la vista */
    public List<Funcionario> buscarPorNombre(String nombre) {
        // TODO: implementar
        return null;
    }

    /** TODO: delegar a servicio, mostrar mensaje de éxito/error en vista */
    public void agregar(Funcionario funcionario) throws ValidacionException {
        // TODO: implementar
    }

    /** TODO: delegar a servicio, refrescar tabla */
    public void modificar(Funcionario funcionario)
            throws EntidadNoEncontradaException, ValidacionException {
        // TODO: implementar
    }

    /** TODO: confirmar con usuario, delegar a servicio, refrescar tabla */
    public void eliminar(String id) throws EntidadNoEncontradaException {
        // TODO: implementar
    }
}

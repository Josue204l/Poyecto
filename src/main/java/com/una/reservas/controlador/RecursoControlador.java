package com.una.reservas.controlador;

import com.una.reservas.excepcion.EntidadNoEncontradaException;
import com.una.reservas.excepcion.ValidacionException;
import com.una.reservas.modelo.Categoria;
import com.una.reservas.modelo.Recurso;
import com.una.reservas.servicio.RecursoServicio;
import java.util.List;

/** Controlador MVC para la gestión de recursos físicos. */
public class RecursoControlador {

    private final RecursoServicio recursoServicio;

    public RecursoControlador(RecursoServicio recursoServicio) {
        this.recursoServicio = recursoServicio;
    }

    /** TODO: delegar a servicio, cargar resultado en tabla de la vista */
    public List<Recurso> buscarPorCategoria(Categoria categoria) {
        // TODO: implementar
        return null;
    }

    /** TODO: delegar a servicio, mostrar mensaje de éxito/error en vista */
    public void agregar(Recurso recurso) throws ValidacionException {
        // TODO: implementar
    }

    /** TODO: delegar a servicio, refrescar tabla */
    public void modificar(Recurso recurso)
            throws EntidadNoEncontradaException, ValidacionException {
        // TODO: implementar
    }

    /** TODO: confirmar con usuario, delegar a servicio, refrescar tabla */
    public void eliminar(String id) throws EntidadNoEncontradaException {
        // TODO: implementar
    }
}

package com.una.reservas.servicio;

import com.una.reservas.dao.RecursoDAO;
import com.una.reservas.excepcion.EntidadNoEncontradaException;
import com.una.reservas.excepcion.ValidacionException;
import com.una.reservas.modelo.Categoria;
import com.una.reservas.modelo.Recurso;
import java.util.List;

/** CRUD de recursos físicos reservables. */
public class RecursoServicio {

    private final RecursoDAO recursoDAO;

    public RecursoServicio(RecursoDAO recursoDAO) {
        this.recursoDAO = recursoDAO;
    }

    /**
     * Retorna todos los recursos que pertenecen a la categoría dada.
     * TODO: filtrar lista por categoría
     */
    public List<Recurso> buscarPorCategoria(Categoria categoria) {
        // TODO: implementar
        return null;
    }

    /**
     * Agrega un nuevo recurso.
     * TODO: validar campos, persistir con DAO
     */
    public void agregar(Recurso recurso) throws ValidacionException {
        // TODO: implementar
    }

    /**
     * Modifica un recurso existente.
     * TODO: validar, actualizar con DAO
     */
    public void modificar(Recurso recurso)
            throws EntidadNoEncontradaException, ValidacionException {
        // TODO: implementar
    }

    /**
     * Elimina un recurso por su identificador.
     * TODO: verificar que no esté en reservas activas
     */
    public void eliminar(String id) throws EntidadNoEncontradaException {
        // TODO: implementar
    }
}

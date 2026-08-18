package com.una.reservas.dao;

import com.una.reservas.excepcion.EntidadNoEncontradaException;
import java.util.List;
import java.util.Optional;

/**
 * Contrato genérico de persistencia CRUD.
 *
 * @param <T>  tipo de entidad
 * @param <ID> tipo del identificador
 */
public interface DAO<T, ID> {

    /** Persiste una nueva entidad. */
    void guardar(T entidad);

    /** Busca una entidad por su identificador. */
    Optional<T> buscarPorId(ID id);

    /** Retorna todas las entidades almacenadas. */
    List<T> buscarTodos();

    /** Actualiza los datos de una entidad existente. */
    void actualizar(T entidad) throws EntidadNoEncontradaException;

    /** Elimina la entidad con el identificador dado. */
    void eliminar(ID id) throws EntidadNoEncontradaException;
}

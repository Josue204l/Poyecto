package com.una.reservas.servicio;

import com.una.reservas.dao.CategoriaDAO;
import com.una.reservas.excepcion.EntidadNoEncontradaException;
import com.una.reservas.excepcion.ValidacionException;
import com.una.reservas.modelo.Categoria;
import java.util.List;

/** CRUD de categorías de recursos. */
public class CategoriaServicio {

    private final CategoriaDAO categoriaDAO;

    public CategoriaServicio(CategoriaDAO categoriaDAO) {
        this.categoriaDAO = categoriaDAO;
    }

    /**
     * Busca categorías cuya descripción contenga el texto dado.
     * TODO: filtrar lista por descripción
     */
    public List<Categoria> buscarPorDescripcion(String descripcion) {
        // TODO: implementar
        return null;
    }

    /**
     * Agrega una nueva categoría.
     * TODO: validar campos, persistir con DAO
     */
    public void agregar(Categoria categoria) throws ValidacionException {
        // TODO: implementar
    }

    /**
     * Modifica una categoría existente.
     * TODO: validar, actualizar con DAO
     */
    public void modificar(Categoria categoria)
            throws EntidadNoEncontradaException, ValidacionException {
        // TODO: implementar
    }

    /**
     * Elimina una categoría por su identificador.
     * TODO: verificar que no tenga recursos asociados antes de eliminar
     */
    public void eliminar(String id) throws EntidadNoEncontradaException {
        // TODO: implementar
    }
}

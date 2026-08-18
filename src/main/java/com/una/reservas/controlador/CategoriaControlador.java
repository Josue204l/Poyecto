package com.una.reservas.controlador;

import com.una.reservas.excepcion.EntidadNoEncontradaException;
import com.una.reservas.excepcion.ValidacionException;
import com.una.reservas.modelo.Categoria;
import com.una.reservas.servicio.CategoriaServicio;
import java.util.List;

/** Controlador MVC para la gestión de categorías de recursos. */
public class CategoriaControlador {

    private final CategoriaServicio categoriaServicio;

    public CategoriaControlador(CategoriaServicio categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    /** TODO: delegar a servicio, cargar resultado en tabla de la vista */
    public List<Categoria> buscarPorDescripcion(String descripcion) {
        // TODO: implementar
        return null;
    }

    /** TODO: delegar a servicio, mostrar mensaje de éxito/error en vista */
    public void agregar(Categoria categoria) throws ValidacionException {
        // TODO: implementar
    }

    /** TODO: delegar a servicio, refrescar tabla */
    public void modificar(Categoria categoria)
            throws EntidadNoEncontradaException, ValidacionException {
        // TODO: implementar
    }

    /** TODO: confirmar con usuario, delegar a servicio, refrescar tabla */
    public void eliminar(String id) throws EntidadNoEncontradaException {
        // TODO: implementar
    }
}

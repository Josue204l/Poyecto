package com.una.reservas.excepcion;

import com.una.reservas.modelo.Categoria;
import java.util.List;

/** Se lanza cuando no hay recursos disponibles para las categorías solicitadas. */
public class RecursoNoDisponibleException extends Exception {

    private final List<Categoria> categoriasNoDisponibles;

    public RecursoNoDisponibleException(List<Categoria> categoriasNoDisponibles) {
        super("Recursos no disponibles para las categorías indicadas.");
        this.categoriasNoDisponibles = categoriasNoDisponibles;
    }

    public List<Categoria> getCategoriasNoDisponibles() {
        return categoriasNoDisponibles;
    }
}

package Interfaz.recursos;

import logic.Categoria;
import logic.Recurso;
import java.util.List;

public class ControllerRecurso {
    private ModelRecurso model;

    public ControllerRecurso(ModelRecurso model) {
        this.model = model;
    }

    public List<Recurso> buscarPorCategoria(Categoria categoria) {
        return model.getRecursosPorCategoria(categoria);
    }

    public void guardar(Recurso recurso) throws Exception {
        if (recurso.getId() == null || recurso.getId().trim().isEmpty()) {
            throw new Exception("El ID o número de activo es obligatorio.");
        }
        if (recurso.getCategoria() == null) {
            throw new Exception("Debe seleccionar una categoría.");
        }
        model.guardar(recurso);
    }

    public boolean eliminar(String id) {
        return model.eliminar(id);
    }

    public List<Categoria> getCategorias() {
        return model.getCategorias();
    }
}
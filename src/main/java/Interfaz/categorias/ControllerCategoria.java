package Interfaz.categorias;

import logic.Categoria;

import java.util.List;

public class ControllerCategoria {

    private final ModelCategoria model;

    public ControllerCategoria(ModelCategoria model) {
        this.model = model;
    }

    public ModelCategoria getModel() {
        return model;
    }

    public void guardar(Categoria categoria) throws Exception {
        if (categoria.getId() == null || categoria.getId().trim().isEmpty()) {
            throw new Exception("El ID o código de la categoría es obligatorio.");
        }
        if (categoria.getNombre() == null || categoria.getNombre().trim().isEmpty()) {
            throw new Exception("El nombre de la categoría es obligatorio.");
        }
        model.guardar(categoria);
    }

    public boolean eliminar(String id) {
        return model.eliminar(id);
    }

    public List<Categoria> getCategorias() {
        return model.getCategorias();
    }
}
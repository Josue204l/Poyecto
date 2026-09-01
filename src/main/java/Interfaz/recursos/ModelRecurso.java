package Interfaz.recursos;

import data.Data;
import logic.Categoria;
import logic.Recurso;

import java.util.List;
import java.util.stream.Collectors;

public class ModelRecurso {
    private Recurso seleccionado;

    public ModelRecurso() {
        this.seleccionado = new Recurso();
    }

    public List<Recurso> getRecursos() {
        return Data.getInstancia().getRecursos();
    }

    public List<Recurso> getRecursosPorCategoria(Categoria categoria) {
        if (categoria == null) return getRecursos();
        return Data.getInstancia().getRecursos().stream()
                .filter(r -> r.getCategoria() != null
                        && r.getCategoria().getId().equals(categoria.getId()))
                .collect(Collectors.toList());
    }

    public List<Categoria> getCategorias() {
        return Data.getInstancia().getCategorias();
    }

    public Recurso getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Recurso seleccionado) {
        this.seleccionado = seleccionado;
    }

    public void guardar(Recurso recurso) throws Exception {
        List<Recurso> recursos = Data.getInstancia().getRecursos();
        int index = -1;
        for (int i = 0; i < recursos.size(); i++) {
            if (recursos.get(i).getId().equals(recurso.getId())) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            recursos.set(index, recurso);
        } else {
            recursos.add(recurso);
        }
    }

    public boolean eliminar(String id) {
        return Data.getInstancia().getRecursos().removeIf(r -> r.getId().equals(id));
    }
}
package Interfaz.recursos;

import data.Data;
import logic.Categoria;
import logic.Recurso;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;
import java.util.stream.Collectors;

public class ModelRecurso {

    public static final String SELECCIONADO = "seleccionado";
    public static final String LISTA = "lista";

    private Recurso seleccionado;
    private final PropertyChangeSupport propertyChangeSupport;

    public ModelRecurso() {
        this.seleccionado = new Recurso();
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public Recurso getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Recurso seleccionado) {
        Recurso old = this.seleccionado;
        this.seleccionado = seleccionado;
        propertyChangeSupport.firePropertyChange(SELECCIONADO, old, seleccionado);
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
        // Notificamos que la lista o el modelo cambiaron
        propertyChangeSupport.firePropertyChange(LISTA, null, recursos);
    }

    public boolean eliminar(String id) {
        boolean eliminado = Data.getInstancia().getRecursos().removeIf(r -> r.getId().equals(id));
        if (eliminado) {
            propertyChangeSupport.firePropertyChange(LISTA, null, Data.getInstancia().getRecursos());
        }
        return eliminado;
    }
}
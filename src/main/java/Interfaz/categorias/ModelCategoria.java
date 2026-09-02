package Interfaz.categorias;

import data.Data;
import logic.Categoria;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class ModelCategoria {

    public static final String SELECCIONADO = "seleccionado";
    public static final String LISTA = "lista";

    private Categoria seleccionado;
    private TableModelCategoria tableModel;
    private final PropertyChangeSupport propertyChangeSupport;

    public ModelCategoria() {
        this.seleccionado = new Categoria();
        this.tableModel = new TableModelCategoria(getCategorias());
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public Categoria getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Categoria seleccionado) {
        Categoria old = this.seleccionado;
        this.seleccionado = seleccionado;
        propertyChangeSupport.firePropertyChange(SELECCIONADO, old, seleccionado);
    }

    public TableModelCategoria getTableModel() {
        return tableModel;
    }

    public List<Categoria> getCategorias() {
        return Data.getInstancia().getCategorias();
    }

    public void guardar(Categoria categoria) throws Exception {
        List<Categoria> categorias = Data.getInstancia().getCategorias();
        int index = -1;
        for (int i = 0; i < categorias.size(); i++) {
            if (categorias.get(i).getId().equals(categoria.getId())) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            categorias.set(index, categoria);
        } else {
            categorias.add(categoria);
        }

        this.tableModel.setFilas(categorias);
        propertyChangeSupport.firePropertyChange(LISTA, null, categorias);
    }

    public boolean eliminar(String id) {
        boolean eliminado = Data.getInstancia().getCategorias().removeIf(c -> c.getId().equals(id));
        if (eliminado) {
            this.tableModel.setFilas(getCategorias());
            propertyChangeSupport.firePropertyChange(LISTA, null, getCategorias());
        }
        return eliminado;
    }
}
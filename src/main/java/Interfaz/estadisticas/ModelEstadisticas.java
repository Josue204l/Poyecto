package Interfaz.estadisticas;

import data.Data;
import logic.Recurso;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class ModelEstadisticas {

    public static final String LISTA = "lista";

    private TableModelEstadisticas tableModel;
    private final PropertyChangeSupport propertyChangeSupport;

    public ModelEstadisticas() {
        this.tableModel = new TableModelEstadisticas(getRecursosConUso());
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public TableModelEstadisticas getTableModel() {
        return tableModel;
    }

    public List<Recurso> getRecursosConUso() {
        return Data.getInstancia().getRecursos();
    }

    public void actualizarEstadisticas() {
        List<Recurso> datos = getRecursosConUso();
        this.tableModel.setFilas(datos);
        propertyChangeSupport.firePropertyChange(LISTA, null, datos);
    }
}
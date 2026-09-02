package Interfaz.actividades;

import data.Data;
import logic.Reserva;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class ModelActividades {

    public static final String SELECCIONADO = "seleccionado";
    public static final String LISTA = "lista";

    private Reserva seleccionado;
    private TableModelActividades tableModel;
    private final PropertyChangeSupport propertyChangeSupport;

    public ModelActividades() {
        this.seleccionado = new Reserva();
        this.tableModel = new TableModelActividades(getActividades());
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public Reserva getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Reserva seleccionado) {
        Reserva old = this.seleccionado;
        this.seleccionado = seleccionado;
        propertyChangeSupport.firePropertyChange(SELECCIONADO, old, seleccionado);
    }

    public TableModelActividades getTableModel() {
        return tableModel;
    }

    public List<Reserva> getActividades() {
        return Data.getInstancia().getReservas();
    }

    public void guardar(Reserva actividad) throws Exception {
        List<Reserva> lista = Data.getInstancia().getReservas();
        int index = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(actividad.getId())) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            lista.set(index, actividad);
        } else {
            lista.add(actividad);
        }

        this.tableModel.setFilas(lista);
        propertyChangeSupport.firePropertyChange(LISTA, null, lista);
    }

    public boolean eliminar(String id) {
        boolean eliminado = Data.getInstancia().getReservas().removeIf(a -> a.getId().equals(id));
        if (eliminado) {
            this.tableModel.setFilas(getActividades());
            propertyChangeSupport.firePropertyChange(LISTA, null, getActividades());
        }
        return eliminado;
    }
}
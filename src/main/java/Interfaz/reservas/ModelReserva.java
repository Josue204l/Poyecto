package Interfaz.reservas;

import data.Data;
import logic.Reserva;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class ModelReserva {

    public static final String SELECCIONADO = "seleccionado";
    public static final String LISTA = "lista";

    private Reserva seleccionado;
    private TableModelReserva tableModel;
    private final PropertyChangeSupport propertyChangeSupport;

    public ModelReserva() {
        this.seleccionado = new Reserva();
        this.tableModel = new TableModelReserva(getReservas());
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

    public TableModelReserva getTableModel() {
        return tableModel;
    }

    public List<Reserva> getReservas() {
        return Data.getInstancia().getReservas();
    }

    public void guardar(Reserva reserva) throws Exception {
        List<Reserva> lista = Data.getInstancia().getReservas();
        int index = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(reserva.getId())) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            lista.set(index, reserva);
        } else {
            lista.add(reserva);
        }

        this.tableModel.setFilas(lista);
        propertyChangeSupport.firePropertyChange(LISTA, null, lista);
    }

    public String generarId() {
        return "RES-" + System.currentTimeMillis();
    }

    public boolean eliminar(String id) {
        boolean eliminado = Data.getInstancia().getReservas().removeIf(r -> r.getId().equals(id));
        if (eliminado) {
            this.tableModel.setFilas(getReservas());
            propertyChangeSupport.firePropertyChange(LISTA, null, getReservas());
        }
        return eliminado;
    }
}
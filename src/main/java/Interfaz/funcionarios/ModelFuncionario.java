package Interfaz.funcionarios;

import data.Data;
import logic.Funcionario;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class ModelFuncionario {

    public static final String SELECCIONADO = "seleccionado";
    public static final String LISTA = "lista";

    private Funcionario seleccionado;
    private TableModelFuncionario tableModel;
    private final PropertyChangeSupport propertyChangeSupport;

    public ModelFuncionario() {
        this.seleccionado = new Funcionario();
        this.tableModel = new TableModelFuncionario(getFuncionarios());
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public Funcionario getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Funcionario seleccionado) {
        Funcionario old = this.seleccionado;
        this.seleccionado = seleccionado;
        propertyChangeSupport.firePropertyChange(SELECCIONADO, old, seleccionado);
    }

    public TableModelFuncionario getTableModel() {
        return tableModel;
    }

    public List<Funcionario> getFuncionarios() {
        return Data.getInstancia().getFuncionarios();
    }

    public void guardar(Funcionario funcionario) throws Exception {
        List<Funcionario> funcionarios = Data.getInstancia().getFuncionarios();
        int index = -1;
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId().equals(funcionario.getId())) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            funcionarios.set(index, funcionario);
        } else {
            funcionarios.add(funcionario);
        }

        // Actualizamos las filas de la tabla
        this.tableModel.setFilas(funcionarios);
        propertyChangeSupport.firePropertyChange(LISTA, null, funcionarios);
    }

    public boolean eliminar(String id) {
        boolean eliminado = Data.getInstancia().getFuncionarios().removeIf(f -> f.getId().equals(id));
        if (eliminado) {
            this.tableModel.setFilas(getFuncionarios());
            propertyChangeSupport.firePropertyChange(LISTA, null, getFuncionarios());
        }
        return eliminado;
    }
}
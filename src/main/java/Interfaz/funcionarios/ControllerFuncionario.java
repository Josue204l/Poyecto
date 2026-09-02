package Interfaz.funcionarios;

import logic.Funcionario;

import java.util.List;

public class ControllerFuncionario {

    private final ModelFuncionario model;

    public ControllerFuncionario(ModelFuncionario model) {
        this.model = model;
    }

    public ModelFuncionario getModel() {
        return model;
    }

    public void guardar(Funcionario funcionario) throws Exception {
        if (funcionario.getId() == null || funcionario.getId().trim().isEmpty()) {
            throw new Exception("El ID o cédula del funcionario es obligatorio.");
        }
        if (funcionario.getNombre() == null || funcionario.getNombre().trim().isEmpty()) {
            throw new Exception("El nombre del funcionario es obligatorio.");
        }
        model.guardar(funcionario);
    }

    public boolean eliminar(String id) {
        return model.eliminar(id);
    }

    public List<Funcionario> getFuncionarios() {
        return model.getFuncionarios();
    }
}
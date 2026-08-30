package data;

import logic.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private static Data instancia;
    private List<Funcionario> funcionarios;

    private Data() {
        funcionarios = XmlPersister.cargarFuncionarios();
        if (funcionarios == null) {
            funcionarios = new ArrayList<>();
            funcionarios.add(new Funcionario("1234", "123", "ADMIN", "Administrador", ""));
            XmlPersister.guardarFuncionarios(funcionarios);
        }
    }

    public static Data getInstancia() {
        if (instancia == null) instancia = new Data();
        return instancia;
    }

    public List<Funcionario> getFuncionarios() { return funcionarios; }

    public void guardarFuncionarios() {
        XmlPersister.guardarFuncionarios(funcionarios);
    }
}

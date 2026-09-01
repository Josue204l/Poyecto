package data;

import logic.Categoria;
import logic.Funcionario;
import logic.Recurso;
import logic.Reserva;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static Data instancia;
    private List<Funcionario> funcionarios;
    private List<Reserva> reservas;
    private List<Recurso> recursos;
    private List<Categoria> categorias;

    private Data() {
        funcionarios = XmlPersister.cargarFuncionarios();
        if (funcionarios == null) {
            funcionarios = new ArrayList<>();
            funcionarios.add(new Funcionario("1234", "123", "ADMIN", "Administrador", ""));
            XmlPersister.guardarFuncionarios(funcionarios);
        }
        reservas = new ArrayList<>();
        recursos = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public static Data getInstancia() {
        if (instancia == null) instancia = new Data();
        return instancia;
    }

    public List<Funcionario> getFuncionarios() { return funcionarios; }
    public void guardarFuncionarios() { XmlPersister.guardarFuncionarios(funcionarios); }

    public List<Reserva> getReservas() { return reservas; }
    public List<Recurso> getRecursos() { return recursos; }
    public List<Categoria> getCategorias() { return categorias; }
}

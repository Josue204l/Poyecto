package logic;

import data.Data;
import data.XmlPersister;
import java.util.List;

public class Service {

    private static Service instance;
    private Data data;

    private Service() {
        this.data = Data.getInstancia();
    }

    public static synchronized Service instance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    public Data getData() {
        return data;
    }

    public void store() {
        if (data != null && data.getFuncionarios() != null) {
            XmlPersister.guardarFuncionarios(data.getFuncionarios());
        }
    }

    public Usuario login(String id, String clave) {
        if (data != null && data.getFuncionarios() != null) {
            for (Funcionario f : data.getFuncionarios()) {
                if (f.getId().equals(id) && f.getClave().equals(clave)) {
                    return f;
                }
            }
        }
        return null;
    }

    public List<Funcionario> getFuncionarios() { return data.getFuncionarios(); }
    public List<Categoria> getCategorias() { return data.getCategorias(); }
    public List<Recurso> getRecursos() { return data.getRecursos(); }
    public List<Reserva> getReservas() { return data.getReservas(); }
}
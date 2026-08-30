package logic;

import data.Data;

public class Service {

    private static Service instancia;

    private Service() {}

    public static Service getInstancia() {
        if (instancia == null) instancia = new Service();
        return instancia;
    }

    public Usuario login(String id, String clave) {
        for (Funcionario f : Data.getInstancia().getFuncionarios()) {
            if (f.getId().equals(id) && f.getClave().equals(clave)) return f;
        }
        return null;
    }

    public boolean cambiarClave(Usuario usuario, String claveActual, String claveNueva) {
        if (!usuario.getClave().equals(claveActual)) return false;
        usuario.setClave(claveNueva);
        Data.getInstancia().guardarFuncionarios();
        return true;
    }
}

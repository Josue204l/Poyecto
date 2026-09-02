package Interfaz.cambiarclave;

import data.Data;
import logic.Usuario;

public class ModelCambiarClave {

    private final Usuario usuario;

    public ModelCambiarClave(Usuario usuario) {
        this.usuario = usuario;
    }

    public void cambiar(String claveActual, String claveNueva, String claveConfirmar) throws Exception {
        if (!usuario.getClave().equals(claveActual)) {
            throw new Exception("La clave actual es incorrecta.");
        }
        if (claveNueva == null || claveNueva.trim().isEmpty()) {
            throw new Exception("La nueva clave no puede estar vacía.");
        }
        if (!claveNueva.equals(claveConfirmar)) {
            throw new Exception("La nueva clave y su confirmación no coinciden.");
        }
        usuario.setClave(claveNueva);
        Data.getInstancia().guardarFuncionarios();
    }
}

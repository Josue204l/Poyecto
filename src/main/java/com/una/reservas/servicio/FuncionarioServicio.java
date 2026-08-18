package com.una.reservas.servicio;

import com.una.reservas.dao.UsuarioDAO;
import com.una.reservas.excepcion.EntidadNoEncontradaException;
import com.una.reservas.excepcion.ValidacionException;
import com.una.reservas.modelo.Funcionario;
import java.util.List;

/** CRUD de funcionarios del sistema. */
public class FuncionarioServicio {

    private final UsuarioDAO usuarioDAO;

    public FuncionarioServicio(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    /**
     * Busca un funcionario por su identificador.
     * TODO: delegar a DAO, lanzar EntidadNoEncontradaException si no existe
     */
    public Funcionario buscarPorId(String id) throws EntidadNoEncontradaException {
        // TODO: implementar
        return null;
    }

    /**
     * Busca funcionarios cuyo nombre contenga el texto dado.
     * TODO: filtrar lista de usuarios por nombre
     */
    public List<Funcionario> buscarPorNombre(String nombre) {
        // TODO: implementar
        return null;
    }

    /**
     * Agrega un nuevo funcionario al sistema.
     * TODO: validar campos, persistir con DAO
     */
    public void agregar(Funcionario funcionario) throws ValidacionException {
        // TODO: implementar
    }

    /**
     * Modifica los datos de un funcionario existente.
     * TODO: validar, actualizar con DAO
     */
    public void modificar(Funcionario funcionario)
            throws EntidadNoEncontradaException, ValidacionException {
        // TODO: implementar
    }

    /**
     * Elimina un funcionario por su identificador.
     * TODO: verificar que no tenga reservas activas antes de eliminar
     */
    public void eliminar(String id) throws EntidadNoEncontradaException {
        // TODO: implementar
    }
}

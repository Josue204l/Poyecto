package com.una.reservas.dao;

import com.una.reservas.excepcion.EntidadNoEncontradaException;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;
import java.util.Optional;

/**
 * Implementación genérica de persistencia en archivo XML usando JAXB.
 * Cada subclase define el tipo concreto, la ruta del archivo y cómo
 * obtener el ID de una entidad.
 *
 * @param <T>  tipo de entidad
 * @param <ID> tipo del identificador
 */
public abstract class XMLDAOAbstracto<T, ID> implements DAO<T, ID> {

    /** Ruta al archivo XML donde se persisten las entidades. */
    protected final String rutaArchivo;

    /** Clase concreta de la entidad para inicializar JAXBContext. */
    protected final Class<T> tipoClase;

    protected XMLDAOAbstracto(String rutaArchivo, Class<T> tipoClase) {
        this.rutaArchivo = rutaArchivo;
        this.tipoClase = tipoClase;
    }

    /**
     * Retorna el ID de la entidad dada.
     * Cada subclase implementa la extracción del identificador.
     */
    protected abstract ID obtenerIdDeEntidad(T entidad);

    /**
     * Crea un JAXBContext para el tipo de entidad.
     * TODO: inicializar con las clases wrapper de lista si aplica
     */
    protected JAXBContext crearContexto() throws JAXBException {
        // TODO: implementar
        return null;
    }

    /**
     * Lee todas las entidades desde el archivo XML.
     * TODO: usar Unmarshaller para deserializar la lista
     */
    protected List<T> leerDesdeArchivo() {
        // TODO: implementar
        return null;
    }

    /**
     * Escribe la lista completa de entidades al archivo XML.
     * TODO: usar Marshaller para serializar la lista
     */
    protected void escribirEnArchivo(List<T> entidades) {
        // TODO: implementar
    }

    @Override
    public void guardar(T entidad) {
        // TODO: leer lista, agregar entidad, escribir lista
    }

    @Override
    public Optional<T> buscarPorId(ID id) {
        // TODO: leer lista, filtrar por ID
        return Optional.empty();
    }

    @Override
    public List<T> buscarTodos() {
        // TODO: leer lista desde archivo
        return null;
    }

    @Override
    public void actualizar(T entidad) throws EntidadNoEncontradaException {
        // TODO: leer lista, reemplazar entidad con mismo ID, escribir lista
    }

    @Override
    public void eliminar(ID id) throws EntidadNoEncontradaException {
        // TODO: leer lista, remover entidad con ese ID, escribir lista
    }
}

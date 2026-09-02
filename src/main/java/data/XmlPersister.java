package data;

import logic.Categoria;
import logic.Funcionario;
import logic.Recurso;
import logic.Reserva;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.List;

public class XmlPersister {

    private static final String DIR = "datos/";
    private static final String FUNCIONARIOS = DIR + "funcionarios.xml";
    private static final String RECURSOS = DIR + "recursos.xml";
    private static final String CATEGORIAS = DIR + "categorias.xml";
    private static final String RESERVAS = DIR + "reservas.xml";

    @SuppressWarnings("unchecked")
    public static List<Funcionario> cargarFuncionarios() { return cargar(FUNCIONARIOS); }
    public static void guardarFuncionarios(List<Funcionario> lista) { guardar(FUNCIONARIOS, lista); }

    @SuppressWarnings("unchecked")
    public static List<Recurso> cargarRecursos() { return cargar(RECURSOS); }
    public static void guardarRecursos(List<Recurso> lista) { guardar(RECURSOS, lista); }

    @SuppressWarnings("unchecked")
    public static List<Categoria> cargarCategorias() { return cargar(CATEGORIAS); }
    public static void guardarCategorias(List<Categoria> lista) { guardar(CATEGORIAS, lista); }

    @SuppressWarnings("unchecked")
    public static List<Reserva> cargarReservas() { return cargar(RESERVAS); }
    public static void guardarReservas(List<Reserva> lista) { guardar(RESERVAS, lista); }

    @SuppressWarnings("unchecked")
    private static <T> List<T> cargar(String ruta) {
        File archivo = new File(ruta);
        if (!archivo.exists()) return null;
        try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(archivo)))) {
            return (List<T>) decoder.readObject();
        } catch (Exception e) {
            return null;
        }
    }

    private static void guardar(String ruta, Object objeto) {
        new File(DIR).mkdirs();
        try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(ruta)))) {
            encoder.writeObject(objeto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

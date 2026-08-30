package data;

import logic.Funcionario;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.List;

public class XmlPersister {

    private static final String RUTA = "datos/funcionarios.xml";

    @SuppressWarnings("unchecked")
    public static List<Funcionario> cargarFuncionarios() {
        File archivo = new File(RUTA);
        if (!archivo.exists()) return null;
        try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(archivo)))) {
            return (List<Funcionario>) decoder.readObject();
        } catch (Exception e) {
            return null;
        }
    }

    public static void guardarFuncionarios(List<Funcionario> lista) {
        new File("datos").mkdirs();
        try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(RUTA)))) {
            encoder.writeObject(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

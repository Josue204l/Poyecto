import javax.swing.*;
import java.awt.Color; // Necesario para la constante BACKGROUND_ERROR

import Interfaz.login.LoginView;

import Interfaz.actividades.actividadesView;
import Interfaz.actividades.ModelActividades;
import Interfaz.actividades.ControllerActividades;

import Interfaz.calendarizacion.calendarizacionView;
import Interfaz.calendarizacion.ModelCalendarizacion;
import Interfaz.calendarizacion.ControllerCalendarizacion;

import Interfaz.categorias.ControllerCategoria;
import Interfaz.categorias.ModelCategoria;
import Interfaz.categorias.categoriasView;

import Interfaz.funcionarios.ControllerFuncionario;
import Interfaz.funcionarios.ModelFuncionario;
import Interfaz.funcionarios.funcionariosView;

import Interfaz.recursos.recursosView;
import Interfaz.recursos.ModelRecurso;
import Interfaz.recursos.ControllerRecurso;

public class Application {

    // Declaración de la constante de color
    public static final Color BACKGROUND_ERROR = new Color(102, 133, 255);

    public static void main(String[] args) {
        // Establecer el estilo visual (Look and Feel)
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            System.err.println("No se pudo cargar el tema visual Nimbus.");
        }

        // 1. Inicialización de la arquitectura MVC para cada módulo

        // Actividades
        ModelActividades modelAct = new ModelActividades();
        actividadesView viewAct = new actividadesView();
        ControllerActividades ctrlAct = new ControllerActividades(viewAct, modelAct);

        // Calendarización
        ModelCalendarizacion modelCal = new ModelCalendarizacion();
        calendarizacionView viewCal = new calendarizacionView();
        ControllerCalendarizacion ctrlCal = new ControllerCalendarizacion(viewCal, modelCal);

        // Categorías
        ModelCategoria modelCat = new ModelCategoria();
        categoriasView viewCat = new categoriasView();
        ControllerCategoria ctrlCat = new ControllerCategoria(viewCat, modelCat);

        // Funcionarios
        ModelFuncionario modelFunc = new ModelFuncionario();
        funcionariosView viewFunc = new funcionariosView();
        ControllerFuncionario ctrlFunc = new ControllerFuncionario(viewFunc, modelFunc);

        // Recursos
        ModelRecurso modelRec = new ModelRecurso();
        recursosView viewRec = new recursosView();
        ControllerRecurso ctrlRec = new ControllerRecurso(viewRec, modelRec);

        // 2. Configuración de la Ventana Principal y el panel de pestañas
        JFrame window = new JFrame();
        JTabbedPane tabbedPane = new JTabbedPane();
        window.setContentPane(tabbedPane);

        // Asumiendo que cada vista tiene un método getPanel() que retorna su JPanel principal

        tabbedPane.addTab("Recursos", viewRec.getPanel());

        // 3. Propiedades Finales de la Ventana
        window.setSize(800, 600);
        window.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Sistema de Gestión sin tener en cuenta el tipo de usuario"); // Cambiado a un título más general
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}

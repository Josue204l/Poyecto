package Interfaz.estadisticas;

import logic.Recurso;

import java.util.List;

public class ControllerEstadisticas {

    private final ModelEstadisticas model;

    public ControllerEstadisticas(ModelEstadisticas model) {
        this.model = model;
    }

    public ModelEstadisticas getModel() {
        return model;
    }

    public void cargarDatos() {
        model.actualizarEstadisticas();
    }

    public List<Recurso> obtenerReporte() {
        return model.getRecursosConUso();
    }
}
package Interfaz.actividades;

import logic.Reserva;

import java.util.List;

public class ControllerActividades {

    private final ModelActividades model;

    public ControllerActividades(ModelActividades model) {
        this.model = model;
    }

    public ModelActividades getModel() {
        return model;
    }

    public void guardar(Reserva actividad) throws Exception {
        if (actividad.getId() == null || actividad.getId().trim().isEmpty()) {
            throw new Exception("El ID de la actividad es obligatorio.");
        }
        model.guardar(actividad);
    }

    public boolean eliminar(String id) {
        return model.eliminar(id);
    }

    public List<Reserva> getActividades() {
        return model.getActividades();
    }
}
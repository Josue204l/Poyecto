package com.una.reservas.vista;

import com.una.reservas.controlador.EstadisticaControlador;
import com.una.reservas.dto.EstadisticaActividadDTO;
import com.una.reservas.dto.EstadisticaRecursoDTO;
import org.jfree.chart.ChartPanel;
import javax.swing.*;
import java.util.List;

/** Panel de estadísticas con gráficos de barras (JFreeChart). */
public class EstadisticaView extends JPanel {

    private JTextField campoDesdeFecha;
    private JTextField campoHastaFecha;
    private JButton botonGenerarRecursos;
    private JButton botonGenerarActividades;
    private ChartPanel panelGrafico;

    private final EstadisticaControlador controlador;

    public EstadisticaView(EstadisticaControlador controlador) {
        this.controlador = controlador;
        inicializarComponentes();
        configurarEventos();
    }

    /** TODO: construir filtros de rango de fechas y área del gráfico */
    private void inicializarComponentes() {
        // TODO: implementar
    }

    /** TODO: asociar botones a métodos del controlador */
    private void configurarEventos() {
        // TODO: implementar
    }

    /**
     * Renderiza un gráfico de barras con estadísticas de recursos.
     * TODO: crear CategoryDataset, construir BarChart con JFreeChart, actualizar panelGrafico
     */
    public void mostrarGraficoRecursos(List<EstadisticaRecursoDTO> datos) {
        // TODO: implementar
    }

    /**
     * Renderiza un gráfico de barras con estadísticas de actividades por semana.
     * TODO: crear CategoryDataset, construir BarChart con JFreeChart, actualizar panelGrafico
     */
    public void mostrarGraficoActividades(List<EstadisticaActividadDTO> datos) {
        // TODO: implementar
    }
}

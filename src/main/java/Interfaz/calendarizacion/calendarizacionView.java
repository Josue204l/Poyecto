package Interfaz.calendarizacion;

import logic.Categoria;
import logic.Reserva;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class calendarizacionView implements PropertyChangeListener {

    private JPanel panel;
    private JTable table1;
    private JTextField textField1;
    private JButton button1;
    private JComboBox<Categoria> comboBox1;
    private JButton btnCargar;
    private JButton btnImprimir;

    private ControllerCalendarizacion controller;
    private ModelCalendarizacion model;

    private static final String[] COLUMNAS = {"ID", "Título", "Fecha", "Hora Inicio", "Hora Fin", "Recurso", "Categoría", "Estado"};
    private static final DateTimeFormatter FMT_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FMT_HORA = DateTimeFormatter.ofPattern("HH:mm");

    public calendarizacionView() {
        if (btnCargar != null) {
            btnCargar.addActionListener(e -> {
                if (controller != null) controller.filtrar();
            });
        }
    }

    public JPanel getMainPanel() {
        return panel; // Ahora 'panel' estará vinculado correctamente al .form
    }

    public JTextField getTxtFecha() {
        return textField1;
    }

    public JComboBox<Categoria> getCmbCategoria() {
        return comboBox1;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public JTable getTblCalendarizacion() {
        return table1;
    }

    public void setController(ControllerCalendarizacion controller) {
        this.controller = controller;
    }

    public void setModel(ModelCalendarizacion model) {
        this.model = model;
        this.model.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (ModelCalendarizacion.CATEGORIAS.equals(evt.getPropertyName())) {
            DefaultComboBoxModel<Categoria> comboModel = new DefaultComboBoxModel<>();
            if (model != null && model.getCategorias() != null) {
                for (Categoria cat : model.getCategorias()) {
                    comboModel.addElement(cat);
                }
            }
            if (comboBox1 != null) {
                comboBox1.setModel(comboModel);
            }
        } else if (ModelCalendarizacion.RESERVAS.equals(evt.getPropertyName())) {
            if (model != null) {
                actualizarTabla(model.getReservas());
            }
        }

        if (panel != null) {
            panel.revalidate();
            panel.repaint();
        }
    }

    private void actualizarTabla(List<Reserva> reservas) {
        if (table1 == null) return;

        DefaultTableModel tableModel = new DefaultTableModel(COLUMNAS, 0) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        if (reservas != null) {
            for (Reserva r : reservas) {
                tableModel.addRow(new Object[]{
                        r.getId(),
                        r.getTitulo(),
                        r.getFecha() != null ? r.getFecha().format(FMT_FECHA) : "",
                        r.getHoraInicio() != null ? r.getHoraInicio().format(FMT_HORA) : "",
                        r.getHoraFin() != null ? r.getHoraFin().format(FMT_HORA) : "",
                        r.getRecurso() != null ? r.getRecurso().getNombre() : "",
                        r.getCategoria() != null ? r.getCategoria().getNombre() : "",
                        r.getEstado()
                });
            }
        }
        table1.setModel(tableModel);
    }

}
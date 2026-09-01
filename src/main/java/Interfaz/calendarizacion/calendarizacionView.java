package Interfaz.calendarizacion;

import logic.Categoria;
import javax.swing.*;

public class calendarizacionView {

    private JTable table1;
    private JTextField textField1;
    private JButton button1;
    private JComboBox<Categoria> comboBox1;
    private JButton btnCargar;
    private JButton btnImprimir;

    public calendarizacionView() {

    }


    public JPanel getMainPanel() { return null; }
    public JTextField getTxtFecha() { return textField1; }
    public JComboBox<Categoria> getCmbCategoria() { return comboBox1; }
    public JButton getBtnCargar() { return btnCargar; }
    public JButton getBtnImprimir() { return btnImprimir; }
    public JTable getTblCalendarizacion() { return table1; }
}
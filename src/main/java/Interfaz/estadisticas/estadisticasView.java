package Interfaz.estadisticas;

import javax.swing.*;

public class estadisticasView {
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JButton button2;
    private JButton cargarButton;
    private JTable table1;

    public JPanel getMainPanel() { return panel1 != null ? panel1 : new JPanel(); }
    public JTable getTable() { return table1; }
    public JTextField getTxtFechaDesde() { return textField1; }
    public JTextField getTxtFechaHasta() { return textField2; }
    public JButton getBtnFiltrar() { return button1; }
    public JButton getBtnExportar() { return button2; }
    public JButton getCargarButton() { return cargarButton; }
}

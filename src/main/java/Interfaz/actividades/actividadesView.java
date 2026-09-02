package Interfaz.actividades;

import javax.swing.*;

public class actividadesView {
    private JTextField textField1;
    private JButton button1;
    private JTable table1;

    public JPanel getMainPanel() { return new JPanel(); }
    public JTable getTable() { return table1; }
    public JTextField getTxtBuscar() { return textField1; }
    public JButton getBtnBuscar() { return button1; }
}

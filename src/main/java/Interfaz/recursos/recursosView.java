package Interfaz.recursos;

import javax.swing.*;

public class recursosView {
    private JPanel recursos;
    private JComboBox category;
    private JTextField descrip;
    private JButton buscarButton;
    private JButton imprimirButton;
    private JPanel recurso;
    private JLabel id;
    private JLabel Categoria;
    private JButton Guardar;
    private JButton limpiarButton;
    private JComboBox categorias;
    private JTextField idtext;
    private JTextField descripcion;
    private JButton borrarButton;

    public recursosView() {}

    public JPanel getPanel() { return recursos != null ? recursos : new JPanel(); }
    public JPanel getMainPanel() { return getPanel(); }
    public JComboBox getCmbFiltroCategoria() { return category; }
    public JComboBox getCmbCategoria() { return categorias; }
    public JTextField getTxtBuscar() { return descrip; }
    public JTextField getTxtId() { return idtext; }
    public JTextField getTxtDescripcion() { return descripcion; }
    public JButton getBuscarButton() { return buscarButton; }
    public JButton getImprimirButton() { return imprimirButton; }
    public JButton getGuardarButton() { return Guardar; }
    public JButton getLimpiarButton() { return limpiarButton; }
    public JButton getBorrarButton() { return borrarButton; }
}

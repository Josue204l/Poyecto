package Interfaz.estadisticas;

import logic.Recurso;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TableModelEstadisticas extends AbstractTableModel {

    public static final int CATEGORIA = 0;
    public static final int RECURSO = 1;
    public static final int CANTIDAD_RESERVAS = 2;

    private final String[] cols = {"Categoría", "Recurso / Elemento", "Total Reservas"};
    private List<Recurso> filas;

    public TableModelEstadisticas(List<Recurso> filas) {
        this.filas = filas;
    }

    public List<Recurso> getFilas() {
        return filas;
    }

    public void setFilas(List<Recurso> filas) {
        this.filas = filas;
        fireTableDataChanged();
    }

    public Recurso getRowAt(int row) {
        if (filas != null && row >= 0 && row < filas.size()) {
            return filas.get(row);
        }
        return null;
    }

    @Override
    public int getRowCount() {
        return filas != null ? filas.size() : 0;
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public String getColumnName(int col) {
        return cols[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        Recurso r = filas.get(row);
        switch (col) {
            case CATEGORIA:
                return r.getCategoria() != null ? r.getCategoria().getNombre() : "Sin Categoría";
            case RECURSO:
                return r.getNombre();
            case CANTIDAD_RESERVAS:
                return r.getId(); // Representación del dato estadístico/frecuencia
            default:
                return "";
        }
    }
}
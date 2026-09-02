package Interfaz.reservas;

import logic.Reserva;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TableModelReserva extends AbstractTableModel {

    public static final int ID = 0;
    public static final int TITULO = 1;
    public static final int FECHA = 2;
    public static final int RECURSO = 3;
    public static final int RESPONSABLE = 4;
    public static final int ESTADO = 5;

    private final String[] cols = {"ID", "Título", "Fecha", "Recurso", "Responsable", "Estado"};
    private List<Reserva> filas;

    public TableModelReserva(List<Reserva> filas) {
        this.filas = filas;
    }

    public List<Reserva> getFilas() {
        return filas;
    }

    public void setFilas(List<Reserva> filas) {
        this.filas = filas;
        fireTableDataChanged();
    }

    public Reserva getRowAt(int row) {
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
        Reserva r = filas.get(row);
        switch (col) {
            case ID:
                return r.getId();
            case TITULO:
                return r.getTitulo();
            case FECHA:
                return r.getFecha() != null ? r.getFecha().toString() : "";
            case RECURSO:
                return r.getRecurso() != null ? r.getRecurso().getDescripcion() : "";
            case RESPONSABLE:
                return r.getResponsable() != null ? r.getResponsable().getNombre() : "";
            case ESTADO:
                return r.getEstado();
            default:
                return "";
        }
    }
}
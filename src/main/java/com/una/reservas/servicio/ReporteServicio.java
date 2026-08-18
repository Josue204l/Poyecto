package com.una.reservas.servicio;

import java.io.File;
import java.util.List;

/**
 * Genera reportes en formato PDF usando OpenPDF.
 */
public class ReporteServicio {

    /**
     * Genera un archivo PDF con una tabla de datos.
     * TODO: crear Document de OpenPDF, agregar título, construir PdfPTable con encabezados y filas
     *
     * @param titulo      título del reporte
     * @param encabezados nombres de columnas
     * @param filas       datos de cada fila
     * @return archivo PDF generado en directorio temporal
     */
    public File generarReportePDF(String titulo, List<String> encabezados,
                                  List<List<String>> filas) {
        // TODO: implementar
        return null;
    }
}

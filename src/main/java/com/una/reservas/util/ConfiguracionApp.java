package com.una.reservas.util;

/** Constantes globales de configuración de la aplicación. */
public final class ConfiguracionApp {

    private ConfiguracionApp() {}

    // Rutas de archivos XML de datos
    public static final String DIRECTORIO_DATOS = "src/main/resources/datos/";
    public static final String RUTA_XML_USUARIOS    = DIRECTORIO_DATOS + "usuarios.xml";
    public static final String RUTA_XML_CATEGORIAS  = DIRECTORIO_DATOS + "categorias.xml";
    public static final String RUTA_XML_RECURSOS    = DIRECTORIO_DATOS + "recursos.xml";
    public static final String RUTA_XML_RESERVAS    = DIRECTORIO_DATOS + "reservas.xml";

    // Configuración API de IA (Anthropic)
    public static final String IA_API_URL     = "https://api.anthropic.com/v1/messages";
    public static final String IA_API_KEY     = "<ANTHROPIC_API_KEY>";
    public static final String IA_MODELO      = "claude-3-5-haiku-20241022";
    public static final int    IA_MAX_TOKENS  = 1024;
}

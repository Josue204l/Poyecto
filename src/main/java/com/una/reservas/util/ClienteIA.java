package com.una.reservas.util;

/**
 * Wrapper HTTP para invocar la API de Anthropic (Claude).
 * Usa java.net.http.HttpClient (Java 11+).
 */
public class ClienteIA {

    private final String apiUrl;
    private final String apiKey;
    private final String modelo;

    public ClienteIA() {
        this.apiUrl  = ConfiguracionApp.IA_API_URL;
        this.apiKey  = ConfiguracionApp.IA_API_KEY;
        this.modelo  = ConfiguracionApp.IA_MODELO;
    }

    /**
     * Envía un mensaje al LLM y retorna la respuesta en texto plano.
     * TODO: construir JSON body con modelo y messages, enviar POST con HttpClient,
     *       parsear campo content[0].text de la respuesta JSON
     *
     * @param prompt texto del prompt a enviar
     * @return respuesta del modelo como String
     */
    public String enviarMensaje(String prompt) {
        // TODO: implementar
        return null;
    }
}

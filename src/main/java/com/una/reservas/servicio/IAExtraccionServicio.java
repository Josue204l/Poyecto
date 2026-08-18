package com.una.reservas.servicio;

import com.una.reservas.dto.DatosReservaDTO;
import com.una.reservas.util.ClienteIA;

/**
 * Extrae datos de reserva desde una frase en lenguaje natural
 * invocando la API de Anthropic vía {@link ClienteIA}.
 */
public class IAExtraccionServicio {

    private final ClienteIA clienteIA;

    public IAExtraccionServicio(ClienteIA clienteIA) {
        this.clienteIA = clienteIA;
    }

    /**
     * Envía la frase al LLM y parsea la respuesta JSON en un {@link DatosReservaDTO}.
     * TODO: construir prompt, llamar clienteIA.enviarMensaje(), parsear JSON de respuesta
     *
     * @param fraseNaturalLenguaje texto libre del usuario describiendo la reserva
     * @return DTO con los datos extraídos
     */
    public DatosReservaDTO extraerDatosReserva(String fraseNaturalLenguaje) {
        // TODO: implementar
        return null;
    }
}

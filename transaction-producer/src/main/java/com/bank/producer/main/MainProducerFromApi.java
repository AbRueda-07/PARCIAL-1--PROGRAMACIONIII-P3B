package com.bank.producer.main;

import com.bank.producer.model.LoteTransacciones;
import com.bank.producer.model.Transaccion;
import com.bank.producer.service.ApiService;
import com.bank.producer.service.ProducerService;

public class MainProducerFromApi {

    public static void main(String[] args) {
        try {
            ApiService apiService = new ApiService();
            ProducerService producerService = new ProducerService();

            LoteTransacciones lote = apiService.obtenerLoteTransacciones();

            producerService.enviarLote(lote);

        } catch (Exception e) {
            System.out.println("Error al procesar el lote desde la API: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
package com.bank.producer.main;

import com.bank.producer.model.LoteTransacciones;
import com.bank.producer.service.ApiService;

public class MainApiTest {

    public static void main(String[] args) {
        try {
            ApiService apiService = new ApiService();
            LoteTransacciones lote = apiService.obtenerLoteTransacciones();

            System.out.println("Lote obtenido correctamente:");
            System.out.println("Lote ID: " + lote.getLoteId());
            System.out.println("Fecha generación: " + lote.getFechaGeneracion());
            System.out.println("Cantidad de transacciones: " + lote.getTransacciones().size());

        } catch (Exception e) {
            System.out.println("Error al consumir la API GET: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
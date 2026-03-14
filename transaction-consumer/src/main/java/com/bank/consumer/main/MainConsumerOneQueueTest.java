package com.bank.consumer.main;

import com.bank.consumer.service.ConsumerService;

public class MainConsumerOneQueueTest {

    public static void main(String[] args) {
        try {
            ConsumerService consumerService = new ConsumerService();
            consumerService.consumirCola("BAC");

            System.out.println("Consumer iniciado para la cola BAC.");

        } catch (Exception e) {
            System.out.println("Error al iniciar el consumer de prueba: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
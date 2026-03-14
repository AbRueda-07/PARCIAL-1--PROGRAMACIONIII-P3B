package com.bank.consumer.main;

import com.bank.consumer.service.ConsumerService;

public class MainConsumerMultiQueueTest {

    public static void main(String[] args) {
        try {
            ConsumerService consumerService = new ConsumerService();

            String[] colas = {"BAC", "BANRURAL", "BI", "GYT"};
            consumerService.consumirColas(colas);

            System.out.println("Consumer iniciado para múltiples colas.");

        } catch (Exception e) {
            System.out.println("Error al iniciar el consumer multicolas: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
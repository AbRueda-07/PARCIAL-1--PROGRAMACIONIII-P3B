package com.bank.producer.main;

import com.bank.producer.config.RabbitMQConfig;
import com.rabbitmq.client.Connection;

public class MainProducer {
	
	public static void main (String [] args) {
		try {
			Connection connection = RabbitMQConfig.createConnection();
			System.out.println("Conectado a RabbitMQ correctamente.");
			connection.close();
		}catch(Exception e) {
			System.out.println("Error al conectar con RabbitMQ" + e.getMessage());
			e.printStackTrace();
			
		}
		
	}

}

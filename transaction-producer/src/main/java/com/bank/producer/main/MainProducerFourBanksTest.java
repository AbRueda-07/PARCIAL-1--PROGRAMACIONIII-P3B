package com.bank.producer.main;

import com.bank.producer.model.Detalle;
import com.bank.producer.model.Referencias;
import com.bank.producer.model.Transaccion;
import com.bank.producer.service.ProducerService;
import java.util.UUID;

public class MainProducerFourBanksTest {

    public static void main(String[] args) {
        try {
            ProducerService producerService = new ProducerService();

            producerService.enviarTransaccion(crearTransaccion(
            	    "TX-" + UUID.randomUUID(),
            	    1000.00,
            	    "GTQ",
            	    "001-111111-1",
            	    "BANRURAL",
            	    "Cliente Demo 1",
            	    "Pago BANRURAL",
            	    "F-DEMO-001",
            	    "REF-DEMO-001"
            	));
           
            producerService.enviarTransaccion(crearTransaccion(
            		"TX-" + UUID.randomUUID(),
                    1100.00,
                    "GTQ",
                    "001-222222-2",
                    "BAC",
                    "Cliente Demo 2",
                    "Pago BAC",
                    "F-DEMO-002",
                    "REF-DEMO-002"
            ));

            producerService.enviarTransaccion(crearTransaccion(
            		"TX-" + UUID.randomUUID(),
                    1200.00,
                    "GTQ",
                    "001-333333-3",
                    "BI",
                    "Cliente Demo 3",
                    "Pago BI",
                    "F-DEMO-003",
                    "REF-DEMO-003"
            ));

            producerService.enviarTransaccion(crearTransaccion(
            		"TX-" + UUID.randomUUID(),
                    1300.00,
                    "GTQ",
                    "001-444444-4",
                    "GYT",
                    "Cliente Demo 4",
                    "Pago GYT",
                    "F-DEMO-004",
                    "REF-DEMO-004"
            ));

        } catch (Exception e) {
            System.out.println("Error en la prueba de 4 bancos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static Transaccion crearTransaccion(
            String idTransaccion,
            double monto,
            String moneda,
            String cuentaOrigen,
            String bancoDestino,
            String nombreBeneficiario,
            String descripcion,
            String factura,
            String codigoInterno) {

        Referencias referencias = new Referencias();
        referencias.setFactura(factura);
        referencias.setCodigoInterno(codigoInterno);

        Detalle detalle = new Detalle();
        detalle.setNombreBeneficiario(nombreBeneficiario);
        detalle.setTipoTransferencia("INTERBANCARIA");
        detalle.setDescripcion(descripcion);
        detalle.setReferencias(referencias);

        Transaccion transaccion = new Transaccion();
        transaccion.setIdTransaccion(idTransaccion);
        transaccion.setMonto(monto);
        transaccion.setMoneda(moneda);
        transaccion.setCuentaOrigen(cuentaOrigen);
        transaccion.setBancoDestino(bancoDestino);
        transaccion.setDetalle(detalle);

        return transaccion;
    }
}
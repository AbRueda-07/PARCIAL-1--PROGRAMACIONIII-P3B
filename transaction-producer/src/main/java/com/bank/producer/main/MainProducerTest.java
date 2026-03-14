package com.bank.producer.main;

import com.bank.producer.model.Detalle;
import com.bank.producer.model.Referencias;
import com.bank.producer.model.Transaccion;
import com.bank.producer.service.ProducerService;

public class MainProducerTest {

    public static void main(String[] args) {
        try {
            ProducerService producerService = new ProducerService();

            Referencias referencias1 = new Referencias();
            referencias1.setFactura("F-88991");
            referencias1.setCodigoInterno("ABC123");

            Detalle detalle1 = new Detalle();
            detalle1.setNombreBeneficiario("Carlos Pérez");
            detalle1.setTipoTransferencia("INTERBANCARIA");
            detalle1.setDescripcion("Pago proveedor");
            detalle1.setReferencias(referencias1);

            Transaccion transaccion1 = new Transaccion();
            transaccion1.setIdTransaccion("TX-10001");
            transaccion1.setMonto(2500.75);
            transaccion1.setMoneda("GTQ");
            transaccion1.setCuentaOrigen("001-123456-7");
            transaccion1.setBancoDestino("BANRURAL");
            transaccion1.setDetalle(detalle1);

            Referencias referencias2 = new Referencias();
            referencias2.setFactura("F-88992");
            referencias2.setCodigoInterno("XYZ789");

            Detalle detalle2 = new Detalle();
            detalle2.setNombreBeneficiario("Ana López");
            detalle2.setTipoTransferencia("INTERBANCARIA");
            detalle2.setDescripcion("Pago servicios");
            detalle2.setReferencias(referencias2);

            Transaccion transaccion2 = new Transaccion();
            transaccion2.setIdTransaccion("TX-10002");
            transaccion2.setMonto(1800.50);
            transaccion2.setMoneda("GTQ");
            transaccion2.setCuentaOrigen("001-765432-1");
            transaccion2.setBancoDestino("BAC");
            transaccion2.setDetalle(detalle2);

            producerService.enviarTransaccion(transaccion1);
            producerService.enviarTransaccion(transaccion2);

        } catch (Exception e) {
            System.out.println("Error en la prueba del Producer: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
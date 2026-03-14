package com.bank.consumer.main;

import com.bank.consumer.model.Detalle;
import com.bank.consumer.model.Referencias;
import com.bank.consumer.model.Transaccion;
import com.bank.consumer.service.ApiService;

public class MainPostTest {

    public static void main(String[] args) {
        try {
            Referencias referencias = new Referencias();
            referencias.setFactura("F-80026");
            referencias.setCodigoInterno("REF1026");

            Detalle detalle = new Detalle();
            detalle.setNombreBeneficiario("Cliente 27");
            detalle.setTipoTransferencia("INTERBANCARIA");
            detalle.setDescripcion("Pago simulado");
            detalle.setReferencias(referencias);

            Transaccion transaccion = new Transaccion();
            transaccion.setIdTransaccion("TX-10026");
            transaccion.setMonto(4574.77);
            transaccion.setMoneda("GTQ");
            transaccion.setCuentaOrigen("001-100026-7");
            transaccion.setBancoDestino("BAC");
            transaccion.setDetalle(detalle);

            ApiService apiService = new ApiService();
            boolean resultado = apiService.guardarTransaccion(transaccion);

            System.out.println("¿POST exitoso?: " + resultado);

        } catch (Exception e) {
            System.out.println("Error al probar el POST: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
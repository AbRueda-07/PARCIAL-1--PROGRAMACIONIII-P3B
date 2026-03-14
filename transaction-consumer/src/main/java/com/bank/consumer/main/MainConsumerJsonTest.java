package com.bank.consumer.main;

import com.bank.consumer.model.Transaccion;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainConsumerJsonTest {

    public static void main(String[] args) {
        try {
            String json = """
                    {
                      "idTransaccion":"TX-10026",
                      "monto":4574.77,
                      "moneda":"GTQ",
                      "cuentaOrigen":"001-100026-7",
                      "bancoDestino":"BAC",
                      "detalle": {
                        "nombreBeneficiario":"Cliente 27",
                        "tipoTransferencia":"INTERBANCARIA",
                        "descripcion":"Pago simulado",
                        "referencias": {
                          "factura":"F-80026",
                          "codigoInterno":"REF1026"
                        }
                      }
                    }
                    """;

            ObjectMapper mapper = new ObjectMapper();
            Transaccion transaccion = mapper.readValue(json, Transaccion.class);

            System.out.println("Transacción leída correctamente:");
            System.out.println(transaccion);

        } catch (Exception e) {
            System.out.println("Error al leer JSON en Consumer: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
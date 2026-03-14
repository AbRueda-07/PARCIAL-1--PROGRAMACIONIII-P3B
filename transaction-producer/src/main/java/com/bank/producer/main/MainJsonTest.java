package com.bank.producer.main;

import com.bank.producer.model.LoteTransacciones;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainJsonTest {

    public static void main(String[] args) {
        try {
            String json = """
                    {
                      "loteId":"L-2026-001",
                      "fechaGeneracion":"2026-02-26T10:15:30",
                      "transacciones": [
                        {
                          "idTransaccion":"TX-10001",
                          "monto":2500.75,
                          "moneda":"GTQ",
                          "cuentaOrigen":"001-123456-7",
                          "bancoDestino":"BANRURAL",
                          "detalle": {
                            "nombreBeneficiario":"Carlos Pérez",
                            "tipoTransferencia":"INTERBANCARIA",
                            "descripcion":"Pago proveedor",
                            "referencias": {
                              "factura":"F-88991",
                              "codigoInterno":"ABC123"
                            }
                          }
                        }
                      ]
                    }
                    """;

            ObjectMapper mapper = new ObjectMapper();
            LoteTransacciones lote = mapper.readValue(json, LoteTransacciones.class);

            System.out.println("Lote leído correctamente:");
            System.out.println(lote);

        } catch (Exception e) {
            System.out.println("Error al procesar JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
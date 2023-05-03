package org.example.BL;

import java.time.LocalDateTime;

public class Transaccion {

    double monto;
    LocalDateTime fecha;
    String nombreComercio;

    public Transaccion(double monto, String nombreComercio) {
        this.monto = monto;
        this.nombreComercio = nombreComercio;
        this.fecha = LocalDateTime.now();
    }
}

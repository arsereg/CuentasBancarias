package org.example.BL;

import java.time.LocalDate;
import java.util.UUID;


public class Tarjeta {

    String tipoMoneda;
    String numeroTarjeta;
    String pin;
    LocalDate vencimiento;
    String tipo;

    public Tarjeta(String tipoMoneda, String tipo) {
        this.tipoMoneda = tipoMoneda;
        this.numeroTarjeta = generarNumeroTarjeta();
        this.pin = generarPin();
        this.tipo = tipo;
        this.vencimiento = LocalDate.now().plusYears(6);
    }


    public String generarPin(){
        String pin = "";
        for(int i = 0; i < 4; i++){
            pin += (int)(Math.random() * 10);
        }
        return pin;
    }

    public String generarNumeroTarjeta(){
        String numeroTarjeta = "";
        for(int i = 0; i < 16; i++){
            numeroTarjeta += (int)(Math.random() * 10);
        }
        return numeroTarjeta;
    }
}

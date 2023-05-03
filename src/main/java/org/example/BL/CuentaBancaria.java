package org.example.BL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CuentaBancaria {
    private String tipo;
    private double balance;
    private String tipoMoneda;
    List<Transaccion> transacciones;

    public CuentaBancaria(String tipo, String tipoMoneda) {
        this.tipo = tipo;
        this.tipoMoneda = tipoMoneda;
        this.balance = 0;
        transacciones = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
}

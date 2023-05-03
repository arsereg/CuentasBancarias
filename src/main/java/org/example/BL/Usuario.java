package org.example.BL;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private List<CuentaBancaria> cuentas;

    public Usuario(String cedula, String nombre, String apellido, String telefono, String email) {
        this.setCedula(cedula);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setTelefono(telefono);
        this.setEmail(email);
        cuentas = new ArrayList<>();
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void agregarCuenta(CuentaBancaria cuentaBancaria){
        this.cuentas.add(cuentaBancaria);
    }
}

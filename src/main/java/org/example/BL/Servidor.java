package org.example.BL;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Servidor {

    private static List<Usuario> clientes = new ArrayList<>();

    public static boolean crearCliente(String cedula, String nombre, String apellido, String telefono, String email){
        Usuario unUsuario = new Usuario(cedula, nombre, apellido, telefono, email);
        clientes.add(unUsuario);
        return true;
    }


    public static List<String> obtenerListaUsuarios() {
        List<String> resultado = new ArrayList<>();
        for (Usuario cliente : clientes){
            resultado.add(cliente.getCedula()+ ": " + cliente.getNombre() + " " + cliente.getApellido());
        }
        return resultado;
    }

    public static void crearCuentaBancaria(String cedulaSeleccionada, String tipo, String tipoMoneda) {
        CuentaBancaria unaCuenta = new CuentaBancaria(tipo, tipoMoneda);
        for (Usuario cliente : clientes){
            if(cliente.getCedula().equals(cedulaSeleccionada)){
                cliente.agregarCuenta(unaCuenta);
            }
        }


    }
}

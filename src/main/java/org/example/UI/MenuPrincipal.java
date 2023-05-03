package org.example.UI;

import org.example.BL.Servidor;

import java.util.List;

/**
 * Hello world!
 *
 */
public class MenuPrincipal
{



    public static GinoScanner scanner = new GinoScanner();
    public static String cedulaSeleccionada = "";

    public static void main( String[] args )
    {
        int accion = 0;
        do {
            accion = imprimirMenuPrincipal();
            switch(accion){
                case 1:
                    crearUsuario();
                    break;
                case 2:
                    seleccionarUsuario();
                    break;
                case 3:
                    crearCuentaBancaria();
                    break;
            }

        }while(accion != 0);
        System.out.println("Muchas gracias por usar el sistema");
    }

    public static int imprimirMenuPrincipal(){
        String[] opciones = {"Crear usuario",
        "Seleccionar usuario",
        "Crear cuenta bancaria",
        "Crear tarjeta de Crédito",
        "Realizar compras",
        "Ver transacciones",
        "Ingresar dinero",
        "Sacar efectivo",
        "Abonar a hipoteca"};

        for (int i = 0; i < opciones.length; i++) {
            System.out.println(i + 1 + "- " + opciones[i]);
        }


        System.out.println("0- Salir");
        System.out.println("Digite la opción que desea realizar: ");
        return scanner.nextInt();
    }

    public static void crearUsuario(){
        System.out.println("Digite la cédula: ");
        String cedula = scanner.nextLine();
        System.out.println("Digite el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Digite el apellido");
        String apellido = scanner.nextLine();
        System.out.println("Digite el teléfono");
        String telefono = scanner.nextLine();
        System.out.println("Digite el email");
        String email = scanner.nextLine();
        boolean resultado = Servidor.crearCliente(cedula, nombre, apellido, telefono, email);
        if(resultado){
            System.out.println("--------------------------------");
            System.out.println("USUARIO REGISTRADO CORRECTAMENTE");
            System.out.println("--------------------------------");
        }else{
            System.out.println("Hubo un problema al registrar el usuario");
        }
    }


    public static void seleccionarUsuario(){
        System.out.println("--------------------------------");
        System.out.println("USUARIOS REGISTRADOS");
        System.out.println("--------------------------------");
        List<String> listaUsuarios = Servidor.obtenerListaUsuarios();
        for(String usuario : listaUsuarios){
            System.out.println(usuario);
        }
        System.out.println("Digite el número de cédula del usuario que desea seleccionar");
        String cedula = scanner.nextLine();
        boolean usuarioSeleccionado = false;
        for(String usuario : listaUsuarios){

            if(usuario.split(":")[0].equals(cedula)){
                usuarioSeleccionado = true;
                cedulaSeleccionada = cedula;
            }
        }

        if(usuarioSeleccionado){
            System.out.println("--------------------------------");
            System.out.println("USUARIO CON CEDULA " + cedula + " SELECCIONADO");
            System.out.println("--------------------------------");
        }else{
            System.out.println("--------------------------------");
            System.out.println("ERROR: CEDULA INEXISTENTE");
            System.out.println("--------------------------------");
        }

    }


    public static void crearCuentaBancaria(){
        if(cedulaSeleccionada.equals("")){
            System.out.println("--------------------------------");
            System.out.println("ERROR: NO SE HA SELECCIONADO UN USUARIO");
            System.out.println("--------------------------------");
            return;
        }


        System.out.println("Digite el tipo de cuenta que desea crear:");
        System.out.println("1- Ahorros");
        System.out.println("2- De planilla");
        System.out.println("3- Cuenta Regular");
        System.out.println("4- Crédito");
        String tipo = "";
        int seleccionDelUsuario = scanner.nextInt();
        switch (seleccionDelUsuario){
            case 1:
                tipo = "Ahorros";
                break;
            case 2:
                tipo = "Planilla";
                break;
            case 3:
                tipo = "Cuenta regular";
                break;
            case 4:
                tipo = "Credito";
        }


        System.out.println("Digite el tipo de moneda");
        String[] opciones = {
                "USD",
                "CAD",
                "CRC",
                "Euro",
                "Cordovas",
                "Pesos Panameños",
                "Libras Esterlinas",
        };

        for (int i = 0; i < opciones.length; i++) {
            System.out.println(i + 1 + "-" + opciones[i]);
        }

        seleccionDelUsuario = scanner.nextInt();
        String tipoMoneda = "";
        switch (seleccionDelUsuario){
            case 1:
                tipoMoneda = "USD";
            case 2:
                tipoMoneda = "CAD";
            case 3:
                tipoMoneda = "CRC";
            case 4:
                tipoMoneda = "Euro";
            case 5:
                tipoMoneda = "Cordovas";
            case 6:
                tipoMoneda = "Pesos Panameños";
            case 7:
                tipoMoneda = "Libras Esterlinas";
        }
        Servidor.crearCuentaBancaria(cedulaSeleccionada, tipo, tipoMoneda);
    }


    public void crearTarjetaDeCredito(){
        if(cedulaSeleccionada.equals("")){
            System.out.println("--------------------------------");
            System.out.println("ERROR: NO SE HA SELECCIONADO UN USUARIO");
            System.out.println("--------------------------------");
            return;
        }

        System.out.println("Digite el tipo de moneda");
        String[] opciones = {
                "USD",
                "CAD",
                "CRC",
                "Euro",
                "Cordovas",
                "Pesos Panameños",
                "Libras Esterlinas",
        };

        for (int i = 0; i < opciones.length; i++) {
            System.out.println(i + 1 + "-" + opciones[i]);
        }

        int seleccionDelUsuario = scanner.nextInt();


        System.out.println("Digite el tipo de tarjeta");
        String[] opcionesTarjeta = {
                "Credito",
                "Debito"
        };

        for (int i = 0; i < opciones.length; i++) {
            System.out.println(i + 1 + "-" + opciones[i]);
        }

        seleccionDelUsuario = scanner.nextInt();
        String tipoTarjetaCredito = "";
        switch (seleccionDelUsuario){
            case 1:
                tipoTarjetaCredito = "Crédito";
                break;
            case 2:
                tipoTarjetaCredito = "Débito";
                break;

        }










    }






}

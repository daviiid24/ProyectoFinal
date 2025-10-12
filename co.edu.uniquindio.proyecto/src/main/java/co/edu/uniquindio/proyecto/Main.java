package co.edu.uniquindio.proyecto;

import co.edu.uniquindio.proyecto.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gimnasio gimnasio = inicializarDatos();
    }
    private static void agregarUsuario(Gimnasio gimnasio){
        String nombre=leerStringConsola("Ingrese el nombre del usuario: ");
        String identificacion=leerStringConsola("Ingrese la identificacion del usuario: ");
        int edad=leerEntero("Ingrese la edad del usuario: ");
        String telefono=leerStringConsola("Ingrese la telefono del usuario: ");
        System.out.println("Seleccione el tipo de usuario:");
        System.out.println("1. ESTUDIANTE");
        System.out.println("2. TRABAJADOR_UQ");
        System.out.println("3. EXTERNO");
        int opcion = leerEntero("Seleccione una opción: ");
        TipoUsuario tipoUsuario;

        switch (opcion) {
            case 1:
                tipoUsuario = TipoUsuario.ESTUDIANTE;
                break;
            case 2:
                tipoUsuario = TipoUsuario.TRABAJADOR_UQ;
                break;
            case 3:
                tipoUsuario = TipoUsuario.EXTERNO;
                break;
            default:
                System.out.println("Opción no válida, se asignará EXTERNO por defecto.");
                tipoUsuario = TipoUsuario.EXTERNO;
        }
        System.out.println("Seleccione el tipo de membresía:");
        System.out.println("1. MENSUAL");
        System.out.println("2. TRIMESTRAL");
        System.out.println("3. ANUAL");
        int opcionMembresia = leerEntero("Seleccione una opcion: ");
        TipoMembresia tipoMembresia = switch (opcionMembresia) {
            case 1 -> TipoMembresia.MENSUAL;
            case 2 -> TipoMembresia.TRIMESTRAL;
            case 3 -> TipoMembresia.ANUAL;
            default -> TipoMembresia.MENSUAL;
        };
        boolean resultado = gimnasio.crearUsuario(nombre,
                identificacion,
                edad,
                telefono,
                tipoUsuario,
                tipoMembresia);

        if (resultado) {
            System.out.println("Usuario creado con exito");
        } else {
            System.out.println("Usuario no creado");
        }




    }






    private static Gimnasio inicializarDatos() {
         Gimnasio gimnasio = new Gimnasio();
        agregarUsuario(gimnasio);
        return gimnasio;
    }

    private static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;
    }

    public static String leerStringConsola(String mensaje) {
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

    public static double leerDoubleConsola(String mensaje) {
        double dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Double.parseDouble(captura);
        return dato;
    }
}
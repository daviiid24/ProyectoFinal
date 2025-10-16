package co.edu.uniquindio.proyecto;

import co.edu.uniquindio.proyecto.model.*;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gimnasio gimnasio = inicializarDatos();
        agregarUsuario(gimnasio);
        eliminarUsuario(gimnasio);
        actualizarUsuario(gimnasio);
        obtenerUsuario(gimnasio);

        asignarMembresia(gimnasio);

    }

    //CRUD USUARIO
    private static void agregarUsuario(Gimnasio gimnasio) {
        String nombre = leerStringConsola("Ingrese el nombre del usuario: ");
        String identificacion = leerStringConsola("Ingrese la identificacion del usuario: ");
        int edad = leerEntero("Ingrese la edad del usuario: ");
        String telefono = leerStringConsola("Ingrese la telefono del usuario: ");
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

        boolean resultado = gimnasio.crearUsuario(nombre,
                identificacion,
                edad,
                telefono,
                tipoUsuario);

        if (resultado) {
            System.out.println("Usuario creado con exito");
        } else {
            System.out.println("Usuario no creado");
        }
    }

    private static void eliminarUsuario(Gimnasio gimnasio) {
        String idEliminar = leerStringConsola("Ingrese el id del usuario a eliminar:");
        boolean resultado = gimnasio.eliminarUsuario(idEliminar);
        if (resultado) {
            System.out.println("Usuario eliminado con exito");
        } else {
            System.out.println("Usuario no eliminado");
        }
    }

    private static void actualizarUsuario(Gimnasio gimnasio) {
        String nombre = leerStringConsola("Ingrese el nombre del usuario: ");
        String identificacion = leerStringConsola("Ingrese la identificacion del usuario: ");
        int edad = leerEntero("Ingrese la edad del usuario: ");
        String telefono = leerStringConsola("Ingrese la telefono del usuario: ");
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


        boolean resultado = gimnasio.actualizarUsuario(nombre, identificacion, edad, telefono,
                tipoUsuario);

        if (resultado) {
            System.out.println("Usuario actualizado con exito");
        } else {
            System.out.println("Usuario no actualizado");
        }
    }

    public static void obtenerUsuario(Gimnasio gimnasio) {
        String idBuscar = leerStringConsola("Ingrese el id del usuario a buscar:");
        Usuario resultado = gimnasio.obtenerUsuario(idBuscar);
        if (resultado != null) {
            System.out.println("Usuario encontrado con exito");
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    public static void asignarMembresia(Gimnasio gimnasio) {
        String id = leerStringConsola("Ingrese la identificacion del usuario a asignar: ");
        System.out.println("Seleccione el tipo de membresía:");
        System.out.println("1. Basica");
        System.out.println("2. Premium");
        System.out.println("3. VIP");
        int opcionMembresia = leerEntero("Seleccione una opcion: ");
        TipoMembresia tipoMembresia = switch (opcionMembresia) {
            case 1 -> TipoMembresia.BASICA;
            case 2 -> TipoMembresia.PREMIUM;
            case 3 -> TipoMembresia.VIP;
            default -> TipoMembresia.BASICA;
        };

        System.out.println("Seleccione la duracion:");
        System.out.println("1. MENSUAL");
        System.out.println("2. TRIMESTRAL");
        System.out.println("3. ANUAL");
        int opcionDuracion = leerEntero("Seleccione una opcion: ");
        Duracion duracion = switch (opcionDuracion) {
            case 1 -> Duracion.MENSUAL;
            case 2 -> Duracion.TRIMESTRAL;
            case 3 -> Duracion.ANUAL;
            default -> Duracion.MENSUAL;
        };
        double costo = leerDoubleConsola("Ingrese el costo de la membresia: ");
        boolean resultado = gimnasio.crearMembresia(id, tipoMembresia, duracion, costo);

        if (resultado) {
            System.out.println("Membresia creada y asignada con exito");
        } else {
            System.out.println("Membresia no creado");
        }
    }
    //CRUD ENTRENADOR
    private static void agregarEntrenador(Gimnasio gimnasio) {
        String nombre = leerStringConsola("Ingrese el nombre del entrenador: ");
        String identificacion = leerStringConsola("Ingrese la identificacion del entrenador: ");
        int edad = leerEntero("Ingrese la edad del entrenador: ");
        String telefono = leerStringConsola("Ingrese la telefono del entrenador: ");


        boolean resultado = gimnasio.crearEntrenador(nombre,
                identificacion,
                edad,
                telefono);

        if (resultado) {
            System.out.println("Entrenador creado con exito");
        } else {
            System.out.println("Entrenador no creado");
        }
    }

    private static void eliminarEntrenador(Gimnasio gimnasio) {
        String idEliminar = leerStringConsola("Ingrese el id del entrenador a eliminar:");
        boolean resultado = gimnasio.eliminarEntrenador(idEliminar);
        if (resultado) {
            System.out.println("Entrenador eliminado con exito");
        } else {
            System.out.println("Entrenador no eliminado");
        }
    }

    private static void actualizarUsuario(Gimnasio gimnasio) {
        String nombre = leerStringConsola("Ingrese el nombre del entrenador: ");
        String identificacion = leerStringConsola("Ingrese la identificacion del entrenador: ");
        int edad = leerEntero("Ingrese la edad del entrenador: ");
        String telefono = leerStringConsola("Ingrese la telefono del entrenador: ");

        boolean resultado = gimnasio.actualizarEntrenador(nombre, identificacion,
                edad, telefono);

        if (resultado) {
            System.out.println("Entrenador actualizado con exito");
        } else {
            System.out.println("Entrenador no actualizado");
        }
    }

    public static void obtenerEntrenador(Gimnasio gimnasio) {
        String idBuscar = leerStringConsola("Ingrese el id del entrenador a buscar:");
        Entrenador resultado = gimnasio.obtenerEntrenador(idBuscar);
        if (resultado != null) {
            System.out.println("Entrenador encontrado con exito");
        } else {
            System.out.println("Entrenador no encontrado");
        }
    }
    //CRUD CLASE
    private static void agregarClase(Gimnasio gimnasio) {
        String nombre = leerStringConsola("Ingrese el nombre de la clase: ");
        int cupoMaximo = leerEntero("Ingrese el cupo maximo de la clase: ");
        String identificacion=leerStringConsola("Ingrese el id del entrenador a asignar a la clase: ");
        System.out.println("Seleccione el tipo de clase:");
        System.out.println("1. YOGA \n 2. SPINNING \n " +
                "3. ZUMBA \n 4. CROSSFIT \n 5. PILATES");
        int opcionClase = leerEntero("Seleccione una opcion: ");
        TipoClase tipoClase = switch (opcionClase) {
            case 1 -> TipoClase.YOGA;
            case 2 -> TipoClase.SPINNING;
            case 3 -> TipoClase.ZUMBA;
            case 4 -> TipoClase.CROSSFIT;
            case 5 -> TipoClase.PILATES;
            default -> TipoClase.YOGA;
        };


        boolean resultado = gimnasio.agregarClase(nombre,
                cupoMaximo, identificacion,
                tipoClase);

        if (resultado) {
            System.out.println("Clase creado con exito");
        } else {
            System.out.println("Clase no creado");
        }
    }

    private static void eliminarClase(Gimnasio gimnasio) {
        String idEliminar = leerStringConsola("Ingrese el nombre de la clase a eliminar:");
        boolean resultado = gimnasio.eliminarClase(idEliminar);
        if (resultado) {
            System.out.println("Clase eliminado con exito");
        } else {
            System.out.println("Clase no eliminado");
        }
    }

    private static void actualizarClase(Gimnasio gimnasio) {
        String nombre = leerStringConsola("Ingrese el nombre de la clase: ");
        int cupoMaximo = leerEntero("Ingrese el cupo maximo de la clase: ");
        String identificacion=leerStringConsola("Ingrese el id del entrenador a asignar a la clase: ");
        System.out.println("Seleccione el tipo de clase:");
        System.out.println("1. YOGA \n 2. SPINNING \n " +
                "3. ZUMBA \n 4. CROSSFIT \n 5. PILATES");
        int opcionClase = leerEntero("Seleccione una opcion: ");
        TipoClase tipoClase = switch (opcionClase) {
            case 1 -> TipoClase.YOGA;
            case 2 -> TipoClase.SPINNING;
            case 3 -> TipoClase.ZUMBA;
            case 4 -> TipoClase.CROSSFIT;
            case 5 -> TipoClase.PILATES;
            default -> TipoClase.YOGA;
        };


        boolean resultado = gimnasio.actualizarClase(nombre,
                cupoMaximo, identificacion,
                tipoClase);

        if (resultado) {
            System.out.println("Clase actualizado con exito");
        } else {
            System.out.println("Clase no actualizado");
        }
    }

    public static void obtenerClase(Gimnasio gimnasio) {
        String idBuscar = leerStringConsola("Ingrese el nombre de la clase a buscar:");
        Clase resultado = gimnasio.obtenerClase(idBuscar);
        if (resultado != null) {
            System.out.println("Clase encontrado con exito");
        } else {
            System.out.println("Clase no encontrado");
        }
    }




    private static Gimnasio inicializarDatos() {
        Gimnasio gimnasio = new Gimnasio();
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
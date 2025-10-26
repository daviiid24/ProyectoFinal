package co.edu.uniquindio.proyecto;

import co.edu.uniquindio.proyecto.model.*;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Gimnasio gimnasio = inicializarDatos();
    /*
    int opcionPrincipal;

        do {
        opcionPrincipal = mostrarMenuPrincipal();

        switch (opcionPrincipal) {
            case 1 -> menuUsuarios(gimnasio);
            case 2 -> menuEntrenadores(gimnasio);
            case 3 -> menuClases(gimnasio);
            case 4 -> menuMembresias(gimnasio);
            case 5 -> menuReservas(gimnasio);
            case 6 -> menuMetodos(gimnasio);
            case 7 -> System.out.println("Saliendo del sistema...");
            default -> System.out.println("Opción no válida, intente de nuevo.");
        }
    } while (opcionPrincipal != 7);
}

private static int mostrarMenuPrincipal() {
    System.out.println("\n===== MENÚ PRINCIPAL GIMNASIO =====");
    System.out.println("1 - Usuarios");
    System.out.println("2 - Entrenadores");
    System.out.println("3 - Clases");
    System.out.println("4 - Membresías");
    System.out.println("5 - Reservas");
    System.out.println("6 - Métodos Especiales");
    System.out.println("7 - Salir");
    return leerEntero("Seleccione una opción: ");
}

// === MENÚ USUARIOS ===
private static void menuUsuarios(Gimnasio gimnasio) {
    int opcion;
    do {
        System.out.println("\n--- CRUD USUARIOS ---");
        System.out.println("1 - Crear");
        System.out.println("2 - Eliminar");
        System.out.println("3 - Actualizar");
        System.out.println("4 - Obtener");
        System.out.println("5 - Salir");
        opcion = leerEntero("Seleccione una opción: ");

        switch (opcion) {
            case 1 -> agregarUsuario(gimnasio);
            case 2 -> eliminarUsuario(gimnasio);
            case 3 -> actualizarUsuario(gimnasio);
            case 4 -> obtenerUsuario(gimnasio);
            case 5 -> System.out.println("Saliendo del menú usuarios...");
            default -> System.out.println("Opción inválida.");
        }
    } while (opcion != 5);
}

// === MENÚ ENTRENADORES ===
private static void menuEntrenadores(Gimnasio gimnasio) {
    int opcion;
    do {
        System.out.println("\n--- CRUD ENTRENADORES ---");
        System.out.println("1 - Crear");
        System.out.println("2 - Eliminar");
        System.out.println("3 - Actualizar");
        System.out.println("4 - Obtener");
        System.out.println("5 - Salir");
        opcion = leerEntero("Seleccione una opción: ");

        switch (opcion) {
            case 1 -> agregarEntrenador(gimnasio);
            case 2 -> eliminarEntrenador(gimnasio);
            case 3 -> actualizarEntrenador(gimnasio);
            case 4 -> obtenerEntrenador(gimnasio);
            case 5 -> System.out.println("Saliendo del menú entrenadores...");
            default -> System.out.println("Opción inválida.");
        }
    } while (opcion != 5);
}

// === MENÚ CLASES ===
private static void menuClases(Gimnasio gimnasio) {
    int opcion;
    do {
        System.out.println("\n--- CRUD CLASES ---");
        System.out.println("1 - Crear");
        System.out.println("2 - Eliminar");
        System.out.println("3 - Actualizar");
        System.out.println("4 - Obtener");
        System.out.println("5 - Salir");
        opcion = leerEntero("Seleccione una opción: ");

        switch (opcion) {
            case 1 -> agregarClase(gimnasio);
            case 2 -> eliminarClase(gimnasio);
            case 3 -> actualizarClase(gimnasio);
            case 4 -> obtenerClase(gimnasio);
            case 5 -> System.out.println("Saliendo del menú clases...");
            default -> System.out.println("Opción inválida.");
        }
    } while (opcion != 5);
}

// === MENÚ MEMBRESÍAS ===
private static void menuMembresias(Gimnasio gimnasio) {
    int opcion;
    do {
        System.out.println("\n--- CRUD MEMBRESÍAS ---");
        System.out.println("1 - Crear");
        System.out.println("2 - Eliminar");
        System.out.println("3 - Actualizar");
        System.out.println("4 - Obtener");
        System.out.println("5 - Asignar a usuario");
        System.out.println("6 - Salir");
        opcion = leerEntero("Seleccione una opción: ");

        switch (opcion) {
            case 1 -> agregarMembresia(gimnasio);
            case 2 -> eliminarMembresia(gimnasio);
            case 3 -> actualizarMembresia(gimnasio);
            case 4 -> obtenerMembresia(gimnasio);
            case 5 -> asignarMembresia(gimnasio);
            case 6 -> System.out.println("Saliendo del menú membresías...");
            default -> System.out.println("Opción inválida.");
        }
    } while (opcion != 6);
}

// === MENÚ RESERVAS ===
private static void menuReservas(Gimnasio gimnasio) {
    int opcion;
    do {
        System.out.println("\n--- CRUD RESERVAS ---");
        System.out.println("1 - Crear");
        System.out.println("2 - Eliminar");
        System.out.println("3 - Actualizar");
        System.out.println("4 - Obtener");
        System.out.println("5 - Salir");
        opcion = leerEntero("Seleccione una opción: ");

        switch (opcion) {
            case 1 -> crearReserva(gimnasio);
            case 2 -> eliminarReserva(gimnasio);
            case 3 -> actualizarReserva(gimnasio);
            case 4 -> obtenerReserva(gimnasio);
            case 5 -> System.out.println("Saliendo del menú reservas...");
            default -> System.out.println("Opción inválida.");
        }
    } while (opcion != 5);
}

// === MENÚ MÉTODOS ESPECIALES ===
private static void menuMetodos(Gimnasio gimnasio) {
    int opcion;
    do {
        System.out.println("\n--- MÉTODOS ESPECIALES ---");
        System.out.println("1 - Validar ingreso de usuario");
        System.out.println("2 - Reservar clase");
        System.out.println("3 - Salir");
        opcion = leerEntero("Seleccione una opción: ");

        switch (opcion) {
            case 1 -> validarIngresoUsuario(gimnasio);
            case 2 -> reservarClase(gimnasio);
            case 3 -> System.out.println("Saliendo del menú métodos...");
            default -> System.out.println("Opción inválida.");
        }
    } while (opcion != 3);
}
*/}
    public static void validarIngresoUsuarioAvanzado(Gimnasio gimnasio){
        String nombre=leerStringConsola("Ingrese su nomnbre: ");
        String identificacion=leerStringConsola("Ingrese su identificacion: ");
        String telefono=leerStringConsola("Ingrese su telefono: ");
        boolean resultado=gimnasio.validarUsuarioAvanzado(nombre, identificacion, telefono);
        if(resultado) {
            System.out.println("Bienvenido" + nombre);
        } else {
            System.out.println("Acceso denegado. Verifique los datos o el estado de su membresía");
        }
    }

    public static void generarReporte(Gimnasio gimnasio){
        int opcion;
        do {
            opcion = leerEntero("Ingrese el tipo de reporte que desea generar: /n" +
                    "1. Usuarios activos/n" +
                    "2. Clases mas reservadas/n" +
                    "3. Vencimiento membresias");
            switch (opcion) {
                case 1 -> gimnasio.generarReporte(opcion);
                case 2 -> gimnasio.generarReporte(opcion);
                case 3 -> gimnasio.generarReporte(opcion);
                default -> System.out.println("Opcion invalida");
            }
        } while (opcion!=3);
    }
    public static void generarReporteAvanzado(Gimnasio gimnasio){
        int opcion;
        do {
            opcion = leerEntero("Ingrese el tipo de reporte avanzado que desea generar: /n" +
                    "1. Estadísticas de asistencia/n" +
                    "2. Ingresos por membresías/n" +
                    "3. Clases más populares");
            switch (opcion) {
                case 1 -> gimnasio.generarReporteAvanzado(opcion);
                case 2 -> gimnasio.generarReporteAvanzado(opcion);
                case 3 -> gimnasio.generarReporteAvanzado(opcion);
                default -> System.out.println("Opcion invalida");
            }
        } while (opcion!=3);
    }

    public static void asignarMembresia(Gimnasio gimnasio){
        String idUsuario=leerStringConsola("Ingrese el id del usuario: ");
        String idMembresia=idUsuario;
        boolean resultado=gimnasio.asignarMembresia(idUsuario, idMembresia);
        if(resultado) {
            System.out.println("Membresia asignada exitosamente");
        } else {
            System.out.println("Membresia no asignada");
        }
    }
    public static void reservarClase(Gimnasio gimnasio) {
        String idReserva = leerStringConsola("Ingrese el id de la reserva: ");
        String idUsuario = leerStringConsola("Ingrese el id del usuario:");
        String nombreClase = leerStringConsola("Ingrese el nombre de la clase a asistir: ");
        boolean resultado = gimnasio.reservarClase(idReserva, idUsuario, nombreClase);
        if (resultado) {
            System.out.println("Reserva hecha exitosamente");
        } else {
            System.out.println("Reserva no hecha");
        }
    }
    public static void validarIngresoUsuario(Gimnasio gimnasio){
        String idUsuario=leerStringConsola("Ingrese el id del usuario: ");
        boolean resultado=gimnasio.validarUsuario(idUsuario);
        if (resultado) {
            System.out.println("Usuario valido. Bienvenido a " + gimnasio.getNombre());
        } else {
            System.out.println("Usuario no registrado. Por favor registrese para acceder a los servicios:");
        }
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

    private static void actualizarEntrenador(Gimnasio gimnasio) {
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
            case 1 -> tipoClase = TipoClase.YOGA;
            case 2 -> tipoClase = TipoClase.SPINNING;
            case 3 -> tipoClase = TipoClase.ZUMBA;
            case 4 -> tipoClase = TipoClase.CROSSFIT;
            case 5 -> tipoClase = TipoClase.PILATES;
            default -> tipoClase = TipoClase.YOGA;
        };
        int hora = leerEntero("Ingrese la hora de la clase");
        int minuto = leerEntero("Ingrese los minutos de la clase ");

        boolean resultado = gimnasio.agregarClase(nombre,
                cupoMaximo, identificacion,
                tipoClase, hora , minuto);

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
            case 1 -> tipoClase = TipoClase.YOGA;
            case 2 -> tipoClase = TipoClase.SPINNING;
            case 3 -> tipoClase = TipoClase.ZUMBA;
            case 4 -> tipoClase = TipoClase.CROSSFIT;
            case 5 -> tipoClase = TipoClase.PILATES;
            default -> tipoClase = TipoClase.YOGA;
        };

        int hora = leerEntero("Ingrese la hora de la clase");
        int minuto = leerEntero("Ingrese los minutos de la clase ");


        boolean resultado = gimnasio.actualizarClase(nombre,
                cupoMaximo, identificacion,
                tipoClase, hora, minuto);

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
    //CRUD MEMBRESIA
    private static void agregarMembresia(Gimnasio gimnasio) {
        String idMembresia = leerStringConsola("Ingrese el ID de la membresía, recuerda que es el mismo del usuario: ");

        System.out.println("Seleccione el tipo de membresía:");
        System.out.println("1. BASICA");
        System.out.println("2. PREMIUM");
        System.out.println("3. VIP");
        int opcionTipo = leerEntero("Seleccione una opción: ");
        TipoMembresia tipo;
        switch (opcionTipo) {
            case 1 -> tipo = TipoMembresia.BASICA;
            case 2 -> tipo = TipoMembresia.PREMIUM;
            case 3 -> tipo = TipoMembresia.VIP;
            default -> {
                System.out.println("Opción inválida. Se asignará basica");
                tipo = TipoMembresia.BASICA;
            }
        }

        System.out.println("Seleccione la duración:");
        System.out.println("1. MENSUAL");
        System.out.println("2. TRIMESTRAL");
        System.out.println("3. ANUAL");
        int opcionDuracion = leerEntero("Seleccione una opción: ");
        Duracion duracion;
        switch (opcionDuracion) {
            case 1 -> duracion = Duracion.MENSUAL;
            case 2 -> duracion = Duracion.TRIMESTRAL;
            case 3 -> duracion = Duracion.ANUAL;
            default -> {
                System.out.println("Opción inválida. Se asignará mensual");
                duracion = Duracion.MENSUAL;
            }
        }

        double costo = leerDoubleConsola("Ingrese el costo de la membresía: ");
        boolean resultado = gimnasio.crearMembresia(idMembresia, tipo, duracion, costo);

        if (resultado) {
            System.out.println("Membresía creada con éxito.");
        } else {
            System.out.println("Membresia no creada");
        }
    }

    private static void eliminarMembresia(Gimnasio gimnasio) {
        String idEliminar = leerStringConsola("Ingrese el id de la membresía a eliminar: ");
        boolean resultado = gimnasio.eliminarMembresia(idEliminar);
        if (resultado) {
            System.out.println("Membresía eliminada con éxito");
        } else {
            System.out.println("No se encontró la membresía");
        }
    }

    private static void actualizarMembresia(Gimnasio gimnasio) {
        String idMembresia = leerStringConsola("Ingrese el id de la membresía a actualizar: ");

        System.out.println("Seleccione el nuevo tipo de membresía:");
        System.out.println("1. BASICA");
        System.out.println("2. PREMIUM");
        System.out.println("3. VIP");
        int opcionTipo = leerEntero("Seleccione una opción: ");
        TipoMembresia tipo;
        switch (opcionTipo) {
            case 1 -> tipo = TipoMembresia.BASICA;
            case 2 -> tipo = TipoMembresia.PREMIUM;
            case 3 -> tipo = TipoMembresia.VIP;
            default -> tipo = TipoMembresia.BASICA;
        }

        System.out.println("Seleccione la nueva duración:");
        System.out.println("1. MENSUAL");
        System.out.println("2. TRIMESTRAL");
        System.out.println("3. ANUAL");
        int opcionDuracion = leerEntero("Seleccione una opción: ");
        Duracion duracion;
        switch (opcionDuracion) {
            case 1 -> duracion = Duracion.MENSUAL;
            case 2 -> duracion = Duracion.TRIMESTRAL;
            case 3 -> duracion = Duracion.ANUAL;
            default -> duracion = Duracion.MENSUAL;
        }

        double costo = leerDoubleConsola("Ingrese el nuevo costo: ");
        boolean resultado = gimnasio.actualizarMembresia(idMembresia, tipo, duracion, costo);

        if (resultado) {
            System.out.println("Membresía actualizada con éxito");
        } else {
            System.out.println("No se encontró la membresía a actualizar");
        }
    }

    public static void obtenerMembresia(Gimnasio gimnasio) {
        String idBuscar = leerStringConsola("Ingrese el id de la membresía a buscar: ");
        Membresia resultado = gimnasio.obtenerMembresia(idBuscar);
        if (resultado != null) {
            System.out.println("Membresía encontrada");
        } else {
            System.out.println("No se encontró la membresía");
        }
    }
    //CRUD RESERVA
    public static void crearReserva(Gimnasio gimnasio) {
        String idReserva=leerStringConsola("Ingrese el id de su reserva:");
        String idUsuario=leerStringConsola("Ingrese el id del usuario para reservar:");
        String nombreClase=leerStringConsola("Ingrese el nombre de la clase a asistir:");
        boolean resultado=gimnasio.reservarClase(idReserva, idUsuario, nombreClase);
        if(resultado){
        System.out.println("Reserva hecha con exito");
        } else {
        System.out.println("No se ha hecho la reserva");
        }
    }

    private static void eliminarReserva(Gimnasio gimnasio) {
        String idEliminar = leerStringConsola("Ingrese el id de la reserva a eliminar: ");
        boolean resultado = gimnasio.eliminarReserva(idEliminar);
        if (resultado) {
            System.out.println("Reserva eliminada con éxito");
        } else {
            System.out.println("No se encontró la reserva");
        }
    }
    public static void actualizarReserva(Gimnasio gimnasio) {
        String idReserva = leerStringConsola("Ingrese el id de la reserva a actualizar:");
        String idUsuario = leerStringConsola("Ingrese el nuevo id del usuario para reservar:");
        String nombreClase = leerStringConsola("Ingrese el nuevo nombre de la clase a asistir:");
        boolean resultado = gimnasio.actualizarReserva(idReserva, idUsuario, nombreClase);
        if (resultado) {
            System.out.println("Reserva actualizada con exito");
        } else {
            System.out.println("No se ha encotrado la reserva");
        }
    }
    public static void obtenerReserva(Gimnasio gimnasio) {
        String idBuscar=leerStringConsola("Ingrese el id de la reserva a buscar: ");
        Reserva resultado=gimnasio.obtenerReserva(idBuscar);
        if (resultado != null) {
            System.out.println("Reserva encontrada");
        } else {
            System.out.println("No se ha encontrado la reserva");
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
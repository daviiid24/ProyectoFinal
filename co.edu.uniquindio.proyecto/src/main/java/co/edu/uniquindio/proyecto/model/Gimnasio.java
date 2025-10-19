package co.edu.uniquindio.proyecto.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private ArrayList<Membresia> listaMembresias = new ArrayList<>();
    private ArrayList<Reserva> listaReservas = new ArrayList<>();
    private ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();
    private ArrayList<Clase> listaClases = new ArrayList<>();
    private ArrayList<Reporte> listaReportes = new ArrayList<>();
    private Administrador administrador;
    private Recepcionista recepcionista;

    public Gimnasio() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    public void setListaEntrenadores(ArrayList<Entrenador> listaEntrenadores) {
        this.listaEntrenadores = listaEntrenadores;
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clase> listaClases) {
        this.listaClases = listaClases;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }

    public ArrayList<Membresia> getListaMembresias() {
        return listaMembresias;
    }

    public void setListaMembresias(ArrayList<Membresia> listaMembresias) {
        this.listaMembresias = listaMembresias;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public ArrayList<Reporte> getListaReportes() {
        return listaReportes;
    }

    public void setListaReportes(ArrayList<Reporte> listaReportes) {
        this.listaReportes = listaReportes;
    }

    @Override
    public String toString() {
        return "Gimnasio{" +
                "nombre='" + nombre + '\'' +
                ", listaUsuarios=" + listaUsuarios +
                ", listaMembresias=" + listaMembresias +
                ", listaReservas=" + listaReservas +
                ", listaEntrenadores=" + listaEntrenadores +
                ", listaClases=" + listaClases +
                ", listaReportes=" + listaReportes +
                ", administrador=" + administrador +
                ", recepcionista=" + recepcionista +
                '}';
    }

    public boolean asignarMembresia(String idUsuario, String idMembresia) {
        Usuario usuarioEncontrado=obtenerUsuario(idUsuario);
        Membresia membresiaEncontrada=obtenerMembresia(idMembresia);
        if(usuarioEncontrado!=null&&membresiaEncontrada!=null){
            usuarioEncontrado.setMembresia(membresiaEncontrada);
            return true;
        } else {
            return false;
        }
    }




    public boolean crearUsuario(String nombre, String identificacion, int edad,
                                String telefono, TipoUsuario tipoUsuario) {
        Usuario usuarioEncontrado = obtenerUsuario(identificacion);
        if (usuarioEncontrado == null) {
            Usuario usuario = new Usuario();
            usuario.setNombre(nombre);
            usuario.setIdentificacion(identificacion);
            usuario.setEdad(edad);
            usuario.setTelefono(telefono);
            usuario.setTipoUsuario(tipoUsuario);
            getListaUsuarios().add(usuario);

            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarUsuario(String idEliminar) {
        Usuario usuarioEncontrado = obtenerUsuario(idEliminar);
        if (usuarioEncontrado != null) {
            getListaUsuarios().remove(usuarioEncontrado);
            return true;
        } else {
            return false;
        }
    }

    public boolean actualizarUsuario(String nombre, String identificacion, int edad,
                                     String telefono, TipoUsuario tipoUsuario) {
        Usuario usuarioEncontrado = obtenerUsuario(identificacion);
        if (usuarioEncontrado.getIdentificacion().equalsIgnoreCase(identificacion)) {
            usuarioEncontrado.setNombre(nombre);
            usuarioEncontrado.setIdentificacion(identificacion);
            usuarioEncontrado.setEdad(edad);
            usuarioEncontrado.setTelefono(telefono);
            usuarioEncontrado.setTipoUsuario(tipoUsuario);

            return true;
        } else {
            return false;
        }
    }

    public Usuario obtenerUsuario(String identificacion) {
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : getListaUsuarios()) {
            if (usuario.getIdentificacion().equalsIgnoreCase(identificacion)) {
                usuarioEncontrado = usuario;
                break;
            }
        }

        return usuarioEncontrado;
    }

    //CRUD ENTRENADOR
    public boolean crearEntrenador(String nombre, String identificacion, int edad,
                                String telefono) {
        Entrenador entrenadorEncontrado = obtenerEntrenador(identificacion);
        if (entrenadorEncontrado == null) {
            Entrenador entrenador = new Entrenador();
            entrenador.setNombre(nombre);
            entrenador.setIdentificacion(identificacion);
            entrenador.setEdad(edad);
            entrenador.setTelefono(telefono);
            getListaEntrenadores().add(entrenador);

            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarEntrenador(String idEliminar) {
        Entrenador entrenadorEncontrado = obtenerEntrenador(idEliminar);
        if (entrenadorEncontrado != null) {
            getListaEntrenadores().remove(entrenadorEncontrado);
            return true;
        } else {
            return false;
        }
    }

    public boolean actualizarEntrenador(String nombre, String identificacion, int edad,
                                     String telefono) {
        Entrenador entrenadorEncontrado = obtenerEntrenador(identificacion);
        if (entrenadorEncontrado.getIdentificacion().equalsIgnoreCase(identificacion)) {
            entrenadorEncontrado.setNombre(nombre);
            entrenadorEncontrado.setIdentificacion(identificacion);
            entrenadorEncontrado.setEdad(edad);
            entrenadorEncontrado.setTelefono(telefono);

            return true;
        } else {
            return false;
        }
    }

    public Entrenador obtenerEntrenador(String identificacion) {
        Entrenador entrenadorEncontrado = null;
        for (Entrenador entrenador : getListaEntrenadores()) {
            if (entrenador.getIdentificacion().equalsIgnoreCase(identificacion)) {
                entrenadorEncontrado = entrenador;
                break;
            }
        }

        return entrenadorEncontrado;
    }

    //CRUD CLASE
    public boolean agregarClase(String nombre,
                                 int cupoMaximo,
                                String identificacion,
                                TipoClase tipoClase) {
        Clase claseEncontrada = obtenerClase(nombre);
        if (claseEncontrada == null) {
            Clase clase = new Clase();
            clase.setNombre(nombre);
            clase.setCupoMaximo(cupoMaximo);
            clase.setHorario(LocalTime.of(int hour));
            clase.setTipoClase(tipoClase);
            Entrenador entrenadorEncontrado=obtenerEntrenador(identificacion);
            clase.setEntrenador(entrenadorEncontrado);
            getListaClases().add(clase);

            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarClase(String nombre) {
        Clase claseEncontrada = obtenerClase(nombre);
        if (claseEncontrada != null) {
            getListaClases().remove(claseEncontrada);
            return true;
        } else {
            return false;
        }
    }

    public boolean actualizarClase(String nombre,
                                   int cupoMaximo,
                                   String identificacion,
                                   TipoClase tipoClase) {
        Clase claseEncontrada = obtenerClase(nombre);
        if (claseEncontrada.getNombre().equalsIgnoreCase(nombre)) {
            claseEncontrada.setNombre(nombre);
            claseEncontrada.setCupoMaximo(cupoMaximo);
            claseEncontrada.setHorario(LocalTime.of(int hour));
            claseEncontrada.setTipoClase(tipoClase);
            Entrenador entrenadorEncontrado=obtenerEntrenador(identificacion);
            claseEncontrada.setEntrenador(entrenadorEncontrado);

            return true;
        } else {
            return false;
        }
    }

    public Clase obtenerClase(String nombre) {
        Clase claseEncontrada = null;
        for (Clase clase : getListaClases()) {
            if (clase.getNombre().equalsIgnoreCase(nombre)) {
                claseEncontrada = clase;
                break;
            }
        }

        return claseEncontrada;
    }
    //CRUD MEMBRESIA
    public boolean crearMembresia(String idMembresia, TipoMembresia tipo, Duracion duracion,
                                  double costo) {
        Membresia membresiaEncontrada = obtenerMembresia(idMembresia);
        if (membresiaEncontrada == null) {
            Membresia membresia = new Membresia();
            membresia.setIdMembresia(idMembresia);
            membresia.setTipo(tipo);
            membresia.setDuracion(duracion);
            membresia.setCosto(costo);
            membresia.setFechaInicio(LocalDate.now());
            LocalDate fechaVencimiento;
            if (duracion==Duracion.MENSUAL) {
                fechaVencimiento=LocalDate.now().plusMonths(1);
            } else if (duracion == Duracion.TRIMESTRAL) {
                fechaVencimiento=LocalDate.now().plusMonths(3);
            } else if {
                fechaVencimiento=LocalDate.now().plusYears(1);
            }
            membresia.setFechaVencimiento(fechaVencimiento);
            membresia.setEstado(Estado.ACTIVA);

            getListaMembresias().add(membresia);
            return true;
        } else {
            return false;
        }
    }
    public boolean eliminarMembresia(String idEliminar) {
        Membresia membresiaEncontrada = obtenerMembresia(idEliminar);
        if (membresiaEncontrada != null) {
            getListaMembresias().remove(membresiaEncontrada);
            return true;
        } else {
            return false;
        }
    }

    public boolean actualizarMembresia(String idMembresia, TipoMembresia tipo, Duracion duracion,
                                       double costo) {
        Membresia membresiaEncontrada = obtenerMembresia(idMembresia);
        if (membresiaEncontrada != null) {
            membresiaEncontrada.setTipo(tipo);
            membresiaEncontrada.setDuracion(duracion);
            membresiaEncontrada.setCosto(costo);
            membresiaEncontrada.setFechaInicio(LocalDate.now());
            LocalDate fechaVencimiento;
            if (duracion==Duracion.MENSUAL) {
                fechaVencimiento=LocalDate.now().plusMonths(1);
            } else if (duracion == Duracion.TRIMESTRAL) {
                fechaVencimiento=LocalDate.now().plusMonths(3);
            } else if {
                fechaVencimiento=LocalDate.now().plusYears(1);
            }
            membresiaEncontrada.setFechaVencimiento(fechaVencimiento);
            membresiaEncontrada.setEstado(Estado.ACTIVA);

            return true;
        } else {
            return false;
        }
    }

    public Membresia obtenerMembresia(String idMembresia) {
        Membresia membresiaEncontrada=null;
        for (Membresia membresia : getListaMembresias()) {
            if (membresia.getIdMembresia().equalsIgnoreCase(idMembresia)) {
                membresiaEncontrada=membresia;
                break;
            }
        }
        return membresiaEncontrada;
    }
















    public boolean crearMembresi(String id, TipoMembresia tipo, Duracion duracion, double costo) {
        Usuario usuarioEncontrado = obtenerUsuario(id);
        if (usuarioEncontrado == null) {
            System.out.println("No se encontró un usuario con esa identificación.");
            return false;
        }

        Membresia membresia;
        switch (tipo) {
            case BASICA -> membresia = new MembresiaBasica();
            case PREMIUM -> membresia = new MembresiaPremium();
            case VIP -> membresia = new MembresiaVip();
            default -> membresia = new MembresiaBasica();
        }
        membresia.setTipo(tipo);
        membresia.setCosto(costo);
        membresia.setEstado(Estado.ACTIVA);
        membresia.setFechaInicio(LocalDate.now());
        LocalDate fechaVencimiento;
        switch (duracion) {
            case MENSUAL -> fechaVencimiento = LocalDate.now().plusMonths(1);
            case TRIMESTRAL -> fechaVencimiento = LocalDate.now().plusMonths(3);
            case ANUAL -> fechaVencimiento = LocalDate.now().plusYears(1);
            default -> fechaVencimiento = LocalDate.now().plusMonths(1);
        }
        membresia.setFechaVencimiento(fechaVencimiento);
        usuarioEncontrado.setMembresia(membresia);

        return true;

    }



}



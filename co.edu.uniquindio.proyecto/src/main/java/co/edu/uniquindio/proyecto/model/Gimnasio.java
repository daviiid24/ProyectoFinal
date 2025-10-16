package co.edu.uniquindio.proyecto.model;

import java.time.LocalDate;
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

    /*
    public void addUsuario(Usuario usuario) {
        if (this.usuarios == null) {
            this.usuarios.add(usuario);
        }
    }

    public void addEntrenador(Entrenador entrenador) {
        if (this.entrenadores == null) {
            this.entrenadores.add(entrenador);
        }
    }

    public void addClase(Clase clase) {
        if (this.clases == null) {
            this.clases.add(clase);
        }
    }
     */

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


    public boolean crearMembresia(String id, TipoMembresia tipo, Duracion duracion, double costo) {
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



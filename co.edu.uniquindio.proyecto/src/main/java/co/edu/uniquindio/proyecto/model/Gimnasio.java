package co.edu.uniquindio.proyecto.model;

import java.time.LocalDate;
import java.util.ArrayList;

import static co.edu.uniquindio.proyecto.Main.obtenerUsuario;

public class Gimnasio {
    private String nombre;
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();
    private ArrayList<Clase> listaClases = new ArrayList<>();
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
                ", listaEntrenadores=" + listaEntrenadores +
                ", listaClases=" + listaClases +
                ", administrador=" + administrador +
                ", recepcionista=" + recepcionista +
                '}';
    }

    public boolean crearUsuario(String nombre, String identificacion, int edad, String telefono, TipoUsuario tipoUsuario) {
        Usuario usuarioEncontrado = obtenerUsuario(identificacion);
        if(usuarioEncontrado == null) {
            Usuario usuario = new Usuario();
            usuario.setNombre(nombre);
            usuario.setIdentificacion(identificacion);
            usuario.setEdad(edad);
            usuario.setTelefono(telefono);
            usuario.setTipoUsuario(tipoUsuario);
            getListaUsuarios().add(usuario);

            return true;
        }else{
            return false;
        }
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
        membresia.setEstado(EstadoMembresia.ACTIVA);
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

    public Usuario obtenerUsuario(String identificacion) {
        Usuario usuarioEncontrado =  null;
        for (Usuario usuario : getListaUsuarios()) {
            if(usuario.getIdentificacion().equalsIgnoreCase(identificacion)) {
                usuarioEncontrado = usuario;
                break;
            }
        }

        return usuarioEncontrado;
    }
}



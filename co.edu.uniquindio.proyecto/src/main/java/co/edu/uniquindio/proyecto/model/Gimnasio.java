package co.edu.uniquindio.proyecto.model;

import java.util.ArrayList;

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

    public boolean crearUsuario(String nombre, String identificacion, int edad, String telefono, TipoUsuario tipoUsuario, TipoMembresia tipoMembresia) {
        Usuario usuarioEncontrado = obtenerUsuario(identificacion);
        if(usuarioEncontrado == null) {
            Usuario usuario = new Usuario();
            usuario.setNombre(nombre);
            usuario.setIdentificacion(identificacion);
            usuario.setEdad(edad);
            usuario.setTelefono(telefono);
            usuario.setTipoUsuario(tipoUsuario);
            Membresia membresia=new Membresia();
            membresia.setTipo(tipoMembresia);
            usuario.setMembresia(membresia);
            getListaUsuarios().add(usuario);

            return true;
        }else{
            return false;
        }
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



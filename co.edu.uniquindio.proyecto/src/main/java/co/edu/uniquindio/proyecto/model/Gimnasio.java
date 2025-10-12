package co.edu.uniquindio.proyecto.model;

import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private ArrayList<Usuario> usuarios=new ArrayList<>();
    private ArrayList<Entrenador> entrenadores=new ArrayList<>();
    private ArrayList<Clase> clases=new ArrayList<>();
    private Administrador administrador;
    private Recepcionista recepcionista;
    public Gimnasio(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
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

    @Override
    public String toString() {
        return "Gimnasio{" +
                "nombre='" + nombre + '\'' +
                ", usuarios=" + usuarios +
                ", entrenadores=" + entrenadores +
                ", clases=" + clases +
                ", administrador=" + administrador +
                ", recepcionista=" + recepcionista +
                '}';
    }
}

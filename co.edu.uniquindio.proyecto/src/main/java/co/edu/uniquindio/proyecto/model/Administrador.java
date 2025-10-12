package co.edu.uniquindio.proyecto.model;

public class Administrador {
    private String nombre;
    public Administrador() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarEntrenador(Gimnasio gimnasio, Entrenador entrenador) {
        gimnasio.agregarEntrenador(entrenador);
        System.out.println("Entrenador registrado correctamente: " + entrenador.getNombre());
    }

    public void eliminarEntrenador(Gimnasio gimnasio, String idEntrenador) {
        gimnasio.eliminarEntrenador(idEntrenador);
    }

    public void generarReporteAvanzado(Gimnasio gimnasio) {
        gimnasio.generarReporteAvanzado();
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

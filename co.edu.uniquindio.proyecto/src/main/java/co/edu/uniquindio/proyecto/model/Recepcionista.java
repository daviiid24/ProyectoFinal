package co.edu.uniquindio.proyecto.model;

public class Recepcionista {
    private String nombre;
    public Recepcionista() {}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarUsuario(Usuario usuario) {
        gimnasio.addUsuario(usuario);
    }

    public void asignarMembresia(Usuario usuario, Membresia membresia) {
        usuario.setMembresiaAsignada(membresia);
    }

    public void reservarClase(Usuario usuario, Clase clase) {
        Reserva reserva = new Reserva(usuario, clase, java.time.LocalDate.now());
        usuario.addReserva(reserva);
        clase.addUsuario(usuario);
    }
    @Override
    public String toString() {
        return "Recepcionista{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

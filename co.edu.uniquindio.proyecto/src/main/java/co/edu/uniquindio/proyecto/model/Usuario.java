package co.edu.uniquindio.proyecto.model;

import java.util.ArrayList;

public class Usuario extends Persona {
    private TipoUsuario tipoUsuario;
    private Membresia membresiaAsignada;
    private ArrayList<Reserva> reservas=new ArrayList();

    public Usuario() {}

    public TipoUsuario getTipoUsuario() { return tipoUsuario; }
    public void setTipoUsuario(TipoUsuario tipoUsuario) { this.tipoUsuario = tipoUsuario; }

    public Membresia getMembresiaAsignada() { return membresiaAsignada; }
    public void setMembresiaAsignada(Membresia membresiaAsignada) { this.membresiaAsignada = membresiaAsignada; }

    public ArrayList getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList reservas) {
        this.reservas = reservas;
    }

    public void addReserva(Reserva reserva) {
        if (this.reservas == null) {
            this.reservas.add(reserva);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + getNombre() + '\'' +
                ", identificacion='" + getIdentificacion() + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", membresia=" + (membresiaAsignada != null ? membresiaAsignada.getTipo() : "null") +
                '}';
    }
}

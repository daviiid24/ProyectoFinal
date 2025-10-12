package co.edu.uniquindio.proyecto.model;

import java.time.LocalDate;

public class Reserva {
    private Usuario usuario;
    private Clase clase;
    private LocalDate fechaReserva;

    public Reserva() {}

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "usuario=" + usuario +
                ", clase=" + clase +
                ", fechaReserva=" + fechaReserva +
                '}';
    }
}

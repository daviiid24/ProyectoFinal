package co.edu.uniquindio.proyecto.model;

import java.time.LocalDate;

public class Membresia {
    private TipoMembresia tipo;
    private Duracion duracion;
    private double costo;
    private LocalDate fechaInicio;
    private LocalDate fechaVencimiento;
    private EstadoMembresia estado;

    public Membresia(TipoMembresia tipo,Duracion duracion, double costo) {
        this.tipo = tipo;
        this.duracion = duracion;
        this.costo = costo;
        this.fechaInicio = LocalDate.now();
        this.fechaVencimiento = fechaVencimiento;
    }

    public TipoMembresia getTipo() {
        return tipo;
    }

    public void setTipo(TipoMembresia tipo) {
        this.tipo = tipo;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public void setDuracion(Duracion duracion) {
        this.duracion = duracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public EstadoMembresia getEstado() {
        return estado;
    }

    public void setEstado(EstadoMembresia estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Membresia{" +
                "tipo=" + tipo +
                ", costo=" + costo +
                ", fechaInicio=" + fechaInicio +
                ", fechaVencimiento=" + fechaVencimiento +
                ", estado=" + estado +
                '}';
    }
}

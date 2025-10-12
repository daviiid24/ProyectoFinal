package co.edu.uniquindio.proyecto.model;

import java.util.ArrayList;

public class Entrenador extends Persona {
    private ArrayList<Clase> claseAsignadas =new ArrayList();

    public Entrenador() {
    }

    public ArrayList<Clase> getClasesAsignadas() {
        return claseAsignadas;
    }

    public void setClasesAsignadas(ArrayList<Clase> claseAsignadas) {
        this.claseAsignadas = claseAsignadas;
    }

    public void addClase(Clase clase) {
        if (this.claseAsignadas == null) {
            this.claseAsignadas.add(clase);
        }
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "clasesAsignadas=" + claseAsignadas +
                '}';
    }
}

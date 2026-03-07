//Carlos Ramos
//0905 23 14141

package hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private String expediente;
    private List<Tratamiento> tratamientos;

    public Paciente(String nombre, String expediente) {
        this.nombre = nombre;
        this.expediente = expediente;
        this.tratamientos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getExpediente() {
        return expediente;
    }

    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void agregarTratamiento(Tratamiento t) {
        tratamientos.add(t);
    }

    public int duracionTotal() {
        int total = 0;
        for (Tratamiento t : tratamientos) {
            total += t.getDias();
        }
        return total;
    }
}

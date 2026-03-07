
// Formula: lado x lado

package cr.calcularareas.app;

public class Cuadrado implements Figura {

    double lado;

    // Constructor: 
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Calcula y devuelve el area del cuadrado
    @Override
    public double calcularArea() {
        double area = lado * lado;
        return area;
    }

    @Override
    public String getNombre() {
        return "Cuadrado";
    }

}
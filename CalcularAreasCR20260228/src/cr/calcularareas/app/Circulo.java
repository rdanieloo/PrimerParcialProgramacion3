
// Formula: PI x radio x radio

package cr.calcularareas.app;

public class Circulo implements Figura {

    double radio;

    // Constructor: 
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Calcula y devuelve el area del circulo
    @Override
    public double calcularArea() {
        double area = Math.PI * radio * radio;
        return area;
    }

    @Override
    public String getNombre() {
        return "Circulo";
    }

}
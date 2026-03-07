
// Formula: (base x altura) / 2

package cr.calcularareas.app;

public class Triangulo implements Figura {

    double base;
    double altura;

    // Constructor: recibe base y altura del usuario
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Calcula y devuelve el area del triangulo
    @Override
    public double calcularArea() {
        double area = (base * altura) / 2;
        return area;
    }

    // nombre
    @Override
    public String getNombre() {
        return "Triangulo";
    }

}
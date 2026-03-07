package tarea;

/**
 * Clase con operaciones básicas.
 */
public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        // Protección frente a división por cero (comparación tolerante)
        if (Math.abs(b) < 1e-12) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return a / b;
    }
}

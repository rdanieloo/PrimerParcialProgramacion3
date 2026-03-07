package Modelos;

// Clase abstracta: contrato general
public abstract class MetodoPago {
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public abstract void realizarPago();
}
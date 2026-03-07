//Carlos Ramos
//0905 23 1414

package Modelos;


public class Efectivo extends MetodoPago {
    private double descuento;

    public Efectivo(double monto, double descuento) {
        super(monto);
        this.descuento = descuento;
    }

    @Override
    public void realizarPago() {
        double total = monto - (monto * descuento / 100);
        System.out.println("Pagando Q. " + total + " en Efectivo (descuento. "  + descuento + "%) ");
    }
}

//Carlos Ramos
//0905 23 14141

package Modelos;

public class TarjetaCredito extends MetodoPago {
    private int cuotas;

    public TarjetaCredito(double monto, int cuotas) {
        super(monto);
        this.cuotas = cuotas;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pagando Q. " + monto + " con Tarjeta en " + cuotas + " cuotas.");
    }
}
//Carlos Ramos
//0905 23 14141

package Modelos;

public class PayPal extends MetodoPago {
    private String correo;

    public PayPal(double monto, String correo) {
        super(monto);
        this.correo = correo;
    }

    @Override
    public void realizarPago() {
        System.out.println("Pagando Q. " + monto + " con PayPal desde " + correo + ".");
    }
}
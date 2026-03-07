//Carlos Ramos
//0905 23 14141

package EjemploSemana6;

public class Main {
    public static void main(String[] args) {
        MetodoPago pago1 = new TarjetaCredito(500.0, 3);
        MetodoPago pago2 = new Efectivo(200.0, 10);
        MetodoPago pago3 = new PayPal(1000.0, "usuario@email.com");
        
        // Polimorfismo: todos llaman al mismo método realizarPago()
        pago1.realizarPago();
        pago2.realizarPago();
        pago3.realizarPago();
    }
}

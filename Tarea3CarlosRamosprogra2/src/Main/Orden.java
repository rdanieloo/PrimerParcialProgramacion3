//Carlos Ramos
//0905 23 14141

package Main;

import java.util.ArrayList;
import java.util.List;

public class Orden {

	
	private static int contadorOrdenes = 1;

    private int numeroOrden;
    private String mesero;
    private int mesa;
    private List<Platillo> platillos;

    public Orden(String mesero, int mesa) {
        this.numeroOrden = contadorOrdenes++;
        this.mesero = mesero;
        this.mesa = mesa;
        this.platillos = new ArrayList<>();
    }

    public void agregarPlatillo(Platillo platillo) {
        platillos.add(platillo);
    }

    public double calcularTotal() {
        double total = 0;
        for (Platillo p : platillos) {
            total += p.getSubtotal();
        }
        return total;
    }

    public void mostrarDetalle() {
        System.out.println("Orden #" + numeroOrden);
        System.out.println("Mesero: " + mesero);
        System.out.println("Mesa: " + mesa);
        System.out.println("Detalle de la orden:");
        for (Platillo p : platillos) {
            System.out.println("- " + p);
        }
        System.out.println("TOTAL A PAGAR: Q" + calcularTotal());
    }

}

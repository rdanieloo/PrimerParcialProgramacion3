//Carlos Ramos
//0905 23 14141

package Main;

public class Platillo {

	

	
	  private String nombre;
	    private int cantidad;
	    private double precio;

	    public Platillo(String nombre, int cantidad, double precio) {
	        this.nombre = nombre;
	        this.cantidad = cantidad;
	        this.precio = precio;
	    }

	    public double getSubtotal() {
	        return cantidad * precio;
	    }

	    public String toString() {
	        return cantidad + " x " + nombre + " @ Q" + precio + " = Q" + getSubtotal();
	    }
	}



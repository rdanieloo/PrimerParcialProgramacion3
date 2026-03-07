//Carlos Ramos 
//0905 23 14141

package Modelos;

import Modelos.Efectivo;
import Modelos.MetodoPago;
import Modelos.PayPal;
import Modelos.TarjetaCredito;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista para productos
        List<Producto> carrito = new ArrayList<>();
        String continuar;

        // 1. Agregar productos
        do {
            System.out.print("Ingrese nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese precio del producto: ");
            double precio = sc.nextDouble();
            sc.nextLine(); // limpiar buffer

            System.out.print("Ingrese categoría del producto: ");
            String categoria = sc.nextLine();

            carrito.add(new Producto(nombre, precio, categoria));

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        // 2. Mostrar productos agregados
        System.out.println("\n--- Carrito de Compras ---");
        double monto = 0;
        for (Producto p : carrito) {
            System.out.println(p);
            monto += p.getPrecio();
        }
        System.out.println("TOTAL: Q. " + monto);

        // 3. Elegir método de pago
        System.out.println("\nSeleccione método de pago:");
        System.out.println("1. Tarjeta de Crédito");
        System.out.println("2. Efectivo");
        System.out.println("3. PayPal");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        MetodoPago pago = null;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese número de cuotas: ");
                int cuotas = sc.nextInt();
                pago = new TarjetaCredito(monto, cuotas);
                break;

            case 2:
                System.out.print("Ingrese descuento (%): ");
                double descuento = sc.nextDouble();
                pago = new Efectivo(monto, descuento);
                break;

            case 3:
                sc.nextLine(); // limpiar buffer
                System.out.print("Ingrese correo de PayPal: ");
                String correo = sc.nextLine();
                pago = new PayPal(monto, correo);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        if (pago != null) {
            pago.realizarPago();
        }

        sc.close();
    }
}
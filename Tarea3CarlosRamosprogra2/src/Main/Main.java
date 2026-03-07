//Carlos Ramos
//0905/ 23 14141

package Main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	static List<String> meseros = List.of("Mesero 1", "Mesero 2", "Mesero 3");
    static List<Orden> ordenes = new ArrayList<>();

    static String[] nombresPlatos = {"Pollo a la Plancha", "Carne Asada", "Burrito", "Tacos de la casa", "Ensalda"};
    static double[] preciosPlatos = {40.0, 45.0, 30.0, 25.0, 35.0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Orden ordenActual = null;

        while (true) {
        	System.out.println("\n--------- BIENVENIDO!! --------");
        	System.out.println("\n--- RESTARURANTE LA CASITA  ---");
            System.out.println("\n------------- MENÚ ------------");
            System.out.println("1. Ingresar nueva orden");
            System.out.println("2. Agregar platillos a la orden");
            System.out.println("3. Mostrar cuenta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Crear orden nueva
                    System.out.println("Por favor, Seleccione mesero:");
                    for (int i = 0; i < meseros.size(); i++) {
                        System.out.println((i + 1) + ") " + meseros.get(i));
                    }
                    System.out.print("Por favor, Ingrese número de mesero: ");
                    int meseroIndex = sc.nextInt() - 1;

                    System.out.print("Por favor, Ingrese número de mesa: ");
                    int mesa = sc.nextInt();

                    ordenActual = new Orden(meseros.get(meseroIndex), mesa);
                    ordenes.add(ordenActual);
                    System.out.println("Orden creada exitosamente.");
                    break;

                case 2:
                    if (ordenActual == null) {
                    	System.out.println("Uppss :(");
                        System.out.println("Primero debe ingresar una orden.");
                        break;
                    }

                    System.out.println("Platillos disponibles:");
                    for (int i = 0; i < nombresPlatos.length; i++) {
                        System.out.println((i + 1) + ") " + nombresPlatos[i] + " - Q" + preciosPlatos[i]);
                    }

                    System.out.print("Por favor, Seleccione número de platillo: ");
                    int platilloIndex = sc.nextInt() - 1;

                    System.out.print("Por favor, Ingrese cantidad: ");
                    int cantidad = sc.nextInt();

                    Platillo nuevo = new Platillo(nombresPlatos[platilloIndex], cantidad, preciosPlatos[platilloIndex]);
                    ordenActual.agregarPlatillo(nuevo);
                    System.out.println("Platillo agregado.");
                    break;

                case 3:
                    if (ordenActual != null) {
                        ordenActual.mostrarDetalle();
                    } else {
                    	System.out.println("Uppss :(");
                        System.out.println("No hay orden activa.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    return;

                default:
                	System.out.println("Uppss :(");
                    System.out.println("Opción inválida.");
            }
        }
    }

	
	}



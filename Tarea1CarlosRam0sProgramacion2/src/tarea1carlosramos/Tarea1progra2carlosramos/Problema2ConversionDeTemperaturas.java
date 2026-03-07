//Tarea 1 Problema 2 Carlos Ramos
//0905 23 14141


package tarea1carlosramos;

import java.util.Scanner;

public class Problema2ConversionDeTemperaturas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n===== Conversión de Temperaturas =====");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("0. Salir");

            // Validar que el usuario ingrese un nemero entero
            System.out.print("Ingrese una opcion, por favor: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Opss Error: Debe ingresar un numero valido (0, 1 o 2).Por favor\n");
                scanner.next(); 
                continue;
            }

            opcion = scanner.nextInt();

            if (opcion == 1) {
                double celsius = pedirNumero(scanner, "Ingrese la temperatura en Celsius: ");
                double resultado = celsiusAFahrenheit(celsius);
                System.out.println("Resultado en Fahrenheit: " + resultado + "\n");

                if (!deseaContinuar(scanner)) {
                    break;
                }

            } else if (opcion == 2) {
                double fahrenheit = pedirNumero(scanner, "Ingrese la temperatura en Fahrenheit: ");
                double resultado = fahrenheitACelsius(fahrenheit);
                System.out.println("Resultado en Celsius: " + resultado + "\n");

                if (!deseaContinuar(scanner)) {
                    break;
                }

            } else if (opcion == 0) {
                System.out.println("\n¡Gracias por usar el programa!\n");
            } else {
                System.out.println("Opcion no valida. Intente de nuevo, por favor.\n");
            }
        }

        scanner.close();
    }

    // Mrtodo para convertir Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Metodo para convertir Fahrenheit a Celsius
    public static double fahrenheitACelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Metodo que valida si el usuario desea continuar
    public static boolean deseaContinuar(Scanner scanner) {
        System.out.print("¿Desea hacer otra conversión? (s/n): ");
        String respuesta = scanner.next();

        while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
            System.out.print("Ingrese solo 's' para sí o 'n' para no: ");
            respuesta = scanner.next();
        }

        return respuesta.equalsIgnoreCase("s");
    }

    // Metodo para pedir un nunero decimal con validacion
    public static double pedirNumero(Scanner scanner, String mensaje) {
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                valido = true;
            } else {
                System.out.println("Opss :(  Por favor, ingresar un numero valido.");
                scanner.next(); // limpiar entrada
            }
        }

        return numero;

	}

}

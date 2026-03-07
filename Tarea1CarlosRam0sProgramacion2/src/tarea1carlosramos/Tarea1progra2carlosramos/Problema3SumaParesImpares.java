//Problema 3 Suma de Números Pares e Impares
//Carlos Ramos
//0905 23 14141

package tarea1carlosramos;

import java.util.Scanner;

public class Problema3SumaParesImpares {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Arreglo de numeros definido en el ejercicio
	        int[] numeros = {4, 7, 12, 9, 21, 30, 5};

	        System.out.println("\n===== Suma de Números Pares e Impares =====\n");

	        System.out.print("Arreglo original: ");
	        for (int numero : numeros) {
	            System.out.print(numero + " ");
	        }
	        System.out.println("\n");

	        // Calcular la suma de pares e impares
	        int sumaPares = sumarPares(numeros);
	        int sumaImpares = sumarImpares(numeros);

	        // resultados
	        System.out.println("Suma de los números pares: " + sumaPares);
	        System.out.println("Suma de los números impares: " + sumaImpares);

	        // Preguntar si desea ejecutar el programa otra vez
	        if (deseaRepetir(scanner)) {
	            main(args); 
	        } else {
	            System.out.println("\n¡Gracias por usar el programa!\n");
	        }

	        scanner.close();
	    }

	    // Metodo que suma los numeros pares
	    public static int sumarPares(int[] arreglo) {
	        int suma = 0;
	        for (int num : arreglo) {
	            if (num % 2 == 0) {
	                suma += num;
	            }
	        }
	        return suma;
	    }

	    // Mwtodo que suma los numeros impares
	    public static int sumarImpares(int[] arreglo) {
	        int suma = 0;
	        for (int num : arreglo) {
	            if (num % 2 != 0) {
	                suma += num;
	            }
	        }
	        return suma;
	    }

	    // Metodo que pregunta si el usuario desea repetir el programa
	    public static boolean deseaRepetir(Scanner scanner) {
	        System.out.print("\n¿Desea ejecutar el programa nuevamente? (s/n): ");
	        String respuesta = scanner.next();

	        while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
	            System.out.print("Opss :( Ingrese solo 's' para sí o 'n' para no: ");
	            respuesta = scanner.next();
	        }

	        return respuesta.equalsIgnoreCase("s");
	    }
	}



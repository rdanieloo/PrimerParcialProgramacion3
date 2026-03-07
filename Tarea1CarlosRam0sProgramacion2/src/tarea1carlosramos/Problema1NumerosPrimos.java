//Problema 1 Carlos Ramos
//0905 23 14141


package tarea1carlosramos;

import java.util.Scanner;

public class Problema1NumerosPrimos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero de inicio, por favor: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el numero de fin, por favor: ");
        int fin = scanner.nextInt();

        System.out.println("Los Numeros primos entre " + inicio + " y " + fin + ":");
        for (int i = inicio; i <= fin; i++) {
            if (EsPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean EsPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

	}

}

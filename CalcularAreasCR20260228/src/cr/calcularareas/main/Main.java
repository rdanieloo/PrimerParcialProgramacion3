//CarlosRamos20260228

package cr.calcularareas.main;

import cr.calcularareas.app.Figura;
import cr.calcularareas.app.Circulo;
import cr.calcularareas.app.Cuadrado;
import cr.calcularareas.app.Triangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("=========================================");
        System.out.println("   BIENVENIDO - CALCULADORA DE AREAS     ");
        System.out.println("   Proyecto: CalcularAreasCR20260228      ");
        System.out.println("=========================================");
        System.out.println("Por Favor Seleccione una figura:");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("-----------------------------------------");
        System.out.print("Ingrese su opcion (1, 2 o 3): ");

        opcion = scanner.nextInt();

        Figura figura = null;

        if (opcion == 1) {
            System.out.print("Ingrese el radio del circulo: ");
            double radio = scanner.nextDouble();
            figura = new Circulo(radio);

        } else if (opcion == 2) {
            System.out.print("Ingrese el lado del cuadrado: ");
            double lado = scanner.nextDouble();
            figura = new Cuadrado(lado);

        } else if (opcion == 3) {
            System.out.print("Ingrese la base del triangulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del triangulo: ");
            double altura = scanner.nextDouble();
            figura = new Triangulo(base, altura);

        } else {
            System.out.println("Opcion no valida. Por favor elija 1, 2 o 3.");
        }

        if (figura != null) {
            System.out.println("=========================================");
            System.out.println("RESULTADO:");
            System.out.println("Figura seleccionada : " + figura.getNombre());
            System.out.printf ("Area calculada      : %.2f%n", figura.calcularArea());
            System.out.println("=========================================");
        }

        scanner.close();
    }
}
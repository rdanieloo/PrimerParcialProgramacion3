//Problema 4  Validación de Contraseña

package tarea1carlosramos;

import java.util.Scanner;

public class Problema4ValidacionContrasena {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		    System.out.println("\n=========== Bienvenido!! ===========\n");
	        System.out.println("\n===== Validacion de Contrasena =====\n");

	        boolean esValida = false;

	        while (!esValida) {
	            System.out.print("Ingrese una contrasena, por favor: ");
	            String contrasena = scanner.nextLine();

	            esValida = validarPassword(contrasena);

	            if (!esValida) {
	                System.out.println("\nOpss :( \nLa contrasena no cumple con los requisitos.\n");
	                System.out.println("Por favor:");
	                System.out.println("Debe tener al menos 8 caracteres");
	                System.out.println("Debe contener al menos una letra mayuscula");
	                System.out.println("Debe contener al menos una letra minuscula");
	                System.out.println("Debe contener al menos un numero\n");
	            } else {
	                System.out.println("\n ¡Contrasena valida!\n");
	            }
	        }

	        scanner.close();
	    }

	    // Metodo que valida la contrasena 
	    public static boolean validarPassword(String pass) {
	        if (pass.length() < 8) {
	            return false;
	        }

	        boolean tieneMayuscula = false;
	        boolean tieneMinuscula = false;
	        boolean tieneNumero = false;

	   
	        for (int i = 0; i < pass.length(); i++) {
	            char caracter = pass.charAt(i);

	            if (Character.isUpperCase(caracter)) {
	                tieneMayuscula = true;
	            } else if (Character.isLowerCase(caracter)) {
	                tieneMinuscula = true;
	            } else if (Character.isDigit(caracter)) {
	                tieneNumero = true;
	            }
	        }

	        // cumple todos los requisitos
	        return tieneMayuscula && tieneMinuscula && tieneNumero;

	}

}

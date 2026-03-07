//CarlosRamos
//0905 23 14141
//Programacion 3 Primer Parcial


package ejercicio2;

public class Score {

	public static int score(int[] numbers) {
		
		int total = 0;
		
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 5) {
				total = total + 5;

			} else if (numbers[i] % 2 == 0) {
				total = total + 1;

			} else {
				total = total + 3;
			}
		}
		
		return total;
	}

	public static void main(String[] args) {
		
		int[] arreglo1 = {1, 2, 3, 4, 5};
		int[] arreglo2 = {17, 19, 21};
		int[] arreglo3 = {5, 5, 5};
		
		System.out.println("Prueba 1: " + score(arreglo1)); 
		System.out.println("Prueba 2: " + score(arreglo2)); 
		System.out.println("Prueba 3: " + score(arreglo3)); 
}
	
}


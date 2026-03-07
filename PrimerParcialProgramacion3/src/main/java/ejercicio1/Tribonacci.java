//CarlosRamos
//0905 23 14141
//Programacion 3 Primer Parcial

package ejercicio1;

public class Tribonacci {
	
public static int[] tribonacci(int[] signature, int n) {
		
		if (n == 0) {
			return new int[0];
		}
		
		int[] arreglo = new int[n];
		
		if (n == 1) {
			arreglo[0] = signature[0];
			return arreglo;
		}
		
		if (n == 2) {
			arreglo[0] = signature[0];
			arreglo[1] = signature[1];
			return arreglo;
		}
		
		// es la que copia signature completo
		arreglo[0] = signature[0];
		arreglo[1] = signature[1];
		arreglo[2] = signature[2];
		
		// es la que calcula el resto sumando los 3 anteriores
		for (int i = 3; i < n; i++) {
			arreglo[i] = arreglo[i-1] + arreglo[i-2] + arreglo[i-3];
		}
		
		return arreglo;
	}
	
	public static void main(String[] args) {
		
		int[] signature = {0, 0, 1};
		int n = 9;
		
		int[] resultado = tribonacci(signature, n);
		
		System.out.println(java.util.Arrays.toString(resultado));
	}
	
	

}

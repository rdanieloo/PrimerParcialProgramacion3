
//CarlosRamos
//0905 23 14141
//COMPILADORES20260227

package erroresLogicos;

public class EjemploLogico1 {
    public static int factorial(int n) {
        int resultado = 0;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("El resultado correcto deberia ser: 120");
    }
}


//CarlosRamos
//0905 23 14141
//COMPILADORES20260227

package erroresSemanticos;

public class EjemploSemantico5 {
    public static void multiplicar(int a, int b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        int resultado = multiplicar(4, 5);
        System.out.println(resultado);
    }
}



//CarlosRamos
//0905 23 14141
//COMPILADORES20260227

package erroresSemanticos;

public class EjemploSemantico2 {
    public static void main(String[] args) {
        final int MAXIMO = 100;
        MAXIMO = 200;
        System.out.println(MAXIMO);
    }
}


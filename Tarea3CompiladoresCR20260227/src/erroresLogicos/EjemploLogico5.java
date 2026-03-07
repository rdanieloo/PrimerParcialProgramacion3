
//CarlosRamos
//0905 23 14141
//COMPILADORES20260227

package erroresLogicos;

public class EjemploLogico5 {
    public static boolean esBisiesto(int anio) {
        if (anio % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("1900 es bisiesto?: " + esBisiesto(1900));
        System.out.println("El resultado correcto deberia ser: false");
    }
}

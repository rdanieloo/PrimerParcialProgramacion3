
//CarlosRamos
//0905 23 14141
//COMPILADORES20260227

package erroresLogicos;

public class EjemploLogico2 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i < 10; i++) {
            suma += i;
        }
        System.out.println("Suma del 1 al 10: " + suma);
        System.out.println("El resultado correcto deberia ser: 55");
    }
}



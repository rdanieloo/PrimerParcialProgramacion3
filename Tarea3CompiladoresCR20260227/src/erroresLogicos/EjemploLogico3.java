
//CarlosRamos
//0905 23 14141
//COMPILADORES20260227

package erroresLogicos;

public class EjemploLogico3 {
    public static boolean esMayorDeEdad(int edad) {
        if (edad > 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Tiene 18 anos, es mayor de edad?: " + esMayorDeEdad(18));
        System.out.println("El resultado correcto deberia ser: true");
    }
}
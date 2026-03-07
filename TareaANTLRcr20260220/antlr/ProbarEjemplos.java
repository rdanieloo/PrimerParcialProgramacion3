



import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ProbarEjemplos {
    public static void main(String[] args) throws Exception {

        String[] pruebas = {
            "c = (1/2) * a * b + 2 * d / f;",
            "area = 3.1416 * radio * radio;",
            "if (B > C)",
            "string x[20] = {\"Hola\"};"
        };

        for (String prueba : pruebas) {
            System.out.println("=== Probando: " + prueba + " ===");
            CharStream input = CharStreams.fromString(prueba);
            EjemplosLexer lexer = new EjemplosLexer(input);

            Token token = lexer.nextToken();
            while (token.getType() != Token.EOF) {
                System.out.println(
                    "TOKEN: " + token.getText() + 
                    " | Tipo: " + lexer.getVocabulary().getSymbolicName(token.getType())
                );
                token = lexer.nextToken();
            }

            System.out.println();
        }
    }
}
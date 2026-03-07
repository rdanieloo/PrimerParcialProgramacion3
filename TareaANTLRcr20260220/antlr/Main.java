
// Carlos Ramos
// 0905 23 14141
// Compiladores20260220


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromString("hola mundo !");

        HolaLexer lexer = new HolaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        HolaParser parser = new HolaParser(tokens);

        ParseTree tree = parser.saludo();
        System.out.println(tree.toStringTree(parser));
    }
}
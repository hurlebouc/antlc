/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turing;

import parser.turingParser;
import parser.turingLexer;
import AST.Program;
import org.antlr.runtime.*;

/**
 *
 * @author hubert
 */
public class Turing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RecognitionException {
        String s = "last(0(x11))";
        //String prog = "input( a,b,c){a:=r;while(gh){hf:=e;stop;};return b}";
        String src = utilitaire.Utilitaire.lireFichier("addition.while");
        
        CharStream stream = new ANTLRStringStream(src);
        turingLexer lexer = new turingLexer(stream);
        TokenStream tokenstream = new CommonTokenStream(lexer);
        turingParser parser = new turingParser(tokenstream);
        
        System.out.println("Parsing :\n=========");
        Program prog = parser.program();
        prog = prog.alphaRename();
        System.out.println("Type check :\n============");
        prog.typeCheck();
        System.out.println("Compile :\n=========");
        String asm = prog.toASM();
        utilitaire.Utilitaire.ecrireFichier("res.asm", asm);
    }

}

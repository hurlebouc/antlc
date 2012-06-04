/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turing;

import AST.Expression;
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
        // TODO code application logic here
        String s = "last(0(x11))";
        String prog = "input( a,b,c){a:=r;while(gh){hf:=e;stop;};return b}";
        
        CharStream stream = new ANTLRStringStream(prog);
        turingLexer lexer = new turingLexer(stream);
        TokenStream tokenstream = new CommonTokenStream(lexer);
        turingParser parser = new turingParser(tokenstream);
        
        
        Program e = parser.program();
        System.out.println(e.toASM());
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package turing;

import AST.Program;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import parser.turingLexer;
import parser.turingParser;

/**
 *
 * @author hubert
 */
public class TuringTest {
    
    public TuringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    Program initAST(String path) throws RecognitionException{
        String src = utilitaire.Utilitaire.lireFichier(path);
        CharStream stream = new ANTLRStringStream(src);
        turingLexer lexer = new turingLexer(stream);
        TokenStream tokenstream = new CommonTokenStream(lexer);
        turingParser parser = new turingParser(tokenstream);
        return parser.program();
    }

    /**
     * Test of main method, of class Turing.
     */
    @Test
    public void testAlpha() throws Exception {
        System.out.println("test alpha renommage");
        Program prog = initAST("test/turing/src_test/addition.while");
        String got = prog.alphaRename().prettyPrint();
        String verif = utilitaire.Utilitaire.lireFichier("test/turing/verif_test/addition_verif.while");
        assert(got.equals(verif));
    }
}
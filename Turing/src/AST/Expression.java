/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
abstract public class Expression {
    protected String type;
    
    abstract public String toAsm();
    
    abstract public String getType(Environment pool);
    
    abstract public void checkSemantique(Environment pool);
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
abstract public class Sous_Expression {
    protected String type;
    
    abstract public String toAsm();
    
    abstract public String getType(Pool pool);
    
    abstract public void checkSemantique(Pool pool);
}

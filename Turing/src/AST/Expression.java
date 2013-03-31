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
    
    abstract public String toAsm();
    
    abstract public Type getType(Environment env);
}

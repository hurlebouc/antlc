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
    private Type type;
    
    abstract public String toAsm();
    
    public Type getType(){
        return type;
    }
}

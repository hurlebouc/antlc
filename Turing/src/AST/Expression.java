/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.Environment;

/**
 *
 * @author hubert
 */
abstract public class Expression {
    protected String type;
    
    abstract public String toAsm();
    
    abstract public Type getType(Environment env);
    
//    @Deprecated
//    abstract public void typeCheck(Environment env);
}

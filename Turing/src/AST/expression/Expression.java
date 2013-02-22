/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.expression;

import AST.Environment;

/**
 *
 * @author hubert
 */
abstract public class Expression {
    protected String type;
    
    abstract public String toAsm();
    
    abstract public String getType(Environment env);
    
    abstract public void typeCheck(Environment env);
}

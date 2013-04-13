/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class UnboundVariableException extends Exception {
    public UnboundVariableException(String s){
        super(s);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class Head extends Expression{
    
    Expression e;
    
    public Head(Expression e){
        this.e = e;
        type = Type.get("string");
    }

    @Override
    public String toAsm() {
        String s = e.toAsm();
        s += "\tand\teax, 1\n";
        return s;
    }
    
}

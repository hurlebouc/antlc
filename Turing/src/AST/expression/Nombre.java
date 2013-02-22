/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.expression;

import AST.Environment;
import AST.expression.Expression;

/**
 *
 * @author hubert
 */
public class Nombre extends Expression {

    private int v;

    public Nombre(String s) {
        v = Integer.parseInt(s);
        this.type = "int";
    }

    @Override
    public String toAsm() {
        return "\tmov\teax, " + v + "\n";
    }

    @Override
    public void typeCheck(Environment env) {
    }
    
    public String toString(){
        return "Nombre[" + v + "]";
    }

    @Override
    public String getType(Environment env) {
        return "int";
    }
    
}

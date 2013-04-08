/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.expression;

import AST.Environment;
import AST.Expression;
import AST.Type;
import toolbox.base.Couple;
import toolbox.base.List;
import toolbox.usage.ICouple;

/**
 *
 * @author hubert
 */
public class Nombre extends Expression {

    private int v;

    public Nombre(String s) {
        v = Integer.parseInt(s);
    }

    @Override
    public String toAsm() {
        return "\tmov\teax, " + v + "\n";
    }
    
    public String toString(){
        return "Nombre[" + v + "]";
    }

    @Override
    public Type getType(Environment env) {
        return Type.tyint;
    }

    @Override
    public Expression alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) {
        return this;
    }
}

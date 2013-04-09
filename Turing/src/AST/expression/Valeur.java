/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.expression;

import AST.Environment;
import AST.Expression;
import AST.type.Type;
import toolbox.base.Couple;
import toolbox.base.List;
import toolbox.usage.ICouple;

/**
 *
 * @author hubert
 */
public class Valeur extends Expression {

    String v;

    public Valeur(String v) {
        this.v = v;
    }

    @Override
    public String toString() {

        return "Valeur[" + v + "]";
    }

    @Override
    public String toAsm() {
        String s = "\tmov\teax, 0\n";
        if (!v.equals("")) {
            s = "\tmov\teax, " + v + "\n";
        }
        return s;
    }

    @Override
    public Type getType(Environment env) {
        return Type.tystring;
    }

    @Override
    public Expression alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) {
        return this;
    }
}

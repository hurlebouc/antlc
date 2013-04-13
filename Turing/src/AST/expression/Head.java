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
public class Head extends Expression {

    Expression e;

    public Head(Expression e) {
        this.e = e;
    }

    @Override
    public String toAsm() {
        String s = e.toAsm();
        s += "\tand\teax, 1\n";
        return s;
    }

    @Override
    public Type getType(Environment env) {
        if (!e.getType(env).equals(Type.tyint)) {
            throw new UnsupportedOperationException("head() ne prend que des int et " + e + " est de type " + e.getType(env));
        }
        return Type.tyint;
    }

    @Override
    public Expression alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) {
        Expression alphaExpression = e.alphaRename(alphaMap);
        return new Head(alphaExpression);
    }

    @Override
    public String prettyPrint() {
        return "head(" + e.prettyPrint() + ")";
    }
}

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
public class Cons extends Expression {

    char hd;
    Expression tl;

    public Cons(char h, Expression t) {
        hd = h;
        tl = t;
    }

    @Override
    public String toString() {
        return "Cons[" + hd + ", " + tl + "]";
    }

    @Override
    public String toAsm() {
        String s = tl.toAsm();
        s += "\tshl\t eax, 1\n";
        switch (hd) {
            case '0':
                break;
            case '1':
                s += "\tinc\teax\n";
                break;
            default:
                throw new UnsupportedOperationException("caractère inconnu en tête");
        }
        return s;
    }

    @Override
    public Type getType(Environment env) {
        if(!tl.getType(env).equals(Type.tyint)){
            throw new UnsupportedOperationException("cons() ne prend que des int et " + tl + " est de type " + tl.getType(env));
        }
        return Type.tyint;
    }

    @Override
    public Expression alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) {
        Expression alphaExpression = tl.alphaRename(alphaMap);
        return new Cons(hd, alphaExpression);
    }
}

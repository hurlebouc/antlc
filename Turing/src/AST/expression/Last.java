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
public class Last extends Expression {

    Expression sub;
    
    public Last(Expression s){
        this.sub = s;
    }
    
    @Override
    public String toString(){
        return "Last[" + sub + "]";
    }

    @Override
    public String toAsm() {
        String code = sub.toAsm();
        code += "\tshr\teax, 1\n";
        return code;
    }

    @Override
    public Type getType(Environment env) {
        if(!sub.getType(env).equals(Type.tyint)){
            throw new UnsupportedOperationException("last() ne prend que des int et " + sub + " est de type " + sub.getType(env));
        }
        return Type.tyint;
    }

    @Override
    public Expression alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) {
        Expression alphaExpression = sub.alphaRename(alphaMap);
        return new Last(alphaExpression);
    }

    @Override
    public String prettyPrint() {
        return "last(" + sub.prettyPrint() + ")";
    }
}

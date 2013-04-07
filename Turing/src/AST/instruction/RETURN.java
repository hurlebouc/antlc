/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.Expression;
import AST.Type;
import AST.expression.Variable;
import toolbox.base.Couple;
import toolbox.usage.ICouple;
import toolbox.base.List;

/**
 *
 * @author hubert
 */
public class RETURN extends Instruction {

    private Expression output;

    public RETURN(Expression e) {
        this.output = e;
    }

    @Override
    public String toAsm() {
        String s = output.toAsm();
        s += "\tjmp\tendprog\n";
        return s;
    }

    @Override
    public boolean typeCheck(Environment env) {
        if (!Type.tyint.equals(output.getType(env))) {
            throw new UnsupportedOperationException("return ne peut renvoyer que des (int) mais " + output + " est de type (" + output.getType(env) + ").");
        }
        return true;
    }

    @Override
    public Environment nextEnv(Environment env) {
        return env;
    }

    @Override
    public Variable fetchVar() {
        return null;
    }

    @Override
    public Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) {
        output.alphaRename(alphaMap);
        return alphaMap;
    }
}

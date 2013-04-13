/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.Expression;
import AST.type.Type;
import AST.expression.Variable;
import toolbox.base.Couple;
import toolbox.usage.ICouple;
import toolbox.base.List;
import toolbox.pack.RenamingPack;

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
    public RenamingPack<Instruction> alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) {
        Expression alphaExpression = output.alphaRename(alphaMap);
        RenamingPack<Instruction> res = new RenamingPack(new RETURN(alphaExpression), alphaMap);
        return res;
    }

    @Override
    public String prettyPrint(String offset) {
        return offset + "return " + output.prettyPrint();
    }
}

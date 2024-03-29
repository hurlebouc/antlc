/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.type.Type;
import AST.expression.Variable;
import toolbox.base.Couple;
import toolbox.usage.ICouple;
import toolbox.base.List;
import toolbox.pack.RenamingPack;

/**
 *
 * @author devlopmac
 */
public class Stop extends Instruction {

    @Override
    public String toString() {
        return "STOP\n";

    }

    @Override
    public String toAsm() {
        return "\tjmp\tendprog\n";
    }

    @Override
    public void typeCheck(Environment env) {}

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
        RenamingPack<Instruction> res = new RenamingPack<Instruction>(new Stop(), alphaMap);
        return res;
    }

    @Override
    public String prettyPrint(String offset) {
        return offset + "stop";
    }
}

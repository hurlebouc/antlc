/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.expression.Variable;
import AST.Expression;
import AST.type.Type;
import toolbox.base.Couple;
import toolbox.usage.ICouple;
import toolbox.base.List;
import toolbox.pack.RenamingPack;

/**
 *
 * @author devlopmac
 */
public class Affectation extends Instruction {

    private Variable var;
    private Expression e;

    public Affectation(String varName, Expression e) {
//        this.var = Variable.get(varName); // plante si jamais intialisé
        this.var = Variable.newVariable(varName);
        this.e = e;
    }
    
    private Affectation(Variable var, Expression e) {
//        this.var = Variable.get(varName); // plante si jamais intialisé
        this.var = var;
        this.e = e;
    }

    @Override
    public String toString() {
        return var + " := " + e + "\n";
    }

    @Override
    public String toAsm() {
        String code = e.toAsm();
        return code + "\tmov\t[" + var + "], eax\n";
    }

    @Override
    public boolean typeCheck(Environment env) {
//        Variable variable = env.existVar(var);
        Type typeExpr = e.getType(env);
        Type typeVar = var.getType(env);
        if (typeVar.equals(Type.tystring) && typeExpr.equals(Type.tyint)) {
            System.out.println("WARNING : conversion automatique int -> string.");
        } else if (!typeVar.equals(typeExpr)) {
            return false;
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
        Variable alphaVar = (Variable) var.alphaRename(alphaMap);
        Expression alphaExpr = e.alphaRename(alphaMap);
        Instruction alphaInstr = new Affectation(alphaVar, alphaExpr);
        RenamingPack<Instruction> res = new RenamingPack<Instruction>(alphaInstr, alphaMap);
        return res;
    }

    @Override
    public String prettyPrint(String offset) {
        return offset + var.prettyPrint() + " := " + e.prettyPrint();
    }

    
}

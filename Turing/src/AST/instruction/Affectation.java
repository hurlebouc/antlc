/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.expression.Variable;
import AST.expression.Expression;

/**
 *
 * @author devlopmac
 */
public class Affectation extends Instruction {

    private String varName;
    private Expression e;

    public Affectation(String varName, Expression e) {
//        this.var = Variable.get(varName); // plante si jamais intialisé
        this.varName = varName;
        this.e = e;
    }

    @Override
    public String toString() {
        return varName + " := " + e + "\n";
    }

    @Override
    public String toAsm() {
        String code = e.toAsm();
        return code + "\tmov\t[" + varName + "], eax\n";
    }

    @Override
    public void typeCheck(Environment env) {
        Variable variable = env.existVar(varName);
        if (variable.getType(env).equals("string") && e.getType(env).equals("int")) {
            System.out.println("WARNING : cast automatique.");
        } else if (!variable.getType(env).equals(e.getType(env))) {
            throw new UnsupportedOperationException("Type de " + variable.getName() + " (" + variable.getType(env) + ") non compatible avec (" + e.getType(env) + ")");
        }
        e.typeCheck(env);
    }
}

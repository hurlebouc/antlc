/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author devlopmac
 */
public class Affectation extends Instruction {

    Variable var;
    Expression e;

    public Affectation(Variable var, Expression e) {
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
        return code + "\tmov\t[" + var.getName() + "], eax\n";
    }
}

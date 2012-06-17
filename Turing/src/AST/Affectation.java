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
    public void checkSemantique(Pool pool) {
        Variable variable = pool.existVar(varName);
        if (variable.getType(pool).equals("string") && e.getType(pool).equals("int")) {
            System.out.println("WARNING : cast automatique.");
        } else if (!variable.getType(pool).equals(e.getType(pool))) {
            throw new UnsupportedOperationException("Type de " + variable.getName() + " (" + variable.getType(pool) + ") non compatible avec (" + e.getType(pool) + ")");
        }
        e.checkSemantique(pool);
    }
}

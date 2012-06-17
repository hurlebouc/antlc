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

    @Deprecated
    public Affectation(Variable var, Expression e) {
        this.var = var;
        this.e = e;
    }

    public Affectation(String varName, Expression e) {
        this.var = Variable.get(varName);
        
        if(var.getType().equals(e.getType())){
            this.e = e;
            return;
        }

        if (var.getType().equals(Type.get("string")) && e.getType().equals(Type.get("int"))) {
            System.out.println("WARNING : cast automatique.");
            this.e = e;
            return;
        } else {
            throw new UnsupportedOperationException("Type de " + varName + " (" + var.getType() + ") non compatible avec (" + e.getType() + ")");
        }
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

    @Override
    public void checkSementique(Pool pool) {
        var.checkSementique(pool);
        if(!var.getType().equals(e.getType())){
            throw new UnsupportedOperationException("Type de " + var.getName() + " (" + var.getType() + ") non compatible avec (" + e.getType() + ")");
        }
        e.checkSementique(pool);
    }
}

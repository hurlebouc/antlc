/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class VarDeclaration extends Instruction {

    private Variable var;

    @Deprecated
    public VarDeclaration(Variable v) {
        this.var = v;
    }
    
    public VarDeclaration(String varName, String typeName) {
        this.var = Variable.declare(varName, typeName);
    }
    
    @Override
    public String toString() {
        return var.toString();
    }

    @Override
    public String toAsm() {
        return "";
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.expression.Variable;

/**
 *
 * @author hubert
 */
public class VarDeclaration extends Instruction {

    private Variable var;
    private String typeName;
    private String varName;

    @Deprecated
    public VarDeclaration(Variable v) {
        this.var = v;
    }
    
    public VarDeclaration(String varName, String typeName) {
//        this.var = Variable.declare(varName, typeName);
        this.typeName = typeName;
        this.varName = varName;
        this.var = Variable.init(varName);
    }
    
    @Override
    public String toString() {
        return var.toString();
    }

    @Override
    public String toAsm() {
        return "";
    }

    @Override
    public void typeCheck(Environment env) {
        env.existType(typeName);
        env.declareVar(varName, typeName);
    }
}

    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.Type;
import AST.expression.Variable;

/**
 *
 * @author hubert
 */
public class VarDeclaration extends Instruction {

    private Variable var;
    private Type type;

    @Deprecated
    public VarDeclaration(Variable v) {
        this.var = v;
    }
    
    public VarDeclaration(String varName, String typeName) {
//        this.var = Variable.declare(varName, typeName);
        this.type = Type.newType(typeName);
        this.var = Variable.newVariable(varName);
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
    public boolean typeCheck(Environment env) {
        env.existType(type);
        return true;
    }

    @Override
    public Environment nextEnv(Environment env) {
        
        // ... alpha-renommage
        return env.addVariable(var, type); 
    }

    @Override
    public Variable fetchVar() {
        return this.var;
    }
}

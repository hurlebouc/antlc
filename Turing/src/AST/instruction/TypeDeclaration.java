/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.Type;

/**
 *
 * @author hubert
 */
public class TypeDeclaration extends Instruction {

    private Type type;

    public TypeDeclaration(String typeName) {
        this.type = Type.declare(typeName);
    }

    @Override
    public String toAsm() {
        return "";
    }

    @Override
    public void typeCheck(Environment env) {
        env.declareType(type.getName());
    }
}

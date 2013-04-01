/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.Type;
import AST.expression.Variable;
import java.util.LinkedList;

/**
 * On va dire qu'on pet déclarer un type n'importe où...
 * @author hubert
 */
public class TypeDeclaration extends Instruction {

    private Type type;

    public TypeDeclaration(String typeName) {
        this.type = Type.newType(typeName);
    }

    @Override
    public String toAsm() {
        return "";
    }

    @Override
    public boolean typeCheck(Environment env) {
        return true;
//        env.declareType(type);
    }

    @Override
    public Environment nextEnv(Environment env) {
        /*
         * Ici on se contente d'ajouter le nouveau type à l'environnement car on
         * suppose que tous les types sont différents par alpha-renommage.
         */
        return env.addType(type); 
    }

    @Override
    public Variable fetchVar() {
        return null;
    }
}

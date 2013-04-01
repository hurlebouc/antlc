/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.expression.Variable;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author devlopmac
 */
public class Arguments extends LinkedList<Variable>{
    
    private Environment intEnv;
    
    public Arguments(String varName, String typeName){
        super();
        intEnv = new Environment(null);
        this.addVar(varName, typeName);
    }
    
    public void addVar(String varName, String typeName){
        // vérifier que toutes les variales ont des noms différents
        this.addFirst(Variable.newVariable(varName));
        intEnv = intEnv.addVariable(Variable.newVariable(varName), Type.newType(typeName));
    }
    
    public Environment buildLocalEnv(){
        return intEnv;
    }

    LinkedList<Variable> fetchVar() {
        return this;
    }
}
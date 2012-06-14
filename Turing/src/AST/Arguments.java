/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.util.LinkedList;

/**
 *
 * @author devlopmac
 */
public class Arguments extends LinkedList<Variable>{
    
    @Deprecated
    public Arguments(Variable var){
        super();
        this.add(var);
    }
    
    public Arguments(String varName, String typeName){
        super();
        this.addVar(varName, typeName);
    }
    
    public void addVar(String varName, String typeName){
        this.addFirst(Variable.declare(varName, typeName));
    }
}
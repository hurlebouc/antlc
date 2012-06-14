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
    
    public Arguments(String varName){
        super();
        this.addVar(varName);
    }
    
    public void addVar(String varName){
        this.addFirst(Variable.init(varName));
    }
}
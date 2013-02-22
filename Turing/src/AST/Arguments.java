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
    
    private Environment initialPool;
    
    public Arguments(String varName, String typeName){
        super();
        initialPool = new Environment(null);
        this.addVar(varName, typeName);
    }
    
    public void addVar(String varName, String typeName){
        this.addFirst(Variable.init(varName));
        initialPool.declareVar(varName, typeName);
    }
    
    public Environment getPool(){
        return initialPool;
    }
}
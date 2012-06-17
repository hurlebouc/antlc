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
    
    private Pool initialPool;
    
    public Arguments(String varName, String typeName){
        super();
        initialPool = new Pool(null);
        this.addVar(varName, typeName);
    }
    
    public void addVar(String varName, String typeName){
        this.addFirst(Variable.init(varName));
        initialPool.declareVar(varName, typeName);
    }
    
    public Pool getPool(){
        return initialPool;
    }
}
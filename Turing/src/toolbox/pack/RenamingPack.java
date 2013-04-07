/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox.pack;

import AST.Instructions;
import AST.Type;
import AST.expression.Variable;
import toolbox.base.Couple;
import toolbox.base.List;
import toolbox.usage.ICouple;

/**
 *
 * @author hubert
 */
public class RenamingPack<T> {
    
    private T listInst;
    private Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap;
    
    public RenamingPack(
            T listInst, 
            Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap){
        this.alphaMap = alphaMap;
        this.listInst = listInst;
    }
    
    public T getRenamed(){
        return listInst;
    }
    
    public Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> getAlphaMap(){
        return alphaMap;
    }
}

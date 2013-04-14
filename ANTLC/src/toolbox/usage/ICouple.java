/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toolbox.usage;

import toolbox.base.Couple;

/**
 *
 * @author hubert
 */
public class ICouple<T,S> extends Couple<T,S>{
    
    private int index;
    
    public ICouple(T t, S s, int i){
        super(t,s);
        index = i;
    }
    
    public int getIndex(){
        return index;
    }
}

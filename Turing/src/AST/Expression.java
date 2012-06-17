/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
abstract public class Expression {
    protected Type type;
    
    abstract public String toAsm();
    
    public Type getType(){
        return type;
    }
    
    public void setType(Type type){
        this.type = type;
    }
    
    abstract public void checkSementique(Pool pool);
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class Last extends Expression {

    Expression sub;
    
    public Last(Expression s){
        this.sub = s;
        if(!s.getType().equals(Type.get("int"))){
            throw new UnsupportedOperationException("last() ne prend que des int et " + s + " est de type " + s.getType());
        }
        type = Type.get("int");
    }
    
    @Override
    public String toString(){
        return "Last[" + sub + "]";
    }

    @Override
    public String toAsm() {
        String code = sub.toAsm();
        code += "\tshr\teax, 1\n";
        return code;
    }

    @Override
    public void checkSementique(Pool pool) {
        if(!sub.getType().equals(Type.get("int"))){
            throw new UnsupportedOperationException("last() ne prend que des int et " + sub + " est de type " + sub.getType());
        }
        sub.checkSementique(pool);
    }
}

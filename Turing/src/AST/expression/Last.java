/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.expression;

import AST.Environment;
import AST.Expression;

/**
 *
 * @author hubert
 */
public class Last extends Expression {

    Expression sub;
    
    public Last(Expression s){
        this.sub = s;
//        if(!s.getType().equals("int")){
//            throw new UnsupportedOperationException("last() ne prend que des int et " + s + " est de type " + s.getType());
//        }
        type = "int";
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
    public void typeCheck(Environment env) {
        if(!sub.getType(env).equals("int")){
            throw new UnsupportedOperationException("last() ne prend que des int et " + sub + " est de type " + sub.getType(env));
        }
        sub.typeCheck(env);
    }

    @Override
    public String getType(Environment env) {
        return "int";
    }
}

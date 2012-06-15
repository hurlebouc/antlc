/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class Nombre extends Expression{

    private int v;
    
    public Nombre(String s){
        v = Integer.parseInt(s);
    }
    
    @Override
    public String toAsm() {
        return "\tmov\teax, " + v + "\n";
    }
    
}

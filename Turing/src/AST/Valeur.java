/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class Valeur extends Expression {

    String v;

    public Valeur(String v) {
        this.v = v;
    }

    @Override
    public String toString() {

        return "Valeur[" + v + "]";
    }

    @Override
    public String toAsm() {
        String s = "\tmov\teax, 0";
        if (!v.equals("")) {
            s = "\tmov\teax, " + v + "\n";
        }
        return s;
    }
}

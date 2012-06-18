/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class Valeur extends Sous_Expression {

    String v;

    public Valeur(String v) {
        this.v = v;
        type = "string";
    }

    @Override
    public String toString() {

        return "Valeur[" + v + "]";
    }

    @Override
    public String toAsm() {
        String s = "\tmov\teax, 0\n";
        if (!v.equals("")) {
            s = "\tmov\teax, " + v + "\n";
        }
        return s;
    }

    @Override
    public void checkSemantique(Pool pool) {
    }

    @Override
    public String getType(Pool pool) {
        return "string";
    }
}

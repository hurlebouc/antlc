/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class Cons extends Expression {

    char hd;
    Expression tl;

    public Cons(char h, Expression t) {
        hd = h;
        tl = t;
    }

    @Override
    public String toString() {
        return "Cons[" + hd + ", " + tl + "]";
    }

    @Override
    public String toAsm() {
        String s = tl.toAsm();
        s += "\tshl\t eax, 1\n";
        switch (hd) {
            case '0':
                break;
            case '1':
                s += "\tinc\teax\n";
                break;
            default:
                throw new UnsupportedOperationException("caractère inconnu en tête");
        }
        return s;
    }
}

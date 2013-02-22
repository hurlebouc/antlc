/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class Head extends Expression {

    Expression e;

    public Head(Expression e) {
        this.e = e;
//        if (!e.getType().equals("int")) {
//            throw new UnsupportedOperationException("head() ne prend que des int et " + e + " est de type " + e.getType());
//        }
        type = "int";
    }

    @Override
    public String toAsm() {
        String s = e.toAsm();
        s += "\tand\teax, 1\n";
        return s;
    }

    @Override
    public void checkSemantique(Environment pool) {
        if (!e.getType(pool).equals("int")) {
            throw new UnsupportedOperationException("head() ne prend que des int et " + e + " est de type " + e.getType(pool));
        }
        e.checkSemantique(pool);
    }

    @Override
    public String getType(Environment pool) {
        return "int";
    }
}

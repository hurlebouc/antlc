/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class RETURN extends Instruction {

    private Expression output;

    public RETURN(Expression e) {
        this.output = e;
    }

    @Override
    public String toAsm() {
        String s = output.toAsm();
        s += "\tjmp\tendprog\n";
        return s;
    }

    @Override
    public void checkSemantique(Pool pool) {
        if (!"int".equals(output.getType().getName())) {
            throw new UnsupportedOperationException("return ne peut renvoyer que des (int) mais " + output + " est de type (" + output.getType() + ").");
        }
        output.checkSementique(pool);
    }
}

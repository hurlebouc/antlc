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
    public void typeCheck(Environment env) {
        if (!"int".equals(output.getType(env))) {
            throw new UnsupportedOperationException("return ne peut renvoyer que des (int) mais " + output + " est de type (" + output.getType(env) + ").");
        }
        output.checkSemantique(env);
    }
}

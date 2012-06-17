/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author devlopmac
 */
public class Stop extends Instruction {

    @Override
    public String toString() {
        return "STOP\n";

    }

    @Override
    public String toAsm() {
        return "\tjmp\tendprog\n";
    }

    @Override
    public void checkSemantique(Pool pool) {
    }
}

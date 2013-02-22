/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;

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
    public void typeCheck(Environment env) {
    }
}

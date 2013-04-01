/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.expression.Variable;
import java.util.LinkedList;

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
    public boolean typeCheck(Environment env) {
        return true;
    }

    @Override
    public Environment nextEnv(Environment env) {
        return env;
    }

    @Override
    public Variable fetchVar() {
        return null;
    }
}

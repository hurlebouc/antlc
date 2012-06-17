/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
abstract public class Instruction {
    abstract public String toAsm();
    abstract public void checkSemantique(Pool pool);
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.util.LinkedList;

/**
 *
 * @author devlopmac
 */
public class Instructions extends LinkedList<Instruction>{    
    
    public void checkSemantique(Environment pool){
        Environment newPool = new Environment(pool);
        for (Instruction instruction : this) {
            instruction.typeCheck(newPool);
        }
    }
}

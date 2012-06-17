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
    
    public void checkSemantique(Pool pool){
        Pool newPool = new Pool(pool);
        for (Instruction instruction : this) {
            instruction.checkSemantique(newPool);
        }
    }
}

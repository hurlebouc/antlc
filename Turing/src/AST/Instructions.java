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
    
    public void typeCheck(Environment env){
        Environment newPool = new Environment(env);
        for (Instruction instruction : this) {
            instruction.typeCheck(newPool);
        }
    }
}

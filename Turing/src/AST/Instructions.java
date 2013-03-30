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
    
    public boolean typeCheck(Environment env){
        Environment newEnv = env;
        for (Instruction instruction : this) {
            if (!instruction.typeCheck(newEnv)){
                return false;
            }
            newEnv = instruction.nextEnv(newEnv);
        }
        return true;
    }
}

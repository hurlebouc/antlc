/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.expression.Variable;
import java.util.LinkedList;
import toolbox.Couple;
import toolbox.List;

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

    LinkedList<Variable> fetchVar() {
        LinkedList<Variable> res = new LinkedList<Variable>();
        for (Instruction instr : this) {
            Variable newVariable = instr.fetchVar();
            if(newVariable != null){
                res.add(newVariable);
            }
        }
        return res;
    }

    List<Couple<Variable, Variable>> alphaRename(List<Couple<Variable, Variable>> mapVar) {
        
    }
}

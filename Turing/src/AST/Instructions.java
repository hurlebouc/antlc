/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.type.Type;
import AST.expression.Variable;
import java.util.LinkedList;
import toolbox.base.Couple;
import toolbox.usage.ICouple;
import toolbox.base.List;
import toolbox.pack.RenamingPack;

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

    public LinkedList<Variable> fetchVar() {
        LinkedList<Variable> res = new LinkedList<Variable>();
        for (Instruction instr : this) {
            Variable newVariable = instr.fetchVar();
            if(newVariable != null){
                res.add(newVariable);
            }
        }
        return res;
    }

    /**
     * ATTENTION : cette fonction introduit des effets de bord car elle modifie
     * son appelant.
     * @param mapVar
     * @return 
     */
    public RenamingPack<Instructions> alphaRename(
            Couple< List<ICouple<Variable, Variable>>,
                    List<ICouple<Type, Type>> > alphaMap) {
        Instructions alphaInstr = new Instructions();
        for (Instruction instruction : this) {
            RenamingPack<Instruction> packInstr = instruction.alphaRename(alphaMap);
            alphaMap = packInstr.getAlphaMap();
            alphaInstr.addLast(packInstr.getRenamed());
        }
        RenamingPack<Instructions> res = new RenamingPack(alphaInstr, alphaMap);
        return res;
    }
}

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
import toolbox.io.IO;
import toolbox.pack.RenamingPack;

/**
 *
 * @author devlopmac
 */
public class Program {

    Arguments arg;
    Instructions instr;

    public Program(Arguments arg, Instructions instr) {
        this.arg = arg;
        this.instr = instr;
    }

    @Override
    public String toString() {
        return "input(" + arg + ") " + "{\n" + instr + "\n}";
    }

    public String toASM() {
        String asm = IO.lireFichier("src/AST/corps.asm");
        String var = new String();
        LinkedList<Variable> VarList = fetchVar();
        for (Variable v : VarList) {
            var += v.getName() + ": \t dd 0\n";
        }
        asm = asm.replaceFirst("VAR_LIST", var);

        var = "" + (Arguments.length(arg) + 1);
        asm = asm.replaceFirst("INPUT_NUMBER", var);

        var = "";
        Arguments iter = arg;
        int i = 0;
        while(!Arguments.isEmpty(iter)){
            Variable variable = iter.head().fst;
            var += "\tmov\teax, [ebx+" + ((i + 1) * 4) + "]\n\tcall\tatoi\n\tmov\t[" + variable.getName() + "], eax\n\n";
            i++;
            iter = (Arguments) iter.tail();
        }
        
        asm = asm.replaceFirst("INPUT_LIST", var);

//        asm = asm.replaceFirst(";OUTPUT", "\tmov\teax, [" + output.getName() + "]\n");

        var = "";
        for (Instruction instr_ : this.instr) {
            var += instr_.toAsm();
        }
        asm = asm.replaceFirst("CORPS", var);

        return asm;
    }

    private LinkedList<Variable> fetchVar() {
        LinkedList<Variable> res = instr.fetchVar();
        res.addAll(arg.fetchVar());
        return res;
    }

    public void typeCheck() throws TypingException {
        Environment env = Type.getBuiltInEnv();
        env = Environment.concat(env, arg.buildLocalEnv());
        instr.typeCheck(env);
    }

    public Program alphaRename() throws UnboundTypeException, UnboundVariableException, DuplicatedNameException {
        Couple< List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap;
        alphaMap = Type.getBuiltInAlphaMap();
        RenamingPack<Arguments> packedAlphaArg= Arguments.alphaRename(alphaMap, arg);
        alphaMap = packedAlphaArg.getAlphaMap();
        RenamingPack<Instructions> PackedAlphaInstr = instr.alphaRename(alphaMap);
        Arguments alphaArg = packedAlphaArg.getRenamed(); // CHANGER ICI !!!!!!!!!
        Instructions alphaInstr = PackedAlphaInstr.getRenamed();
        return new Program(alphaArg, alphaInstr);
    }
    
    public String prettyPrint(){
        String res = "input(";
        res += arg.prettyPrint() + "){\n";
        res += instr.prettyPrint("   ");
        res += "}\n";
        return res;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import utilitaire.Utilitaire;

/**
 *
 * @author devlopmac
 */
public class Program {

    Arguments arg;
    Instructions instr;
//    Variable output;

//    @Deprecated
//    public Program(Arguments arg, Instructions instr, Variable var) {
//        this.arg = arg;
//        this.instr = instr;
//        this.output = var;
//    }
//    
//    @Deprecated
//    public Program(Arguments arg, Instructions instr, String varName) {
//        this.arg = arg;
//        this.instr = instr;
//        this.output = Variable.get(varName);
//    }
    
    public Program(Arguments arg, Instructions instr) {
        this.arg = arg;
        this.instr = instr;
    }
    
    public void typeCheck(){
        Environment env = arg.getPool();
        instr.typeCheck(env);
    }
    
    @Override
    public String toString(){
        return "input(" + arg + ") " + "{\n" + instr + "\n}";
    }
    
    public String toASM(){
        String asm = Utilitaire.lireFichier("src/AST/corps.asm");
        String var = new String();
        for(Variable v : Variable.listevar){
            var += v.getName() + ": \t dd 0\n";
        }
        asm =  asm.replaceFirst("VAR_LIST", var);
        
        var = "" + (arg.size() + 1);
        asm =  asm.replaceFirst("INPUT_NUMBER", var);
        
        var = "";
        for(int i = 0; i<arg.size(); i++){
            var += "\tmov\teax, [ebx+" + ((i+1)*4) + "]\n\tcall\tatoi\n\tmov\t[" + arg.get(i).getName() + "], eax\n\n";
        }
        asm =  asm.replaceFirst("INPUT_LIST", var);
        
//        asm = asm.replaceFirst(";OUTPUT", "\tmov\teax, [" + output.getName() + "]\n");
        
        var = "";
        for(Instruction instr : this.instr){
            var += instr.toAsm();
        }
        asm =  asm.replaceFirst("CORPS", var);
        
        return asm;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.Instructions;
import AST.Expression;
import AST.Type;

/**
 *
 * @author devlopmac
 */
public class WHILE extends Instruction {

    Expression e;
    Instructions li;
    private int id;
    private static int cpt;

    public WHILE(Expression e, Instructions li) {
        this.e = e;
//        if(!e.getType().equals("int")){
//            throw new UnsupportedOperationException("while réclame un type int mais " + e + " est de type " + e.getType());
//        }
        this.li = li;
        id = cpt++;
    }

    @Override
    public String toString() {
        return "while(" + e + ")\n{" + li + "}\n";
    }

    @Override
    public String toAsm() {
        String s = "beginwhile" + id + ":\n";
        s += e.toAsm();
        s += "\tcmp\teax, 0\n";
        s += "\tje\tendwhile"+id+"\n";
        for (Instruction instr : li) {
            s += instr.toAsm();
        }
        s += "\tjmp\tbeginwhile"+id+"\n";
        s += "endwhile" + id + ":\n";
        return s;
    }

    @Override
    public boolean typeCheck(Environment env) {
        if(!e.getType(env).equals(Type.tyint)){
//            throw new UnsupportedOperationException("while réclame un type int mais " + e + " est de type " + e.getType(env));
            return false;
        }
        return li.typeCheck(env);
    }

    @Override
    public Environment nextEnv(Environment env) {
        return env;
    }
}

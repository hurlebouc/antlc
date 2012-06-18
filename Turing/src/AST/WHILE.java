/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author devlopmac
 */
public class WHILE extends Instruction {

    Sous_Expression e;
    Instructions li;
    private int id;
    private static int cpt;

    public WHILE(Sous_Expression e, Instructions li) {
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
    public void checkSemantique(Pool pool) {
        if(!e.getType(pool).equals("int")){
            throw new UnsupportedOperationException("while réclame un type int mais " + e + " est de type " + e.getType(pool));
        }
        li.checkSemantique(pool);
    }
}

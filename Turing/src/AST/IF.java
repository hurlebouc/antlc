/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author devlopmac
 */
public class IF extends Instruction {

    Expression e1;
    Expression e2;
    Instructions li;
    int id;
    static int cpt = 0;

    public IF(Expression e1, Expression e2, Instructions li) {
        this.e1 = e1;
        this.e2 = e2;
        this.li = li;
        id = cpt++;
    }

    @Override
    public String toString() {
        return "if(" + e1 + ", " + e2 + ")\n\t{" + li + "}\n";
    }

    @Override
    public String toAsm() {
        String s = e1.toAsm();
        s += "\tmov\tebx, eax\n";
        s += e2.toAsm();
        s += "\tcmp\teax, eax\n\tjne\tendif" + id + "\n";
        for (Instruction instr : li) {
            s += instr.toAsm();
        }
        s += "endif" + id + ":\n";
        return s;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.Instructions;
import AST.Expression;
import AST.TypingException;
import AST.UnboundTypeException;
import AST.UnboundVariableException;
import AST.type.Type;
import AST.expression.Variable;
import java.util.logging.Level;
import java.util.logging.Logger;
import toolbox.base.Couple;
import toolbox.usage.ICouple;
import toolbox.base.List;
import toolbox.pack.RenamingPack;

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
        s += "\tcmp\teax, ebx\n\tjne\tendif" + id + "\n";
        for (Instruction instr : li) {
            s += instr.toAsm();
        }
        s += "endif" + id + ":\n";
        return s;
    }

    @Override
    public void typeCheck(Environment env) throws TypingException {
        Type te1 = e1.getType(env);
        Type te2 = e2.getType(env);
        if (!te1.equals(te2)) {
//            throw new UnsupportedOperationException(
//                    "test entre " + e1 + " (" + te1 + ") et " 
//                    + e2 + " (" + te2 + ")");
//            Logger.getLogger(VarDeclaration.class.getName()).log(Level.SEVERE, "Test d''\u00e9galit\u00e9 entre deux expressions de types diff\u00e9rents : {0} et {1}", new Object[]{te1.getName(), te2.getName()});
            throw new TypingException("Test d''\u00e9galit\u00e9 entre deux "
                    + "expressions de types diff\u00e9rents : "
                    + te1.getName()
                    + " et "
                    + te2.getName());
        }
        li.typeCheck(env);
    }

    @Override
    public Environment nextEnv(Environment env) {
        return env;
    }

    @Override
    public Variable fetchVar() {
        return null;
    }

    @Override
    public RenamingPack<Instruction> alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) throws UnboundTypeException, UnboundVariableException {
        Expression alphaExpr1 = e1.alphaRename(alphaMap);
        Expression alphaExpr2 = e2.alphaRename(alphaMap);
        RenamingPack<Instructions> PackListInstr = li.alphaRename(alphaMap);
        
        Instruction alphaIF = new IF(alphaExpr1, alphaExpr2, PackListInstr.getRenamed());
        return new RenamingPack<Instruction>(alphaIF, alphaMap); // après le if, le alpha est le même qu'au début
    }

    @Override
    public String prettyPrint(String offset) {
        String res = offset + "if(" + e1.prettyPrint() + " = " + e2.prettyPrint() + ") {\n";
        res += li.prettyPrint(offset + "   ");
        res += offset + "}";
        return res;
    }


}

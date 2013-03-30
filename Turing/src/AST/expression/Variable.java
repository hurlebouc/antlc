/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.expression;

import AST.Environment;
import AST.Expression;
import AST.Type;
import java.util.ArrayList;

/**
 *
 * @author hubert
 */
public class Variable extends Expression {

    public static ArrayList<Variable> listevar;

    public static Variable newVariable(String varName) {
        return new Variable(varName, null);
    }
    private String nom;

    private Variable(String nom, String type) {
        this.nom = nom;
        this.type = type;
        if (listevar == null) {
            listevar = new ArrayList<Variable>();
        }
//        listevar.add(this);
    }

    private static Variable search(String nom) {
        if (listevar == null) {
            return null;
        }
        for (Variable variable : listevar) {
            if (variable.nom.equals(nom)) {
                return variable;
            }
        }
        return null;
    }

    public static Variable init(String varName) {
        Variable res = Variable.search(varName);
        if (res == null) {
            Variable v = new Variable(varName, null);
            Variable.listevar.add(v);
            return v;
        }
        return res;
    }

    public static Variable newUnlinked(String nom, String type) {
        return new Variable(nom, type);
    }

    @Override
    public String toString() {
        return "Variable[" + nom + "]";
    }

    public String getName() {
        return this.nom;
    }

    @Override
    public String toAsm() {
        return "\tmov\teax, [" + nom + "]\n";
    }

    @Override
    public void typeCheck(Environment env) { // test l'existance
        env.existVar(nom);
    }

    @Override
    public Type getType(Environment env) {
        return env.existVar(nom).type;
    }
    
    public boolean equals(Variable var){
        return this.nom.equals(var.nom);
    }
}

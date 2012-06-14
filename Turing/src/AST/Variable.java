/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.util.ArrayList;

/**
 *
 * @author hubert
 */
public class Variable extends Expression {

    static ArrayList<Variable> listevar;
    private String nom;
    private Type type;

    private Variable(String nom, String type) {
        this.nom = nom;
        this.type = Type.get(type);
        if (listevar == null) {
            listevar = new ArrayList<Variable>();
        }
        listevar.add(this);
    }

    @Deprecated
    private Variable(String nom) {
        this.nom = nom;
        this.type = null;
        listevar.add(this);
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

    public static Variable get(String varName) {
        Variable res = Variable.search(varName);
        if (res == null) {
            throw new UnsupportedOperationException("La variable " + varName + " n'a pas été déclarée.");
        }
        return res;
    }

    static Variable declare(String nom, String type) {
        if (Variable.search(nom) != null) {
            throw new UnsupportedOperationException("la variable " + nom + " a déjà été déclarée.");
        }
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
}

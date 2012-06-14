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
    private String type;

    private Variable(String nom, String type) {
        this.nom = nom;
        this.type = type;
        listevar.add(this);
    }
    
    /**
     * Juste à des fins de débugage temporaire
     * @param nom 
     */
    private Variable(String nom) {
        this.nom = nom;
        this.type = null;
        listevar.add(this);
    }

    public static Variable init(String nom) {
        Variable res = null;
        if (listevar == null) {
            listevar = new ArrayList<Variable>();
        }
        for (Variable variable : listevar) {
            if (variable.nom.equals(nom)) {
                res = variable;
                break;
            }
        }
        if (res == null) {
//            throw new UnsupportedOperationException("La variable " + nom + " n'a pas été déclarée.");
            res = new Variable(nom);
        }
        return res;
    }

    static Variable declare(String nom, String type) {
        for (Variable variable : listevar) {
            if (variable.nom.equals(nom)) {
                throw new UnsupportedOperationException("la variable " + nom + "a déjà été déclarée.");
            }
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

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

    @Deprecated
    public static Variable get(String varName) {
        Variable res = Variable.search(varName);
        if (res == null) {
            throw new UnsupportedOperationException("La variable " + varName + " n'a pas été déclarée.");
        }
        return res;
    }

    @Deprecated
    static Variable declare(String nom, String type) {
        if (Variable.search(nom) != null) {
            throw new UnsupportedOperationException("la variable " + nom + " a déjà été déclarée.");
        }
        return new Variable(nom, type);
    }

    /**
     * Cette fonction ne doit être appelée que lorsque le nom de variable n'est
     * pas utilisé dans le scope courant.
     *
     * @param nom
     * @param type
     * @return Nouvelle variable si le nom était inusité, variable avec, le cas
     * échéant un nouveau type sinon.
     */
    static Variable use(String nom, String type) {
        Variable res = Variable.search(nom);
        if (res != null) {
            res.type = Type.get(type);
            return res;
        }
        return new Variable(nom, type);
    }
    
    static Variable reDeclare(String nom, String type) {
        Variable res = Variable.search(nom);
        if (res != null) {
            res.type = Type.get(type);
            return res;
        }
        throw new UnsupportedOperationException("BAD COMPILATOR : variable");
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
    public void checkSementique(Pool pool) { // test l'existance
        pool.existVar(nom);
    }
}

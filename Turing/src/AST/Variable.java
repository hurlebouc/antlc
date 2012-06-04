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

    private Variable(String nom) {
        this.nom = nom;
        listevar.add(this);
    }

    public static Variable init(String nom) {
        Variable res = null;
        if(listevar == null){
            listevar = new ArrayList<Variable>();
        }
        for (Variable variable : listevar) {
            if(variable.nom.equals(nom)){
                res = variable;
                break;
            }
        }
        if(res == null){
            res = new Variable(nom);
        }
        return res;
    }

    @Override
    public String toString() {
        return "Variable[" + nom + "]";
    }
    
    public String getName(){
        return this.nom;
    }

    @Override
    public String toAsm() {
        return "\tmov\teax, [" + nom + "]\n";
    }
}

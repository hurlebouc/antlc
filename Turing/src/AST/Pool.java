/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.util.ArrayList;

/**
 * Chaque nouveau pool doit être initialisé dans les environnements appelant le
 * constructeurs d'instructions délimitant une liste d'instructions (while, if,
 * ...). Le pool spécifique à cette instruction doit être détruit dans l'appel
 * du constructeur d'une telle instruction.
 *
 * @author hubert
 */
public class Pool {

    private static Pool current;
    private Pool pere;
    private ArrayList<Variable> listeVar;
    private ArrayList<Type> listeTypes;

    public Pool(Pool pere) {
        this.pere = pere;
        listeVar = new ArrayList<Variable>();
        listeTypes = new ArrayList<Type>();
        current = this;
    }

    Variable searchVar(String nom) {
        for (Variable variable : listeVar) {
            if (variable.getName().equals(nom)) {
                return variable;
            }
        }
        if(pere != null){
            for (Variable variable : pere.listeVar) {
                return variable;
            }
        }
        return null;
    }

    Type searchType(String nom) {
        for (Type type : listeTypes) {
            if (nom.equals(type.getName())) {
                return type;
            }
        }
        if(pere != null){
            for (Type type : pere.listeTypes) {
                return type;
            }
        }
        return null;
    }
}

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
        Pool.current = this;
    }

    private Variable searchVar(String nom) {
        for (Variable variable : listeVar) {
            if (variable.getName().equals(nom)) {
                return variable;
            }
        }
        if (pere != null) {
            return pere.searchVar(nom);
        }
        return null;
    }

    private Type searchType(String nom) {
        for (Type type : listeTypes) {
            if (nom.equals(type.getName())) {
                return type;
            }
        }
        if (pere != null) {
            return pere.searchType(nom);
        }
        return null;
    }

    void existVar(String nom) {
        Variable res = searchVar(nom);
        if (res == null) {
            throw new UnsupportedOperationException("Variable " + nom + " undeclared in this scope.");
        }
    }

    void existType(String nom) {
        Type res = searchType(nom);
        if (res == null) {
            throw new UnsupportedOperationException("Type " + nom + " undeclared in this scope.");
        }
    }

    Variable declareVar(String nom, String type) {
        if (searchVar(nom) != null) {
            throw new UnsupportedOperationException("Variable " + nom + " already definied in this scope.");
        }
        Variable res = Variable.reDeclare(nom, type);
        listeVar.add(res);
        return res;
    }
    
    Type declareType(String nom){
        if (searchType(nom) != null) {
            throw new UnsupportedOperationException("Type " + nom + " already definied in this scope.");
        }
        Type res = Type.use(nom);
        listeTypes.add(res);
        return res;
    }
}

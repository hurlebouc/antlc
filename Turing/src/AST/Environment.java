/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.expression.Variable;
import java.util.LinkedList;

/**
 * Chaque nouveau pool doit être initialisé dans les environnements appelant le
 * constructeurs d'instructions délimitant une liste d'instructions (while, if,
 * ...). Le pool spécifique à cette instruction doit être détruit dans l'appel
 * du constructeur d'une telle instruction.
 *
 * @author hubert
 */
public class Environment {

    private class VarType {

        Variable var;
        Type type;

        public VarType(Variable var, Type type) {
            this.var = var;
            this.type = type;
        }
    }
    private Environment pere;
    private LinkedList<VarType> listeVar;
    private LinkedList<Type> listeTypes;

    public Environment(Environment pere) {
        this.pere = pere;
        listeVar = new LinkedList<VarType>();
        listeTypes = new LinkedList<Type>();
//        listeTypes.add(new Type("int"));
//        listeTypes.add(new Type("string"));
    }

    private Type searchVar(Variable var) {
        for (VarType tv : listeVar) {
            if (tv.var.equals(var)) {
                return tv.type;
            }
        }
        if (pere != null) {
            return pere.searchVar(var);
        }
        return null;
    }

    private Type searchType(Type tyref) {
        for (Type type : listeTypes) {
            if (tyref.equals(type)) {
                return type;
            }
        }
        if (pere != null) {
            return pere.searchType(tyref);
        }
        return null;
    }

    public Type existVar(Variable var) {
        Type res = searchVar(var);
        if (res == null) {
            throw new UnsupportedOperationException("Variable " + var + " undeclared in this scope.");
        }
        return res;
    }

    public Type existType(Type type) {
        Type res = searchType(type);
        if (res == null) {
            throw new UnsupportedOperationException("Type " + type + " undeclared in this scope.");
        }
        return res;
    }

//    public Variable declareVar(String nom, String type) {
//        if (searchVar(nom) != null) {
//            throw new UnsupportedOperationException("Variable " + nom + " already definied in this scope.");
//        }
//        Variable res = Variable.newUnlinked(nom, type);
//        listeVar.add(res);
//        return res;
//    }
    public Environment addVariable(Variable var, Type type) {
        Environment newEnv = new Environment(this);
        newEnv.listeVar.add(new VarType(var, type));
        return newEnv;
    }

//    public Type declareType(Type type) {
//        if (searchType(type) != null) {
//            throw new UnsupportedOperationException("Type " + type + " already definied in this scope.");
//        }
//        Type res = Type.newUnlinked(type);
//        listeTypes.add(res);
//        return res;
//    }
    public Environment addType(Type type) {
        Environment newEnv = new Environment(this);
        newEnv.listeTypes.add(type);
        return newEnv;
    }
}

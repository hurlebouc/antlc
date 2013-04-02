/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.expression.Variable;
import java.util.LinkedList;
import toolbox.Couple;
import toolbox.Either;
import toolbox.Left;
import toolbox.List;

/**
 *
 * @author devlopmac
 */
public class Arguments extends LinkedList<Variable> {

    private Environment locEnv;

    public Arguments(String varName, String typeName) {
        super();
        locEnv = Environment.empty;
        this.addVar(varName, typeName);
    }

    public void addVar(String varName, String typeName) {
        // vérifier que toutes les variales ont des noms différents
        this.addFirst(Variable.newVariable(varName));
        locEnv = locEnv.addVariable(Variable.newVariable(varName), Type.newType(typeName));
    }

    public Environment buildLocalEnv() {
        return locEnv;
    }

    LinkedList<Variable> fetchVar() {
        return this;
    }

    List<Couple<Variable, Variable>> alphaRename(List<Couple<Variable, Variable>> mapVar) {
        List<Couple<Variable, Variable>> res = List.empty;
        for (Variable variable : this) {
            res = List.cons(new Couple<Variable, Variable>(variable, variable), res);
        }
        return res;
    }
}
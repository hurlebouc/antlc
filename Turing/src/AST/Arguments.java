/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.expression.Variable;
import java.util.LinkedList;
import toolbox.base.Couple;
import toolbox.usage.ICouple;
import toolbox.base.List;

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
        locEnv = Environment.addVariable(Variable.newVariable(varName), Type.newType(typeName), locEnv);
    }

    public Environment buildLocalEnv() {
        return locEnv;
    }

    LinkedList<Variable> fetchVar() {
        return this;
    }

    Couple< List<ICouple<Variable, Variable>>,
            List<ICouple<Type, Type>> > 
            alphaRename(
            Couple< List<ICouple<Variable, Variable>>,
                    List<ICouple<Type, Type>> > alphaMap) {
        List<ICouple<Variable, Variable>> varMap = alphaMap.fst;
        List<ICouple<Type, Type>> typeMap = alphaMap.snd;
        System.out.println("ATTENTION : revenir dans la fonction d'alpha renommage des arguments et enlever le 0");
        for (Variable variable : this) {
            varMap = List.cons(new ICouple<Variable, Variable>(variable, variable, 0), varMap);
        }
        alphaMap = new Couple(varMap, typeMap);
        return alphaMap;
    }
}
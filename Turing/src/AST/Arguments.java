/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.type.Type;
import AST.expression.Variable;
import java.util.LinkedList;
import toolbox.base.Couple;
import toolbox.base.Left;
import toolbox.usage.ICouple;
import toolbox.base.List;

/**
 *
 * @author devlopmac
 */
public class Arguments extends List<Couple<Variable, Type>> {
    
    
    private Arguments(Variable var, Type ty, Arguments arg){
        super(new Couple<Variable, Type>(var, ty), arg);
    }
    
    private Arguments(Couple<Variable, Type> couple, Arguments arg){
        super(couple, arg);
    }
    
    public static Arguments empty(){return null;};
    

    public static Arguments addCouple(String varName, String typeName, Arguments arg) {
        // TODO : vérifier que toutes les variales ont des noms différents
        return new Arguments(Variable.newVariable(varName), Type.newType(typeName), arg);
    }
    
    public static Arguments cons(Couple<Variable, Type> couple, Arguments arg) {
        // TODO : vérifier que toutes les variales ont des noms différents
        return new Arguments(couple, arg);
    }

    
    private Environment buildLocalEnv_aux(Environment env, Arguments arg){
        if (Arguments.isEmpty(arg)) {
            return env;
        } else {
            return buildLocalEnv_aux(
                    Environment.cons(new Left(arg.head()), env),
                    (Arguments) arg.tail());
        }
    }
    
    public Environment buildLocalEnv() {
        Environment env = Environment.empty;
        return buildLocalEnv_aux(env, this);
    }

    LinkedList<Variable> fetchVar() {
        Arguments iter = this;
        LinkedList<Variable> res = new LinkedList<Variable>();
        while(!Arguments.isEmpty(iter)){
            Variable var = iter.head().fst;
            res.add(var);
            iter = (Arguments) iter.tail();
        }
        return res;
    }

    Couple< List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaRename(Couple< List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) {
        List<ICouple<Variable, Variable>> varMap = alphaMap.fst;
        List<ICouple<Type, Type>> typeMap = alphaMap.snd;
        System.out.println("ATTENTION : revenir dans la fonction d'alpha renommage des arguments et enlever le 0");
        Arguments iter = this;
        while(!Arguments.isEmpty(iter)){
            Variable variable = iter.head().fst;
            iter = (Arguments) iter.tail();
            varMap = List.cons(new ICouple<Variable, Variable>(variable, variable, 0), varMap);
        }
        alphaMap = new Couple(varMap, typeMap);
        return alphaMap;
    }
}
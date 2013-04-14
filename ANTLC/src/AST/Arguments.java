/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.type.Type;
import AST.expression.Variable;
import java.util.LinkedList;
import toolbox.base.Couple;
import toolbox.base.Fun;
import toolbox.base.Left;
import toolbox.usage.ICouple;
import toolbox.base.List;
import toolbox.base.NotFoundException;
import toolbox.pack.RenamingPack;

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
    
//    public static Arguments empty(){return null;};
    final public static Arguments empty = null;
    

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
                    Environment.cons(new Left<Couple<Variable, Type>, Type>(arg.head()), env),
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
    
    private static void testBF(final Arguments arg) throws DuplicatedNameException{
        if (Arguments.isEmpty(arg)) {
            return;
        }
        Fun<Couple<Variable, Type>, Boolean> p = new Fun<Couple<Variable, Type>, Boolean>() {

            @Override
            public Boolean apply(Couple<Variable, Type> couple) {
                return couple.fst.equals(arg.head().fst);
            }
        };
        try {
            Arguments.search(p, arg.tail());
            throw new DuplicatedNameException("Le nom de variable "
                    + arg.head().fst.getName()
                    + "est déjà utilisé dans la liste des arguments");
        } catch (NotFoundException ex) {
            testBF((Arguments) arg.tail());
        }
    }
    
    
    private static RenamingPack<Arguments> applyAlphaRenaming(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap, Arguments arg) throws UnboundVariableException, UnboundTypeException {
        
        // TODO: Vérifier que les noms des arguments sont différents
        
        if (Arguments.isEmpty(arg)) {
            return new RenamingPack<Arguments>(arg, alphaMap);
        }
        RenamingPack<Arguments> packedTail = applyAlphaRenaming(alphaMap, ((Arguments) arg.tail()));
        alphaMap = packedTail.getAlphaMap();
        
        List<ICouple<Variable, Variable>> varMap = alphaMap.fst;
        final List<ICouple<Type, Type>> typeMap = alphaMap.snd;
        final Variable var = arg.head().fst;
        final Type type = arg.head().snd;

        Fun<ICouple<Variable, Variable>, Boolean> p = new Fun<ICouple<Variable, Variable>, Boolean>() {
            @Override
            public Boolean apply(ICouple<Variable, Variable> arg) {
                Variable t = arg.fst;
                return t.equals(var);
            }
        };

        try {
            ICouple<Variable, Variable> last = List.search(p, varMap);
            int index = last.getIndex();
            Variable renommage = Variable.newVariable(var.getName() + var.getName() + (index + 1));
            varMap = List.cons(new ICouple<Variable, Variable>(var, renommage, index + 1), varMap);
        } catch (NotFoundException ex) {
            Variable renommage = Variable.newVariable(var.getName() + var.getName() + 0);
            varMap = List.cons(new ICouple<Variable, Variable>(var, renommage, 0), varMap);
//            varMap = List.cons(new ICouple<Variable, Variable>(var, var, 0), varMap);
            // On duplique le nom de la variable pour la correction de l'algorithme 
            // de renommage.
        }

        Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> newAlphaMap = new Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>>(varMap, typeMap);

        Type alphaType = type.alphaRename(newAlphaMap);
        Variable alphaVar = (Variable) var.alphaRename(newAlphaMap);

        Arguments alphaArg = Arguments.cons(new Couple<Variable, Type>(alphaVar, alphaType), packedTail.getRenamed());
        RenamingPack<Arguments> res = new RenamingPack<Arguments>(alphaArg, newAlphaMap);

        return res;
    }
    
    public static RenamingPack<Arguments> alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap, Arguments arg) throws UnboundVariableException, UnboundTypeException, DuplicatedNameException {
        testBF(arg);
        return applyAlphaRenaming(alphaMap, arg);
    }

    public String prettyPrint() {
        Arguments iter = this;
        String res = "";
        while (!Arguments.isEmpty(iter)) {            
            Variable var = iter.head().fst;
            Type type = iter.head().snd;
            iter = (Arguments) iter.tail();
            res += type.getName() + " " + var.getName();
            if (!Arguments.isEmpty(iter)) {
                res += ", ";
            }
        }
        return res;
    }
}
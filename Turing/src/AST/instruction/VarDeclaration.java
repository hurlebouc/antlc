    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.UnboundTypeException;
import AST.type.Type;
import AST.UnboundVariableException;
import AST.expression.Variable;
import toolbox.base.Couple;
import toolbox.base.Fun;
import toolbox.usage.ICouple;
import toolbox.base.List;
import toolbox.base.NotFoundException;
import toolbox.pack.RenamingPack;

/**
 *
 * @author hubert
 */
public class VarDeclaration extends Instruction {

    private Variable var;
    private Type type;

    public VarDeclaration(String varName, String typeName) {
//        this.var = Variable.declare(varName, typeName);
        this.type = Type.newType(typeName);
        this.var = Variable.newVariable(varName);
    }

    private VarDeclaration(Variable alphaVar, Type alphaType) {
        this.type = alphaType;
        this.var = alphaVar;
    }

    @Override
    public String toString() {
        return var.toString();
    }

    @Override
    public String toAsm() {
        return "";
    }

    @Override
    public void typeCheck(Environment env) {
        env.existType(type);
    }

    @Override
    public Environment nextEnv(Environment env) {

        /*
         * Ici on se contente d'ajouter la nouvelle variable à l'environnement car on
         * suppose que toutes les variables sont différents par alpha-renommage.
         * De même pour les types.
         */
        return Environment.addVariable(var, type, env);
    }

    @Override
    public Variable fetchVar() {
        return this.var;
    }

    @Override
    public RenamingPack<Instruction> alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) throws UnboundVariableException, UnboundTypeException {
        List<ICouple<Variable, Variable>> varMap = alphaMap.fst;
        List<ICouple<Type, Type>> typeMap = alphaMap.snd;

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

        Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> newAlphaMap = new Couple(varMap, typeMap);

        Type alphaType = type.alphaRename(newAlphaMap);
        Variable alphaVar = (Variable) var.alphaRename(newAlphaMap);

        RenamingPack<Instruction> res = new RenamingPack(new VarDeclaration(alphaVar, alphaType), newAlphaMap);

        return res;
    }

    @Override
    public String prettyPrint(String offset) {
        return offset + type.getName() + " " + var.prettyPrint();
    }
}

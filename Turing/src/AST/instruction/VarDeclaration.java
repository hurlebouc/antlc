    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.Type;
import AST.expression.Variable;
import toolbox.base.Couple;
import toolbox.base.Fun;
import toolbox.usage.ICouple;
import toolbox.base.List;
import toolbox.base.NotFoundException;

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
    
    @Override
    public String toString() {
        return var.toString();
    }

    @Override
    public String toAsm() {
        return "";
    }

    @Override
    public boolean typeCheck(Environment env) {
        env.existType(type);
        return true;
    }

    @Override
    public Environment nextEnv(Environment env) {
        
        // ... alpha-renommage
        return env.addVariable(var, type); 
    }

    @Override
    public Variable fetchVar() {
        return this.var;
    }

    @Override
    public Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) {
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
            ICouple<Variable, Variable> last = varMap.search(p);
            int index = last.getIndex();
            Variable renommage = Variable.newVariable(var.getName() + (index + 1));
            varMap = List.cons(new ICouple<Variable, Variable>(var, renommage, index+1), varMap);
        } catch (NotFoundException ex) {
            Variable renommage = Variable.newVariable(var.getName() + 0);
            varMap = List.cons(new ICouple<Variable, Variable>(var, renommage, 0), varMap);
        }
        
        return new Couple(varMap, typeMap);
    }
}

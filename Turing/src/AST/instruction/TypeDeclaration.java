/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.type.Type;
import AST.expression.Variable;
import toolbox.base.Couple;
import toolbox.base.Fun;
import toolbox.usage.ICouple;
import toolbox.base.List;
import toolbox.base.NotFoundException;
import toolbox.pack.RenamingPack;

/**
 * On va dire qu'on pet déclarer un type n'importe où...
 * @author hubert
 */
public class TypeDeclaration extends Instruction {

    private Type type;

    public TypeDeclaration(String typeName) {
        this.type = Type.newType(typeName);
    }

    @Override
    public String toAsm() {
        return "";
    }

    @Override
    public boolean typeCheck(Environment env) {
        return true;
//        env.declareType(type);
    }

    @Override
    public Environment nextEnv(Environment env) {
        /*
         * Ici on se contente d'ajouter le nouveau type à l'environnement car on
         * suppose que tous les types sont différents par alpha-renommage.
         */
        return Environment.addType(type, env); 
    }

    @Override
    public Variable fetchVar() {
        return null;
    }

    @Override
    public RenamingPack<Instruction> alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) {
        
        List<ICouple<Variable, Variable>> varMap = alphaMap.fst;
        List<ICouple<Type, Type>> typeMap = alphaMap.snd;
        
        Fun<ICouple<Type, Type>, Boolean> p = new Fun<ICouple<Type, Type>, Boolean>() {
            @Override
            public Boolean apply(ICouple<Type, Type> arg) {
                Type t = arg.fst;
                return t.equals(type);
            }
        };
        
        try {
            ICouple<Type, Type> last = List.search(p, typeMap);
            int index = last.getIndex();
            Type renommage = Type.newType(type.getName() + (index + 1));
            typeMap = List.cons(new ICouple<Type, Type>(type, renommage, index+1), typeMap);
        } catch (NotFoundException ex) {
            Type renommage = Type.newType(type.getName() + 0);
            typeMap = List.cons(new ICouple<Type, Type>(type, renommage, 0), typeMap);
        }
        
        Type alphaType = type.alphaRename(alphaMap);
        RenamingPack<Instruction> res = new RenamingPack(alphaType, new Couple(varMap, typeMap));
        
        return res;
    }

    @Override
    public String prettyPrint(String offset) {
        return offset + "typedef " + type.getName();
    }
}

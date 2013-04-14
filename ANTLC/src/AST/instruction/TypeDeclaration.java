/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.instruction;

import AST.Environment;
import AST.Instruction;
import AST.UnboundTypeException;
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

    private TypeDeclaration(Type alphaType) {
        this.type = alphaType;
    }

    @Override
    public String toAsm() {
        return "";
    }

    @Override
    public void typeCheck(Environment env) {}

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
    public RenamingPack<Instruction> alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) throws UnboundTypeException {
        
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
            Type renommage = Type.newType(type.getName() + type.getName() + (index + 1));
            typeMap = List.cons(new ICouple<Type, Type>(type, renommage, index+1), typeMap);
        } catch (NotFoundException ex) {
            Type renommage = Type.newType(type.getName() + type.getName() + 0);
            typeMap = List.cons(new ICouple<Type, Type>(type, renommage, 0), typeMap);
//            typeMap = List.cons(new ICouple<Type, Type>(type, type, 0), typeMap); 
            // On duplique le nom de la variable pour la correction de l'algorithme 
            // de renommage.
        }
        
        Type alphaType = type.alphaRename(alphaMap);
        Instruction alphaInstr = new TypeDeclaration(alphaType);
        RenamingPack<Instruction> res = new RenamingPack<Instruction>(alphaInstr, new Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>>(varMap, typeMap));
        
        return res;
    }

    @Override
    public String prettyPrint(String offset) {
        return offset + "typedef " + type.getName();
    }
}

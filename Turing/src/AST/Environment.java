/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.type.Type;
import AST.expression.Variable;
import toolbox.base.Couple;
import toolbox.base.Either;
import toolbox.base.Fun;
import toolbox.base.Left;
import toolbox.base.List;
import toolbox.base.NotFoundException;
import toolbox.base.Right;

/**
 * Chaque nouveau pool doit être initialisé dans les environnements appelant le
 * constructeurs d'instructions délimitant une liste d'instructions (while, if,
 * ...). Le pool spécifique à cette instruction doit être détruit dans l'appel
 * du constructeur d'une telle instruction.
 *
 * @author hubert
 */
public class Environment extends List<Either<Couple<Variable, Type>, Type>> {

    public static Environment concat(Environment env1, Environment env2) {
        if (env1 == empty) {
            return env2;
        }
        return concat((Environment) env1.tail(), Environment.cons(env1.head(), env2));
    }

    private Environment(Either<Couple<Variable, Type>, Type> e, Environment env) {
        super(e, env);
    }
    
    public static Environment cons(Either<Couple<Variable, Type>, Type> head, Environment env){
        return new Environment(head, env);
    }
    
    public static Environment empty = null;

    private Type searchVar(final Variable var) throws NotFoundException {
        
        Fun<Either<Couple<Variable, Type>, Type>, Boolean> p =
                new Fun<Either<Couple<Variable, Type>, Type>, Boolean>() {

            @Override
            public Boolean apply(Either<Couple<Variable, Type>, Type> arg) {
                if (arg.isRight()) {
                    return false;
                }
                Couple prod = ((Left<Couple<Variable, Type>, Type>) arg).unwrap();
                if (prod.fst.equals(var)) {
                    return true;
                }
                return false;
            }
        };
        
        Either<Couple<Variable, Type>, Type> res = List.search(p, this);
        Couple<Variable, Type> prod = ((Left<Couple<Variable, Type>, Type>) res).unwrap();
        return prod.snd;
    }

    private Type searchType(final Type tyref) throws NotFoundException {
        
        Fun<Either<Couple<Variable, Type>, Type>, Boolean> p = 
                new Fun<Either<Couple<Variable, Type>, Type>, Boolean>() {

            @Override
            public Boolean apply(Either<Couple<Variable, Type>, Type> arg) {
                if (arg.isLeft()) {
                    return false;
                }
                Type ty = ((Right<Couple<Variable, Type>, Type>) arg).unwrap();
                if (ty.equals(tyref)) {
                    return true;
                }
                return false;
            }
        };
        
        Either<Couple<Variable, Type>, Type> res = List.search(p, this);
        Type ty = ((Right<Couple<Variable, Type>, Type>) res).unwrap();
        return ty;
    }

    public Type existVar(Variable var) {
        Type res;
        try {
            res = searchVar(var);
        } catch (NotFoundException ex) {
//            throw new TypingException("Variable " + var + " undeclared in this scope.");
            throw new UnknownError("Erreur inattendue : variable non présente "
                    + "dans l'environnement de typage, devrait avoir été "
                    + "détéctée dans le test de bonne formation");
        }
        return res;
    }

    public Type existType(Type type) {
        Type res;
        try {
            res = searchType(type);
        } catch (NotFoundException ex) {
//            throw new TypingException("Type " + type + " undeclared in this scope.");
            throw new UnknownError("Erreur inattendue : type non présent dans "
                    + "l'environnement de typage, devrait avoir été détectée "
                    + "dans le tes de bonne formation");
        }
        return res;
    }

    public static Environment addVariable(Variable var, Type type, Environment env) {
        return Environment.cons(
                new Left<Couple<Variable, Type>, Type>(
                    new Couple<Variable, Type>(var, type)
                ),
                env
        );
    }
    
    public static Environment addType(Type type, Environment env) {
        return Environment.cons(
                new Right<Couple<Variable, Type>, Type>(type),
                env
        );
        
//        Environment newEnv = new Environment(this);
//        newEnv.listeTypes.add(type);
//        return newEnv;
    }
}

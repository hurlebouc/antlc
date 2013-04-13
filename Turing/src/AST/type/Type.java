/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.type;

import AST.Environment;
import AST.UnboundTypeException;
import AST.expression.Variable;
import toolbox.base.Couple;
import toolbox.base.Fun;
import toolbox.base.List;
import toolbox.base.NotFoundException;
import toolbox.usage.ICouple;

/**
 *
 * @author hubert
 */
public class Type {

    public final static Type tyint = new Type("int");
    public final static Type tystring = new Type("string");
    public final static Type tyunit = new Type("unit");

    public static Environment getBuiltInEnv() {
        Environment env = Environment.empty;
        env = Environment.addType(Type.tyint, env);
        env = Environment.addType(Type.tystring, env);
        env = Environment.addType(Type.tyunit, env);
        return env;
    }

    public static Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> getBuiltInAlphaMap() {
        List<ICouple<Variable, Variable>> mapVar = List.empty();
        List<ICouple<Type, Type>> mapType = List.empty();
        mapType = List.cons(new ICouple<Type, Type>(tyint, tyint, 0), mapType);
        mapType = List.cons(new ICouple<Type, Type>(tystring, tystring, 0), mapType);
        mapType = List.cons(new ICouple<Type, Type>(tyunit, tyunit, 0), mapType);
//        mapType = List.cons(new ICouple<Type, Type>(tyint, new Type("int0"), 0), mapType);
//        mapType = List.cons(new ICouple<Type, Type>(tystring, new Type("string0"), 0), mapType);
//        mapType = List.cons(new ICouple<Type, Type>(tyunit, new Type("unit0"), 0), mapType);
        Couple< List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap;
        alphaMap = new Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>>(mapVar, mapType);
        return alphaMap;
    }
    private final String name;

    private Type(String typeName) {
        this.name = typeName;
    }

    public static Type newType(String nom) {
        return new Type(nom);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Type t) {
        return this.name.equals(t.name);
    }

    public Type alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) throws UnboundTypeException {

        final Type comp = this;

        Fun<ICouple<Type, Type>, Boolean> p = new Fun<ICouple<Type, Type>, Boolean>() {
            @Override
            public Boolean apply(ICouple<Type, Type> arg) {
                Type t = arg.fst;
                return t.equals(comp);
            }
        };

        Couple<Type, Type> matching;
        try {
            matching = List.search(p, alphaMap.snd);
        } catch (NotFoundException ex) {
            throw new UnboundTypeException("Le type " + this.getName() + " n'est pas défini.");
        }
        return matching.snd;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.util.ArrayList;

/**
 *
 * @author hubert
 */
public class Type {

    private static ArrayList<Type> listeTypes;
    private String name;

    public Type(String typeName) {
        this.name = typeName;
    }

    private static void initListeType() {
        listeTypes = new ArrayList<Type>();
        listeTypes.add(new Type("int"));
        listeTypes.add(new Type("string"));
    }

    private static Type search(String typeName) {
        for (Type type : listeTypes) {
            if (typeName.equals(type.name)) {
                return type;
            }
        }
        return null;
    }

//    @Deprecated
//    static Type get(String typeName) {
//        if (listeTypes == null) {
//            initListeType();
//        }
//        Type res = Type.search(typeName);
//        if (res == null) {
//            throw new UnsupportedOperationException("Le type " + typeName + " n'est pas déclaré.");
//        }
//        return res;
//    }

    @Deprecated
    public static Type declare(String typeName) {
        if (listeTypes == null) {
            initListeType();
        }
        if (Type.search(typeName) != null) {
            throw new UnsupportedOperationException("Le type " + typeName + " est déjà déclaré.");
        }
        Type res = new Type(typeName);
        listeTypes.add(res);
        return res;
    }

//    @Deprecated
//    static Type use(String nom) {
//        if (listeTypes == null) {
//            initListeType();
//        }
//        Type res = Type.search(nom);
//        if (res != null) {
//            return res;
//        }
//        res = new Type(nom);
//        listeTypes.add(res);
//        return res;
//    }

//    @Deprecated
//    static Type reDeclare(String nom) {
//        if (listeTypes == null) {
//            initListeType();
//        }
//        Type res = Type.search(nom);
//        if (res != null) {
//            return res;
//        }
//        throw new UnsupportedOperationException("BAD COMPILATOR : type");
//    }

    static Type newUnlinked(String nom) {
        return new Type(nom);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}

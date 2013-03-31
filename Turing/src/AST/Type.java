/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author hubert
 */
public class Type {

//    private static ArrayList<Type> listeTypes;
    public final static Type tyint = new Type("int");
    public final static Type tystring = new Type("string");
    public final static Type tyunit = new Type("unit");
    
    private final String name;

    private Type(String typeName) {
        this.name = typeName;
    }

//    private static void initListeType() {
//        listeTypes = new ArrayList<Type>();
//        listeTypes.add(tyint);
//        listeTypes.add(tystring);
//    }
//
//    private static Type search(String typeName) {
//        for (Type type : listeTypes) {
//            if (typeName.equals(type.name)) {
//                return type;
//            }
//        }
//        return null;
//    }
//
//    @Deprecated
//    public static Type declare(String typeName) {
//        if (listeTypes == null) {
//            initListeType();
//        }
//        if (Type.search(typeName) != null) {
//            throw new UnsupportedOperationException("Le type " + typeName + " est déjà déclaré.");
//        }
//        Type res = new Type(typeName);
//        listeTypes.add(res);
//        return res;
//    }
    
    public static Type newType(String nom){
        return new Type(nom);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
    
    public boolean equals(Type t){
        return this.name.equals(t.name);
    }
}

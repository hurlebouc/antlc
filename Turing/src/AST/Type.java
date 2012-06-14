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

    private Type(String typeName) {
        this.name = typeName;
        listeTypes.add(this);
    }
    
    private static void initListeType(){
        listeTypes = new ArrayList<Type>();
        new Type("int");
        new Type("string");
    }
    
    private static Type search(String typeName){
        for (Type type : listeTypes) {
            if(typeName.equals(type.name)){
                return type;
            }
        }
        return null;
    }
    
    static Type get(String typeName){
        if(listeTypes == null){
            initListeType();
        }
        Type res = Type.search(typeName);
        if(res == null){
            throw new UnsupportedOperationException("Le type " + typeName + " n'est pas déclaré.");
        }
        return res;
    }
     static Type declare(String typeName){
         if(listeTypes == null){
            initListeType();
        }
         if(Type.search(typeName) != null){
             throw new UnsupportedOperationException("Le type " + typeName + " est déjà déclaré.");
         }
         return new Type(typeName);
     }
}
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
public class Expression extends ArrayList<Sous_Expression> {

    private String type;

    public void checkSemantique(Pool pool) {
        for (Sous_Expression sous_Expression : this) {
                sous_Expression.checkSemantique(pool);
                if(sous_Expression.getType(pool).equals("int")){
                    
                }
            }
    }

    public String toAsm() {
        String s = "\tmov\tebx, 0\n";
        if (type.equals("int")) {
            for (Sous_Expression sous_Expression : this) {
                s += sous_Expression.toAsm();
                s+= "\tadd\tebx, eax\n";
            }
            return s;
        } else {
            for (Sous_Expression sous_Expression : this) {
                
            }
        }

    }

    public String getType(Pool pool) {
        type = "int";
        for (Sous_Expression sous_Expression : this) {
            String type_sub = sous_Expression.getType(pool);
            if (type_sub.equals("string")) {
                type = "string";
            } else if (!type_sub.equals("int")) {
                throw new UnsupportedOperationException("Types incompatibles.");
            }
        }
        return type;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.expression;

import AST.Environment;
import AST.Expression;
import AST.Type;

/**
 *
 * @author hubert
 */
public class Variable extends Expression {

    public static Variable newVariable(String varName) {
        return new Variable(varName);
    }
    private String nom;

    private Variable(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Variable[" + nom + "]";
    }

    public String getName() {
        return this.nom;
    }

    @Override
    public String toAsm() {
        return "\tmov\teax, [" + nom + "]\n";
    }

    @Override
    public Type getType(Environment env) {
        return env.existVar(this);
    }
    
    public boolean equals(Variable var){
        return this.nom.equals(var.nom);
    }
}

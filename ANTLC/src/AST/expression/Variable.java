/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.expression;

import AST.Environment;
import AST.Expression;
import AST.type.Type;
import AST.UnboundVariableException;
import toolbox.base.Couple;
import toolbox.base.Fun;
import toolbox.base.List;
import toolbox.base.NotFoundException;
import toolbox.usage.ICouple;

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
        try {
            return env.existVar(this);
        } catch (UnknownError ex) {
            throw new UnknownError("Erreur non attendue : " + ex.getMessage());
        }
    }
    
    public boolean equals(Variable var){
        return this.nom.equals(var.nom);
    }

    @Override
    public Expression alphaRename(Couple<List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap) throws UnboundVariableException {
        final Variable comp = this;
        
        Fun<ICouple<Variable, Variable>, Boolean> p = new Fun<ICouple<Variable, Variable>, Boolean>() {
            @Override
            public Boolean apply(ICouple<Variable, Variable> arg) {
                Variable var = arg.fst;
                return var.equals(comp);
            }
        };
        
        Couple<Variable, Variable> matching;
        try {
            matching = List.search(p, alphaMap.fst);
        } catch (NotFoundException ex) {
            throw new UnboundVariableException("La variable " + this.getName() + " n'est pas déclarée.");
        }
        return matching.snd;
    }

    @Override
    public String prettyPrint() {
        return nom;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.type.Type;
import AST.expression.Variable;
import toolbox.base.Couple;
import toolbox.usage.ICouple;
import toolbox.base.List;

/**
 *
 * @author hubert
 */
abstract public class Expression {
    
    abstract public String toAsm();
    
    abstract public Type getType(Environment env);
    
    abstract public Expression alphaRename(
            Couple< List<ICouple<Variable, Variable>>,
                    List<ICouple<Type, Type>> > alphaMap);
    
    abstract public String prettyPrint();
}

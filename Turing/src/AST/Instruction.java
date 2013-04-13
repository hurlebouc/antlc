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
import toolbox.pack.RenamingPack;

/**
 *
 * @author hubert
 */
abstract public class Instruction {

    /**
     * Vérifie si l'instruction est typable dans l'environnement donné.
     *
     * @param env environnement dans lequel doit être typé l'instruction
     * @return true si l'instruction est typable
     */
    abstract public boolean typeCheck(Environment env);

    /**
     * Construit le nouvel environnement (est logiquement appelée après le test
     * de typage)
     *
     * @param env environnement dans lequel est typée l'instruction
     * @return nouvel environnement de l'instruction suivante
     */
    abstract public Environment nextEnv(Environment env);

    abstract public String toAsm();

    /**
     * Cette fonction retourne la variable créée par l'instruction
     *
     * @return retourne null si l'instruction ne crée par de variable.
     */
    abstract public Variable fetchVar();

    /**
     * Renome l'AST afin d'éviter les clashs de nom. ATTENTION : cette fonction
     * introduit des effets de bord : en effet, elle modifie this.
     *
     * @param mapVar
     * @return
     */
    abstract public RenamingPack<Instruction> alphaRename(
            Couple< List<ICouple<Variable, Variable>>, List<ICouple<Type, Type>>> alphaMap);
    
    /**
     * Pretty printer
     * @return 
     */
    abstract public String prettyPrint(String offset);
}

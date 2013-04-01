/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import AST.expression.Variable;
import java.util.Collection;
import java.util.LinkedList;

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
     * @param env environnement dans lequel est typée l'instruction
     * @return nouvel environnement de l'instruction suivante
     */
    abstract public Environment nextEnv(Environment env);

    
    abstract public String toAsm();

    /**
     * Cette fonction retourne la variable créée par l'instruction
     * @return retourne null si l'instruction ne crée par de variable.
     */
    abstract public Variable fetchVar();
}

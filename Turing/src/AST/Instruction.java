/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

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
}

//**************************************************************************//
/*  CROCUS - a synthesizer of quasi-interpretation of first order programs  */
/*                                                                        	*/
/*  Copyright 2005-2008 INRIA, INPL                 						*/
/*                                                                        	*/
/*  More information on "http://www.loria.fr/equipes/carte/crocus"  		*/
/*  License: CeCILL, see LICENSE file or "http://www.cecill.info"         	*/
/*  Authors: Guillaume Bonfante                                             */
//**************************************************************************//

package utilitaire;
// Decompiled by Jad v1.5.8c. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   VariablesPrimitives.java


public class VariablesPrimitives
{

    public VariablesPrimitives()
    {
    }

    public static void main(String args[])
    {
        boolean continuer = true;
        String choix = "";
        while(continuer) 
        {
            int x = Utilitaire.lireEntier("un premier entierSVP");
            int y = Utilitaire.lireEntier("un deuxieme entierSVP");
            Utilitaire.ecrire("[" + x + ";" + y + "]");
            ArdoiseMagique.dessinerPoint(x, y);
            choix = Utilitaire.lireChaine("Tapez q pour quitter, e pour effacer, ou entr\351e pour continuer");
            if(choix.equals("q") || choix.equals("Q"))
                continuer = false;
            else
            if(choix.equals("e") || choix.equals("E"))
                ArdoiseMagique.effacerTout();
        }
        ArdoiseMagique.effacerTout();
        ArdoiseMagique.dessinerPoint(20, 40);
        ArdoiseMagique.dessinerPoint(10, 20);
    }
}

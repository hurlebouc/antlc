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

public class HTML {
	
	public static String entete(String maDate){
    	String result = "<HTML>";
    	result += "<HEAD>";
    	result += "<TITLE>Reporting du "+maDate +"</TITLE>";
    	result += "</HEAD>";
    	result += "<BODY>";
    	return result;
	}
    
    public static String prepareTableau()
    {
    	String result = "<TABLE BORDER>";
    	result += "<TR>";
    	result += "<TD> Fonction </TD>";
    	result += "<TD> Trouvé </TD>";
    	result += "<TD> Tentatives </TD>";
    	result += "<TD> Temps de calcul </TD>";
    	result += "<TD> QI </TD>";
    	result += "</TR>";
		return result;
    }
    
    public static String prepareTableau1()
    {
    	String result = "<TABLE BORDER>";
    	result += "<TR>";
    	result += "<TD> Fonction </TD>";
    	result += "<TD> Succes </TD>";
    	result += "<TD> Tentatives </TD>";
    	result += "<TD> Temps de calcul </TD>";
    	result += "<TD> QI </TD>";
    	result += "</TR>";
		return result;
    }

    
    public static String caseLien(String nomFichier)
    {
    	String result = "<TD>";
    	result += "<A HREF = "+nomFichier+">"+nomFichier+"</A>";
    	result += "</TD>";
		
		return result;

    }
    
    public static String changeColor(String s, String color){
    	return "<font color="+color+">"+s+ "</font>";
    }
    
    
    public static String finitTableau()
    {
    	String result = "</TABLE>";
    	result += "</BODY>";
    	result += "</HTML>";
		return result;
    }
    
    public static String cellule(String s){
    	return "<TD>"+s+"</TD>";
    }

    public static String cellule(String content, String color){
    	return "<TD>"+changeColor(content,color)+"</TD>";
    }

	public static final String green = "\"green\"";
	public static final String red = "\"red\"";
    
}

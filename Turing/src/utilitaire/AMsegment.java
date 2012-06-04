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
import java.awt.geom.Line2D.Double;
import java.awt.geom.Line2D;
import java.awt.Color;

class AMsegment extends Line2D.Double
{
	Color c;	
    AMsegment(AMPoint A, AMPoint B)
    {
        super(A,B);
        c = Color.black;
    }
    
    public AMsegment(AMPoint A, AMPoint B, Color c){
    	super(A,B);
    	this.c = c;
    }
    
    AMsegment(double x1, double y1, double x2, double y2){
    	super(x1, x2, y1, y2);
    	c = Color.black;
    }
}

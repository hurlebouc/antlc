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

import java.awt.Color;
import java.awt.geom.*;

public class AMArc extends Arc2D.Double {

	Color c;

	private AMArc(double x, double y, double w, double h, double start,
			double extent) {
		super(x, y, w, h, start, extent, Arc2D.OPEN);
		c = Color.black;
	}

	public static AMArc sur(Point P, Point Q, Point C) {//arc de centre C, qui
														// va de P a Q
		double r = C.norme(P);
		double x = C.x - r;
		double y = C.y - r;
		double w = 2 * r;
		double start = C.angle(P);
		double extent = C.angle(Q) - start;
		return new AMArc(x, y, w, w, -start, -extent);
	}

}
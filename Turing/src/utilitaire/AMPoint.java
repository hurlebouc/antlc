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
// Source File Name:   AMPanel.java

import java.awt.Color;

class AMPoint extends Point
{
	Color maCouleur;
	   
    AMPoint(Point unPoint)
    {
    	super(unPoint);
    	maCouleur = Color.BLACK;
    }

    AMPoint(Point unPoint, int R, int G, int B)
    {
    	super(unPoint);
        maCouleur = new Color(R, G, B);
    }

    AMPoint(Point unPoint, int R, int G, int B, int alpha)
    {
super(unPoint);		
        maCouleur = new Color(R, G, B, alpha);
    }

    AMPoint(double x, double y, int R, int G, int B){
        super(x,y);
        maCouleur = new Color(R, G, B);
    }
    
    AMPoint(double x, double y, int R, int G, int B, int alpha){
        super(x,y);
        maCouleur = new Color(R, G, B, alpha);
        }
    
    AMPoint(double x, double y){
        super(x,y);
maCouleur = Color.black;	
        }
     
}

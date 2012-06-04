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
// Source File Name:   ArdoiseMagique.java

import javax.swing.JApplet;
import javax.swing.JFrame;

public class ArdoiseMagique extends JApplet
{

    private ArdoiseMagique()
    {
        this(500, 400);
    }

    private ArdoiseMagique(int width, int height)
    {
        monCanvas = new AMPanel();
        getContentPane().add("Center", monCanvas);
        resize(width, height);
        setVisible(true);
    }

    public static void demarrerAuCasOu()
    {
        if(monSingleton == null)
        {
            monSingleton = new ArdoiseMagique();
            JFrame maFrame = new JFrame("Ardoise Magique");
            maFrame.setLocation(300, 300);
            maFrame.setSize(500, 300);
            maFrame.getContentPane().add(monSingleton);
            maFrame.setDefaultCloseOperation(3);
            maFrame.show();
            //applet.monCanvas.valeurEchelleParDefaut();
        }
    }

    public static void dessinerPoint(double x, double y)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.addPoint(x, y);
        monSingleton.monCanvas.repaint();
    }

    public static void dessinerPoint(double x, double y, int R, int G, int B)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.addPoint(x, y, R, G, B);
        monSingleton.monCanvas.repaint();
    }

    public static void dessinerPoint(double x, double y, int R, int G, int B, int alpha)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.addPoint(x, y, R, G, B, alpha);
        monSingleton.monCanvas.repaint();
    }

    public static void dessinerNomPoint(String nom, double x, double y)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.addNomDePoint(nom, x, y);
        monSingleton.monCanvas.repaint();
    }

    public static void dessinerTexte(String duTexte, double x, double y)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.addTexte(duTexte, x, y);
        monSingleton.monCanvas.repaint();
    }

    public static void dessinerPoints(int x[], int y[])//parce que int[] ne se convertit pas en double[]
    {
        demarrerAuCasOu();
        try
        {
            monSingleton.monCanvas.addPoints(x, y);
        }
        catch(AMCException e)
        {
            Utilitaire.ecrire("Il devrait y avoir autant d'abscisses que d'ordonn\u017Des : " + x.length + " abscisses et " + y.length + " ordonn\u017Des");
            e.printStackTrace();
        }
        monSingleton.monCanvas.repaint();
    }

    
    public static void dessinerPoints(double x[], double y[])
    {
  dessinerPoints(x,y,0,0,0,0);//par défaut en noir
  }

    public static void dessinerPoints(double x[], double y[], int R, int G, int B)
    {
    	dessinerPoints(x,y,R,G,B,255);
    }

    public static void dessinerPoints(double x[], double y[], int R, int G, int B, int alpha)
    {
        demarrerAuCasOu();
if(x.length == y.length){
		for (int i = 0 ; i < x.length ; i ++)
			monSingleton.monCanvas.addPoint(x[i], y[i], R, G, B, alpha);
        }	
        else{
            Utilitaire.ecrire("Il devrait y avoir autant d'abscisses que d'ordonn\u017Des : " + x.length + " abscisses et " + y.length + " ordonn\u017Des");
        }
        monSingleton.monCanvas.repaint();
    }

    public static void dessinerSegment(double x1, double y1, double x2, double y2)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.addSegment(x1, y1, x2, y2);
        monSingleton.monCanvas.repaint();
    }
    public static void dessinerArc(Point P, Point Q, Point C)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.addArc(P,Q,C);
        monSingleton.monCanvas.repaint();
    }

    public static void dessinerArc(Point P, Point Q, Point C, int R, int G, int B)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.addArc(P,Q,C, R, G, B);
        monSingleton.monCanvas.repaint();
    }

 
    
    public static void effacerTout()
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.effacerArdoise();
        monSingleton.monCanvas.repaint();
    }

    public static void changeTaillePoint(int t)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.changeTaillePoint(t);
        monSingleton.monCanvas.repaint();
    }

    public static void echelle()
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.echelle();
        monSingleton.monCanvas.repaint();
    }

    public static void echelle(double minX, double minY, double width, double height)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.fixerEchelle(minX, minY, width, height);
        monSingleton.monCanvas.repaint();
    }
    
    public static void echelleAvecMarge(double minX, double minY, double width, double height)
    {
        demarrerAuCasOu();
        monSingleton.monCanvas.fixerEchelleAvecMarge(minX, minY, width, height);
        monSingleton.monCanvas.repaint();
    }
    
    private AMPanel monCanvas;
    private static ArdoiseMagique monSingleton = null;

}

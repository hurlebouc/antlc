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
// Source File Name: AMPanel.java

import java.awt.*;
import java.util.Vector;
import javax.swing.JPanel;
import java.awt.geom.*;
import java.text.*;

class AMPanel extends JPanel {

	AMPanel() {
		points = new Vector();
		segments = new Vector();
		nomsPoint = new Vector();
		textes = new Vector();
		arcs = new Vector();
		delta = 3;
	}

	public void addPoint(double x, double y) {
		points.add(new AMPoint(x, y));
	}

	public void addPoint(double x, double y, int R, int G, int B) {
		points.add(new AMPoint(x, y, R, G, B));
	}

	public void addPoint(double x, double y, int R, int G, int B, int alpha) {
		points.add(new AMPoint(x, y, R, G, B, alpha));
	}

	public void addNomDePoint(String unNom, double x, double y) {
		nomsPoint.add(new AMText(unNom, x, y));
	}

	public void addTexte(String unTexte, double x, double y) {
		textes.add(new AMText(unTexte, x, y));
	}

	public void addSegment(double x1, double y1, double x2, double y2) {
		segments.add(new AMsegment(new AMPoint(x1, y1), new AMPoint(x2, y2)));
	}

	public void addArc(Point A, Point B, Point C) {//arc de cercle passant par
												   // A, B et
		// de centre C
		arcs.add(AMArc.sur(A, B, C));
	}

	public void addArc(Point A, Point B, Point C, int R, int G, int Bl) {
		AMArc a = AMArc.sur(A, B, C);
		a.c = new Color(R, G, Bl);
		arcs.add(a);
	}

	public void addPoints(int abs[], int ord[]) throws AMCException {
		if (abs.length != ord.length)
			throw new AMCException("abs != ord");
		for (int i = 0; i < abs.length; i++)
			points.add(new AMPoint(abs[i], ord[i]));
	}

	public void addPoints(double abs[], double ord[]) throws AMCException {
		if (abs.length != ord.length)
			throw new AMCException("abs != ord");
		for (int i = 0; i < abs.length; i++)
			points.add(new AMPoint(abs[i], ord[i]));
	}

	public void valeurEchelleParDefaut() {
		maxX = maxY = 10;
		minX = minY = -10;
	}

	public void fixerEchelleAvecMarge(double uneAbscisseMin,
			double uneOrdonneeMin, double uneLargeur, double uneHauteur) {
		fixerEchelle(uneAbscisseMin - 0.1 * uneLargeur, uneOrdonneeMin - 0.1
				* uneHauteur, 1.2 * uneLargeur, 1.2 * uneHauteur);
	}

	public void fixerEchelle(double uneAbscisseMin, double uneOrdonneeMin,
			double uneLargeur, double uneHauteur) {
		minX = uneAbscisseMin;
		minY = uneOrdonneeMin;
		maxX = minX + Math.abs(uneLargeur);
		maxY = minY + Math.abs(uneHauteur);
	}

	public void effacerArdoise() {
		points.removeAllElements();
		segments.removeAllElements();
		nomsPoint.removeAllElements();
		points.removeAllElements();
		arcs.removeAllElements();
	}

	public void changeTaillePoint(int d) {
		delta = d;
	}

	public void rajusteEchelle(AMPoint P) {
		rajusteEchelle(P.x, P.y);
	}

	public void rajusteEchelle(double x, double y) {
		if (x > maxX)
			maxX = x;
		if (x < minX)
			minX = x;
		if (y > maxY)
			maxY = y;
		if (y < minY)
			minY = y;
	}

	public void echelle() {
		maxX = -1 * Double.MAX_VALUE;
		minX = Double.MAX_VALUE;
		maxY = -1 * Double.MAX_VALUE;
		minY = Double.MAX_VALUE;
		for (int i = 0; i < points.size(); i++)
			rajusteEchelle((AMPoint) points.get(i));

		for (int i = 0; i < segments.size(); i++) {
			AMsegment s = (AMsegment) segments.get(i);
			rajusteEchelle(s.x1, s.y1);
			rajusteEchelle(s.x2, s.y2);
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		calculEchelle();
		Graphics2D g2 = (Graphics2D) g;
		g2.transform(echelle);
		g2.setStroke(new BasicStroke(0));

		for (int i = 0; i < points.size(); i++)
			showPoint((AMPoint) points.get(i), g2);

		for (int i = 0; i < nomsPoint.size(); i++)
			showTexte((AMText) nomsPoint.get(i), g2);

		for (int i = 0; i < textes.size(); i++)
			showTexte((AMText) textes.get(i), g2);

		for (int i = 0; i < segments.size(); i++) {
			AMsegment s = (AMsegment) segments.get(i);
			g2.setColor(s.c);
			g2.draw(s);
		}

		for (int i = 0; i < arcs.size(); i++) {
			g2.setColor(Color.green);
			AMArc a = (AMArc) arcs.get(i);
			g2.setColor(a.c);
			g2.draw(a);
		}

		g2.setColor(Color.BLACK);
		if (showAxe) {
			g2.draw(abs);
			g2.draw(ord);
			 NumberFormat nf = NumberFormat.getInstance();
			 nf.setMaximumFractionDigits(3);
			showTexte("(" + nf.format(minX) + "," + nf.format(minY) + ")", minX, minY, g2, true);
			showTexte("("+nf.format(maxX)+","+nf.format(maxY)+")", maxX, maxY, g2, false);
		}
	}

	private void showPoint(AMPoint A, Graphics2D g2) {
		Point2D.Double p = new Point2D.Double(delta, delta);
		Point2D q = new Point2D.Double();
		q = g2.getTransform().deltaTransform(p, q);
		g2.setColor(A.maCouleur);
		Rectangle2D.Double ell = new Rectangle2D.Double(A.x, A.y, delta
				* (maxX - minX) / getWidth(), delta * (maxY - minY)
				/ getHeight());
		g2.fill(ell);
	}

	public boolean isShowAxe() {
		return showAxe;
	}

	public void setShowAxe(boolean showAxe) {
		this.showAxe = showAxe;
	}

	private void showTexte(AMText duTexte, Graphics2D g2) {
		AffineTransform copie = g2.getTransform();
		//on recupere le lieu ou l'on doit ecrire le texte
		//dans notre repere de coordonnŽes
		Point2D p = copie.transform(new Point2D.Double(duTexte.position.x,
				duTexte.position.y), null);
		AffineTransform af = new AffineTransform();
		g2.setTransform(af);//on ecrit pas en fonction de la taille de la
							// fenetre
		g2.setColor(Color.BLACK);//a revoir
		g2.drawString(duTexte.texte, (int) p.getX(), (int) p.getY());
		g2.setTransform(copie);
	}

	private void showTexte(String s, double x, double y, Graphics2D g2,
			boolean estBasGauche) {
		AffineTransform copie = g2.getTransform();
		Point2D q = copie.transform(new Point2D.Double(x, y), null);
		AffineTransform af = new AffineTransform();
		g2.setTransform(af);//on ecrit pas en fonction de la taille de la
							// fenetre
		g2.setColor(Color.BLACK);//a revoir
		if (estBasGauche) {
			g2.drawString(s, (int) (q.getX() + delta),
							(int) (q.getY() - delta));
		} else {
			FontMetrics fm = g2.getFontMetrics();
			g2.drawString(
					s, 
					getSize().width - fm.stringWidth(s) - 2,
					fm.getAscent());
		}
		g2.setTransform(copie);
	}

	private void calculEchelle() {
		double a = ((double) getWidth()) / (maxX - minX);
		double b = ((double) getHeight()) / (minY - maxY);
		echelle.setTransform(a, 0, 0, b, -1 * minX * a, -1 * maxY * b);
		abs.setLine(minX, 0, maxX, 0);
		ord.setLine(0, minY, 0, maxY);
	}

	private Vector points;

	private Vector segments;

	private Vector nomsPoint;

	private Vector textes;

	private Vector arcs;

	private double maxX;

	private double minX;

	private double maxY;

	private double minY;

	private int delta;//"dimension du point

	private AffineTransform echelle = new AffineTransform();

	private boolean showAxe = true;

	private Line2D.Double abs = new Line2D.Double();

	private Line2D.Double ord = new Line2D.Double();

	private Point2D origine = new AMPoint(0, 0);

	private double epsilon = 0;
}
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
import java.awt.geom.*;

public class Point extends Point2D.Double{

	static final double epsilon = 0.00001;
	
	public Point(double a, double b){
		this.x = a;
		this.y = b;
	}
	
	public Point(Point p){
		x = p.x;
		y = p.y;
	}
	public Point inverse(double a11, double a12, double a21, double  a22){
		//Equation
		//(a11 a12) (x) = (this.x)
		//(a21 a22) (y) = (this.y)
		double det = Math.abs(a11*a22-a12*a21);
		return new Point((a22*x+a21*y)/det, (a12*x+a11*y)/det);
	}
	
	public void goTo(double a, double b){
		this.x = a;
		this.y = b;
	}
	
	public double angle(Point B){
	//angle de AB vs "horizontale"
		Point AB = vecteur(B).normalise();
		if (AB.x < 0){
			AB = AB.prod(-1);
			return 180 * Math.asin(AB.y) / Math.PI+180;//il est norme
		}
		else return 180 * Math.asin(AB.y) / Math.PI;
	}
	
	public Point perp(Point Q){//retourne le vecteur normal de PQ
		Point PQ = vecteur(Q);
		return new Point(-1*PQ.y/PQ.norme(), PQ.x/PQ.norme());
	}
	
	public Point normal(Point Q){//vecteur normal
		Point PQ = perp(Q);
		return PQ.prod(1/PQ.norme());
	}
	
	public Point normalise(){
		return new Point(x/norme(), y/norme());
	}
	
	public Point prod(double alpha){
		return new Point(x*alpha, y*alpha);
	}
	
	public double scalaire(Point P){
		return x*P.x+y*P.y;
	}
	
	public double det(Point P){
		return x*P.y - y * P.x;
	}
	public Point plus(Point Q){
		return new Point(x+Q.x, y+Q.y);
	}
	
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
	
	public Point milieu(Point B){
		return new Point((x+B.x)/2, (y+B.y)/2);
	}
	
	public Point vecteur(Point B){
		return new Point(B.x -x, B.y - y);
	}
	
	public double norme(){
		return Math.sqrt(x*x+y*y);
	}

	public double norme(Point P){
		return Math.sqrt( (P.x - x)*(P.x - x)+(P.y - y)*(P.y - y) );
	}
	
	public double norme2(Point P){
		return (P.x - x)*(P.x - x)+(P.y - y)*(P.y - y) ;
	}
	
	public double norme2(){
		return x*x+y*y;
	}
	
	public boolean egal(Point autre){//on pourrait faire l'ŽgalitŽ stricte, mais je prend un peu de marge
		return (Math.abs(this.x - autre.x) + Math.abs(this.y - autre.y)) < epsilon;
	}
	
	public boolean surSegment(Point A, Point B){//this sur [A,B]
		double t = (this.x - A.x)/(B.x-A.x);
		boolean colineaire = Math.abs((this.y-A.y)/(B.y-A.y)-t) < epsilon;
		return colineaire && (t >= 0) && (t <=1); //je tiens pas compte de epsilon
	}

	public double det (Point A, Point B){//on considere la position de this vis a vis de [AB]
		return ((this.x-A.x)*(B.y-A.y)-(this.y-A.y)*(B.x-A.x));	
		}

	public static boolean seCroisent(Point A, Point B, Point C, Point D){
		return (A.det(C,D)*B.det(C,D) < 0) && (C.det(A,B)*D.det(A,B) < 0);
	}

	public double rayon(Point P, Point Q){
	Point PQ = P.vecteur(Q), PA = P.vecteur(this), QA = Q.vecteur(this);
	return PQ.norme() * PA.norme() * QA.norme() / ( 2 * Math.abs(PQ.det(PA)));
	
	}
	
	public static void main(String[] args){
	}
}

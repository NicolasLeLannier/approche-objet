/**
 * 
 */
package fr.diginamic.formes;

/**
 * @author lelan
 *
 */
public class Carre extends Rectangle {
	
	/**
	 * @param longueur
	 * @param largeur
	 */
	public Carre(double longueur) {
		super(longueur, 0);
//		this.longueur = longueur;
	}
	
	public double calculerSurface() {
		return longueur * longueur;
	}

	public double calculerPerimetre() {
		return longueur * 4;
	}

}

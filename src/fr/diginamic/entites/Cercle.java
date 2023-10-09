package fr.diginamic.entites;

public class Cercle {

	protected double rayon;

	/**
	 * @param rayon
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double calculPerimetre() {
		return rayon * 2 * 3.14;
	}
	
	public double calculSurface() {
		return rayon * rayon * 3.14;
	}
}

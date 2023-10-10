package fr.diginamic.formes;

public class Cercle extends Forme {

	protected double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		return rayon * rayon * 3.14;
	}

	@Override
	public double calculerPerimetre() {
		return rayon * 2 * 3.14;
	}

	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

}

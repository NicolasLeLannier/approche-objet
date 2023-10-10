package fr.diginamic.maison;

public abstract class Piece {

	protected double superficie;
	protected int numEtage;
	
	/**
	 * @param superficie
	 * @param numEtage
	 */
	public Piece(double superficie, int numEtage) {
		super();
		this.superficie = superficie;
		this.numEtage = numEtage;
	}
}

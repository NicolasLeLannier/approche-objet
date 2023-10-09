package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double tauxRemuneration;
	
	public CompteTaux(int comtpe, double solde, double tauxRemuneration) {
		super(comtpe, solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public String toString() {
		return "CompteTaux [tauxRemuneration=" + tauxRemuneration + ", " + super.toString() + "]";
	}

	/**
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}

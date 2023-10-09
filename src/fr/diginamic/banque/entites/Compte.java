package fr.diginamic.banque.entites;

public class Compte {
	private int comtpe;
	private double solde;
	
	/**
	 * @param comtpe
	 * @param solde
	 */
	public Compte(int comtpe, double solde) {
		this.comtpe = comtpe;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [comtpe=" + comtpe + ", solde=" + solde + "]";
	}

	public void afficherInfo() {
		System.out.println(getComtpe() +  " " + getSolde());
	}
	
	/**
	 * @return the comtpe
	 */
	public int getComtpe() {
		return comtpe;
	}

	/**
	 * @param comtpe the comtpe to set
	 */
	public void setComtpe(int comtpe) {
		this.comtpe = comtpe;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
}

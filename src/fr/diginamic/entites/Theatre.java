package fr.diginamic.entites;

public class Theatre {
	protected String nom;
	protected int capaciteMax;
	protected int totalClientInscrit;
	protected int recetteTotalEtablissement;
	
	
	/**
	 * @param nom
	 * @param capaciteMax
	 * @param totalClientInscrit
	 * @param recetteTotalEtablissement
	 */
	public Theatre(String nom, int capaciteMax, int totalClientInscrit, int recetteTotalEtablissement) {
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.totalClientInscrit = totalClientInscrit;
		this.recetteTotalEtablissement = recetteTotalEtablissement;
	}
	
	
	public void inscrire(int nbClient, int prixPlace) {
		if(this.capaciteMax >= this.totalClientInscrit + nbClient) {
			this.totalClientInscrit += nbClient;
			this.recetteTotalEtablissement += prixPlace * nbClient;
		} else {
			if(this.capaciteMax - this.totalClientInscrit > 0) {
				System.out.println("Désolé, nous n'avons plus que " + (this.capaciteMax - this.totalClientInscrit) + " places.");
			} else {
				System.out.println("Désolé, nous n'avons plus de place.");
			}
		}
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the capaciteMax
	 */
	public int getCapaciteMax() {
		return capaciteMax;
	}


	/**
	 * @param capaciteMax the capaciteMax to set
	 */
	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}


	/**
	 * @return the totalClientInscrit
	 */
	public int getTotalClientInscrit() {
		return totalClientInscrit;
	}


	/**
	 * @param totalClientInscrit the totalClientInscrit to set
	 */
	public void setTotalClientInscrit(int totalClientInscrit) {
		this.totalClientInscrit = totalClientInscrit;
	}


	/**
	 * @return the recetteTotalEtablissement
	 */
	public int getRecetteTotalEtablissement() {
		return recetteTotalEtablissement;
	}


	/**
	 * @param recetteTotalEtablissement the recetteTotalEtablissement to set
	 */
	public void setRecetteTotalEtablissement(int recetteTotalEtablissement) {
		this.recetteTotalEtablissement = recetteTotalEtablissement;
	}

}

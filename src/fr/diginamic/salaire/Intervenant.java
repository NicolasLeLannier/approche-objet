package fr.diginamic.salaire;

public abstract class Intervenant {

	protected String nom;
	protected String prenom;
	
	/**
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	
	public String afficherDonnees() {
		return "Nom : " + nom + "\nPrénom : " + prenom;
	}
}

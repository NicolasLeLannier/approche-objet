package fr.diginamic.enums;

public class Personne {
	/** Nom de la personne */
	public String nom;

	/** Prénom de la personne */
	public String prenom;

	/** Adresse postale de la personne */
	public GroupeSanguin gs;

	/**
	 * @param nvNom  nom
	 * @param prenom prenom
	 */
	public Personne(String nvNom, String prenom) {
		nom = nvNom;
		this.prenom = prenom;
	}

	/**
	 * Constructeur
	 * 
	 * @param nom     nom
	 * @param prenom  prénom
	 * @param adresse adresse postale
	 */
	public Personne(String nom, String prenom, GroupeSanguin gs) {
		this.nom = nom;
		this.prenom = prenom;
		this.gs = gs;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", gs=" + gs + "]";
	}

	public void Afficher() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setGs(GroupeSanguin gs) {
		this.gs = gs;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public GroupeSanguin getGs() {
		return gs;
	}
}

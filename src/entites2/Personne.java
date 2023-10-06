package entites2;

import entites.AdressePostale;



/** SonarQube est impitoyable avec la javadoc !!!  Shift + Alt + J
 * @author lelan
 *
 */
public class Personne {
	/** Nom de la personne */
	public String nom;
	
	/** Prénom de la personne */
	public String prenom;
	
	/** Adresse postale de la personne */
	public AdressePostale adresse;
	
	/**
	 * @param nvNom 	nom
	 * @param prenom	prenom
	 */
	public Personne(String nvNom, String prenom) {
		nom = nvNom;
		this.prenom = prenom;
	}
	
	/** Constructeur
	 * @param nom 		nom
	 * @param prenom	prénom
	 * @param adresse	adresse postale
	 */
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}

	public void Afficher() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public AdressePostale getAdresse() {
		return adresse;
	}
}

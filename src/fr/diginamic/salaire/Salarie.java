package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	protected double salaire;
	protected String statut = "CDI";
	
	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {
		return salaire;
	}

	@Override
	public String afficherDonnees() {
		return super.afficherDonnees() + "\nSalaire : " + salaire + "\nStatut : " + statut;
	}
	

}

package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	protected int nbJoursTravaille;
	protected double remunerationJournaliere;
	protected String statut = "Indépendant";
	
	public Pigiste(String nom, String prenom,int nbJoursTravaille, double remunerationJournaliere) {
		super(nom, prenom);
		this.nbJoursTravaille = nbJoursTravaille;
		this.remunerationJournaliere = remunerationJournaliere;
	}

	@Override
	public double getSalaire() {
		return remunerationJournaliere * nbJoursTravaille;
	}
	
	
	public String afficherDonnees() {
		return super.afficherDonnees() + "\nSalaire : " + getSalaire() + "\nStatut : " + statut;
	}

}

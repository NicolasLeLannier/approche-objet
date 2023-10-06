package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne p1 = new Personne();
		Personne p2 = new Personne();
		
		AdressePostale adr1 = new AdressePostale();
		AdressePostale adr2 = new AdressePostale();
		
		adr1.codePostal = 37390;
		adr1.libelleRue = "Nana";
		adr1.numeroRue = 6;
		adr1.ville = "Tours";
		
		adr2.codePostal = 89390;
		adr2.libelleRue = "Jazejl";
		adr2.numeroRue = 4;
		adr2.ville = "Orléans";
		
		p1.nom = "Titiname";
		p1.prenom = "Titi";
		p1.adresse = adr1;
		
		p2.nom = "Le Lannier";
		p2.prenom = "Laura";
		p2.adresse = adr2;
	}

}

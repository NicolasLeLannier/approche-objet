package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne p1 = new Personne("Titiname", "Titi");
		Personne p2 = new Personne("Le Lannier", "Laura");
		
		AdressePostale adr1 = new AdressePostale(37390, "Nana", 6, "Tours");
		AdressePostale adr2 = new AdressePostale(89390, "Jazejl", 4, "Orléans");
		
//		p1.nom = "Titiname";
//		p1.prenom = "Titi";
		p1.adresse = adr1;
		
//		p2.nom = "Le Lannier";
//		p2.prenom = "Laura";
		p2.adresse = adr2;
		
		
		Personne p3 = new Personne("Titiname", "Titi", adr1);
		Personne p4 = new Personne("Le Lannier", "Laura", adr2);
		
		System.out.println(p4.nom);
		System.out.println(p3.prenom);
		System.out.println(p1.prenom);
		System.out.println(p3.nom + "  " +p3.prenom + " :  " + p3.adresse.ville);
		
		AdressePostale adr3 = new AdressePostale(10000, "Rue de la paix", 61, "Bordeaux");
		
		System.out.println("\n-----------------------------------------\n");
		
		p4.Afficher();
		p3.setPrenom("Maria");
		p3.Afficher();
		System.out.println(p3.adresse.ville);
		p3.setAdresse(adr3);
		System.out.println(p3.adresse.ville);
		System.out.println(p3.getAdresse().libelleRue);
	}

}

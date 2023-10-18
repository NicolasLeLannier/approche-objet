package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saison[] listeSaison = Saison.values();
		
		for(Saison s : listeSaison) {
			System.out.println(s);
		}
		
		Saison s1 = Saison.valueOf("ETE");
		System.out.println("\n" + s1.getLibelle());
		
		String libelle = "Hiver";
		Saison s2 = Saison.getSaisonByLibelle(libelle);
		System.out.println(s2);
	}

}

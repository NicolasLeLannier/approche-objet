package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : " + premierCaractere);
		
		System.out.println(chaine.length());
		
		System.out.println(chaine.indexOf(';'));
		
		String nom = chaine.substring(0, chaine.indexOf(';'));
		System.out.println(nom);
		
		System.out.println(nom.toUpperCase());
		System.out.println(nom.toLowerCase());
		
		System.out.println("\n");
		
		String[] split = chaine.split(";");
		for(String contenu : split) {
			System.out.println(contenu);
		}
		
		
		double salaireEnDouble = Double.parseDouble(split[2].replace(" ", ""));
		Salarie salaire = new Salarie(split[0], split[1], salaireEnDouble);
		
		System.out.println(salaire.getSalaire());
	}

}

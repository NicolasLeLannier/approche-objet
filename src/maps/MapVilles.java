package maps;

import java.util.HashMap;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int moinsHabitants = 28000000;
		String nomMoinsHabitants = "";
		
		HashMap<String, Ville> villes = new HashMap<>();
		Ville ville1 = new Ville("Tours", 110000);
		Ville ville2 = new Ville("Montpellier", 245000);
		Ville ville3 = new Ville("Nantes", 280000);
		
		villes.put(ville1.getNom(), ville1);
		villes.put(ville2.getNom(), ville2);
		villes.put(ville3.getNom(), ville3);
		
		for(Ville contenu : villes.values()) {
			if(contenu.getNbHabitant() < moinsHabitants) {
				moinsHabitants = contenu.getNbHabitant();
				nomMoinsHabitants = contenu.getNom();
			}
		}
		
		villes.remove(nomMoinsHabitants);
		
		for(String key : villes.keySet()) {
			System.out.println(key);
		}
		
		for(Ville contenu : villes.values()) {
			System.out.println(contenu);
		}
	}

}

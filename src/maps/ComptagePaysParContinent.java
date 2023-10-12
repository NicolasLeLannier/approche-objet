package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		ArrayList<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("France", 65000000, "Europe"));
		listePays.add(new Pays("Allemagne", 80000000, "Europe"));
		listePays.add(new Pays("Belgique", 10000000, "Europe"));
		listePays.add(new Pays("Russie", 150000000, "Asie"));
		listePays.add(new Pays("Chine", 1400000000, "Asie"));
		listePays.add(new Pays("Indonésie", 220000000, "Océanie"));
		listePays.add(new Pays("Australie", 20000000, "Océanie"));
		
		
		// Compter les pays par continent : aggrégation
		// Etape 1 : créer map (clé : continent / valeur : compteur)
		HashMap<String, Integer> compterNbPays = new HashMap<>();
		
		
		// Etape 2 : comptage
		for(Pays pays : listePays) {
			Integer compteur = compterNbPays.getOrDefault(pays.getContinent(), 0);
			compteur ++;
			compterNbPays.put(pays.getContinent(), compteur);
		}
		
		System.out.println(compterNbPays);
		
		for (Map.Entry m : compterNbPays.entrySet()) {
            System.out.println("Continent : " + m.getKey() + ", Nombre de Pays : " + m.getValue());
        }
		
	}

}

package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int comptageEurope = 0;
		int comptageAsie = 0;
		int comptageOceanie = 0;
		
		ArrayList<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("France", 65000000, "Europe"));
		listePays.add(new Pays("Allemagne", 80000000, "Europe"));
		listePays.add(new Pays("Belgique", 10000000, "Europe"));
		listePays.add(new Pays("Russie", 150000000, "Asie"));
		listePays.add(new Pays("Chine", 1400000000, "Asie"));
		listePays.add(new Pays("Indonésie", 220000000, "Océanie"));
		listePays.add(new Pays("Australie", 20000000, "Océanie"));
		
		for(Pays contenu : listePays) {
			System.out.println(contenu);
		}
		
		HashMap<String, Integer> compterNbPays = new HashMap<>();
		
		for(Pays contenu : listePays) {
			if(contenu.continent.equals("Europe")) {
				comptageEurope ++;
			} else if(contenu.continent.equals("Asie")) {
				comptageAsie ++;
			} else {
				comptageOceanie ++;
			}
		}
		
		compterNbPays.put("Europe", comptageEurope);
		compterNbPays.put("Asie", comptageAsie);
		compterNbPays.put("Oceanie", comptageOceanie);
		
		for (Map.Entry m : compterNbPays.entrySet()) {
            System.out.println("Continent : " + m.getKey() + ", Nombre de Pays : " + m.getValue());
        }
	}

}

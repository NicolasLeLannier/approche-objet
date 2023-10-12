package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Pays> listePays = new ArrayList<>();
		listePays.add(new Pays("France", 65000000, "Europe"));
		listePays.add(new Pays("Allemagne", 80000000, "Europe"));
		listePays.add(new Pays("Belgique", 10000000, "Europe"));
		listePays.add(new Pays("Russie", 150000000, "Asie"));
		listePays.add(new Pays("Chine", 1400000000, "Asie"));
		listePays.add(new Pays("Indonésie", 220000000, "Océanie"));
		listePays.add(new Pays("Australie", 20000000, "Océanie"));
		
		List<String> listeNoms = new ArrayList<>();
		listeNoms.add("le");
		listeNoms.add("jardin");
		listeNoms.add("fleur");
		listeNoms.add("arbre");
		listeNoms.add("herbe");
		
		// .asList => liste nom modifiable (pas d'ajout)
		
		List<String> liste = new ArrayList<>();
		Collections.addAll(liste, "le", "jardin", "fleur", "arbre", "herbe");
		
		// Si ça renvoie un nombre positif => doit swap de place les 2
		System.out.println("le".compareTo("jardin"));
		System.out.println("jardin".compareTo("le"));
		
		// ------- Fonctionne pas sans le implements Comparable dans la classe Pays ainsi la méthode compareTo()
//		Collections.sort(listePays, new PaysNomComparator());
		Collections.sort(listePays, new PaysComparator(1));
		
		// ------- Fonctionne
		Collections.sort(listeNoms);
		
		for(Pays p : listePays) {
			System.out.println(p);
		}
	}

}

package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int compteur = 1;

		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		HashMap<Integer, String> map3 = new HashMap<>();
//		Set<Integer> keys1 = map1.keySet();
		Collection<String> couleur1 = map1.values();
		
		// Tentative d'une double boucle for => pas réussis mais peut être quelque chose à faire ici
//		for(Integer key : keys1) {
		
		// Compteur car c'est des ID de 1 à 6
		for (String couleur : couleur1) {
			map3.put(compteur, couleur);
			compteur++;
		}
		
//		}
		
		
		// Test d'un merge => Fonctionne
//		map3.merge(1, "Rouge", (oldValue, newValue) -> oldValue + newValue);
		
		
		Collection<String> couleur2 = map2.values();
		for (String couleur : couleur2) {
			map3.put(compteur, couleur);
			compteur++;
		}

		Set<Integer> keys3 = map3.keySet();
		for (Integer key : keys3) {
			System.out.println(key);
		}
		Collection<String> couleur3 = map3.values();
		for (String couleur : couleur3) {
			System.out.println(couleur);
		}
	}

}

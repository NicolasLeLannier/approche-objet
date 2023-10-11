package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Set<Integer> keys = mapVilles.keySet();
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		Collection<String> villes = mapVilles.values();
		for(String ville : villes) {
			System.out.println(ville);
		}
		
		System.out.println(mapVilles.size());
	}

}

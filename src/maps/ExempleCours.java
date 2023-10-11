package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import listes.Ville;

public class ExempleCours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Ville tours = new Ville("Tours", 110000);
		
		HashMap<Integer, Ville> maps = new HashMap<>();
		
		// Mettre élément
		maps.put(37100, new Ville("Tours", 110000));
		maps.put(34000, new Ville("Montpellier", 245000));
		maps.put(44000, new Ville("Nantes", 280000));
		maps.put(37000, tours);
		
		// Récupérer élément par l'id (ici le code postal)
		Ville v = maps.get(34000);
		System.out.println(v + "\n");
		
		// Supprimer élément
		maps.remove(34000);
		
		// Afficher taille
		System.out.println(maps.size());
		
		for(Ville vil : maps.values()) {
			System.out.println(vil);
		}
		
		// Parcourir la map (renvoie les clès)
		Set<Integer> keys = maps.keySet();
		System.out.println(keys.getClass());
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		// Renvoie les valeurs
		Collection<Ville> villes = maps.values();
		System.out.println(villes.getClass());
		for(Ville afficher : villes) {
			System.out.println(afficher);
		}
	}

}

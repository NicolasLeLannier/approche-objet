package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int plusGrandNombreLettre = 0;
		String nomPlusGrandNombreLettre = "";
		char premierLettre;

		ArrayList<String> villes = new ArrayList<>();

		villes.add("Nice");
		villes.add("Carcassone");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");

		for (String contenu : villes) {
			if (plusGrandNombreLettre < contenu.length()) {
				plusGrandNombreLettre = contenu.length();
				nomPlusGrandNombreLettre = contenu;
			}
		}

		System.out.println(nomPlusGrandNombreLettre);

		for (int i = 0; i < villes.size(); i++) {
			villes.set(i, villes.get(i).toUpperCase());
		}

		System.out.println("------------------------");

		for (String contenu : villes) {
			System.out.println(contenu);
		}

		
//		Iterator<String> iterator = villes.iterator();
//		while(iterator.hasNext()) {
//			String contenu = iterator.next();
//			if(contenu.getNom().equals('N')) {
//				iterator.remove();
//			}
//		}
		
		for (int i = 0; i < villes.size(); i++) {
			premierLettre = villes.get(i).charAt(0);
			if (premierLettre == 'N') {
				villes.remove(i);
			}
		}

		System.out.println("------------------------");

		for (String contenu : villes) {
			System.out.println(contenu);
		}
	}

}

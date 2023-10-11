package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int plusGrandNombreDeLettre = 0;
		String nomPlusGrandNombreDeLettre = "";

		HashSet<String> listPays = new HashSet<>();
		listPays.add("USA");
		listPays.add("France");
		listPays.add("Allemagne");
		listPays.add("UK");
		listPays.add("Italie");
		listPays.add("Japon");
		listPays.add("Chine");
		listPays.add("Russie");
		listPays.add("Inde");
		
		for(String test : listPays) {
			if(test.length() > plusGrandNombreDeLettre) {
				plusGrandNombreDeLettre = test.length();
				nomPlusGrandNombreDeLettre = test;
			}
		}
		
		listPays.remove(nomPlusGrandNombreDeLettre);
		
		for(String contenu : listPays) {
			System.out.println(contenu);
		}
	}

}

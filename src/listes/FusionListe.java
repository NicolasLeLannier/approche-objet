package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> liste1 = new ArrayList<>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<>();
		
		for(String contenuList1 : liste1) {
			liste3.add(contenuList1);
		}
		
		for(String contenuList2 : liste2) {
			liste3.add(contenuList2);
		}
		
		for(String afficher : liste3) {
			System.out.println(afficher);
		}
	}

}

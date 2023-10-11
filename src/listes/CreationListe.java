package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> liste = new ArrayList<>();
		
		for(double i = 1; i <= 100 ; i++) {
			liste.add(i);
		}
		
		System.out.println(liste.size());
		
	}

}

package fr.diginamic.banqu;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte[] c = new Compte[2];
//		Compte[] c = {new Compte(1, 345), new CompteTaux(1, 345, 0.2)};

		c[0] = new Compte(1, 345);
		c[1] = new CompteTaux(1, 345, 0.2);
		
		for(Compte numbers : c) {
			System.out.println(numbers);
		}
	}

}

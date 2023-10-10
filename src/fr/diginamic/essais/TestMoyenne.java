package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculMoyenne nb1 = new CalculMoyenne();
		
		nb1.ajout(2);
		nb1.ajout(4);
		nb1.ajout(6);

		
		System.out.println(nb1.calcul());
	}

}

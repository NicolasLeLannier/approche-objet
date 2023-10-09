package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operations operations = new Operations();
		
		System.out.println(operations.calcul(10, 5, '+'));
		System.out.println(operations.calcul(10, 5, '-'));
		System.out.println(operations.calcul(10, 5, '*'));
		System.out.println(operations.calcul(10, 5, '/'));

	}
	
}

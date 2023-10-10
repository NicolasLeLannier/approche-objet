package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	protected double[] tableau = new double[0];
	
	public void ajout(double valeur) {
		tableau = Arrays.copyOf(tableau, tableau.length + 1);
		tableau[tableau.length-1] = valeur;
	}
	
	public double calcul() {
		double somme = 0;
		for(double i : tableau) {
			somme += i;
		}
		
		return somme / tableau.length;
	}
}

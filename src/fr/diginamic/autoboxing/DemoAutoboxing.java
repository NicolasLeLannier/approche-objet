package fr.diginamic.autoboxing;

import java.util.ArrayList;

public class DemoAutoboxing {

	public static void main(String[] args) {

		// Autoboxing : conversion d'un tpye primitif dans sa classe de base
		Integer a = 12;
		
		// Autoboxing d'un double
		Double b = 1.25;
		
		ArrayList<Double> liste = new ArrayList<>();
		liste.add(new Double(15.6));
		
		// Unboxing
		double value = liste.get(0);
		
		// Conversion implicite, ici int dans double
		double resultat = 22;
		
		// Conversion implicite et autoboxing ne sont pas compatible, il faut mettre 22.0
//		Double resultat = 22;
	}

}

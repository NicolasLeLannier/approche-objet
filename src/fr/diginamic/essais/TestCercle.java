package fr.diginamic.essais;

import org.apache.commons.lang3.math.NumberUtils;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cercle cercle1 = new Cercle(5);
		Cercle cercle2 = new Cercle(7);
		
		System.out.println("Périmètre cercle 1 : " + cercle1.calculPerimetre());
		System.out.println("Périmètre cercle 2 : " + cercle2.calculPerimetre());
		
		System.out.println("Surface cercle 1 : " + cercle1.calculSurface());
		System.out.println("Surface cercle 2 : " + cercle2.calculSurface());
		
		
		Cercle c1 = CercleFactory.crerCercle(5);
		System.out.println(c1.calculPerimetre());
		
		NumberUtils.max(2, 5);
	}

}

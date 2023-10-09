package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

// Factory car elle permet de créer les Cercles
public class CercleFactory {

	public static Cercle crerCercle(double nombreACaster) {
		Cercle cercle = new Cercle(nombreACaster);
		return cercle;
	}
}

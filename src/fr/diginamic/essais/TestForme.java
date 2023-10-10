package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cercle cercle = new Cercle(5);
		Rectangle rectangle = new Rectangle(5, 10);
		Carre carre = new Carre(5);
		AffichageForme affichageForme = new AffichageForme();
		
		affichageForme.afficher(cercle);
		System.out.println("\n");
		affichageForme.afficher(rectangle);
		System.out.println("\n");
		affichageForme.afficher(carre);
	}

}

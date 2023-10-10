package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maison maison = new Maison();
		
		maison.ajouterPiece(new Chambre(11, 0));
		maison.ajouterPiece(new Cuisine(7, 0));
		maison.ajouterPiece(new Salon(16, 0));
		
		maison.ajouterPiece(new Chambre(10, 1));
		maison.ajouterPiece(new SalleDeBain(6, 1));
		maison.ajouterPiece(new WC(3, 1));
		
		maison.ajouterPiece(new Chambre(9, 2));
		maison.ajouterPiece(new WC(2, 2));
		
		maison.ajouterPiece(new Chambre(0, 0));
		maison.ajouterPiece(new Chambre(0, -1));
		
		System.out.print("\n");
		
		System.out.println("Superficie Maison : " + maison.getSuperficieMaison());
		System.out.println("Superficie Rez-de-chaussez : " + maison.getSuperficieEtage(0));
		System.out.println("Superficie Etage 1 : " + maison.getSuperficieEtage(1));
		System.out.println("Superficie Etage 2 : " + maison.getSuperficieEtage(2));
		
		System.out.print("\n");
		
		System.out.println("Superficie globale des chambres : " + maison.getSuperficieTypePiece(new Chambre(0, 0)));
		System.out.println("Superficie globale des chambres : " + maison.getSuperficieTypePiece(new WC(0, 0)));
		
		System.out.print("\n");
		
		System.out.println("Nombres de chambres : " + maison.getNombrePieceType(new Chambre(0, 0)));
		System.out.println("Nombres de salle de bain : " + maison.getNombrePieceType(new SalleDeBain(0, 0)));
	}

}

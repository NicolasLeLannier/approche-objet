package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	protected Piece[] tableau = new Piece[0];

	public void ajouterPiece(Piece piece) {
		if (piece.superficie <= 0 || piece.numEtage < 0) {
			System.out.println(
					"Erreur une donnée a été mal renseignée. La superficie doit être supérieur à 0 et/ou le numéro d'étage ne peux pas être inférieur à 0 !");
		} else {
			tableau = Arrays.copyOf(tableau, tableau.length + 1);
			tableau[tableau.length - 1] = piece;
		}
	}

	public double getSuperficieMaison() {
		double resultat = 0;

		for (int i = 0; i < tableau.length; i++) {
			resultat += tableau[i].superficie;
		}

		return resultat;
	}

	public double getSuperficieEtage(int numEtage) {
		double resultat = 0;

		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i].numEtage == numEtage) {
				resultat += tableau[i].superficie;
			}
		}

		return resultat;
	}

	public double getSuperficieTypePiece(Piece typePiece) {
		double resultat = 0;

		
		for (int i = 0; i < tableau.length; i++) {
			if(tableau[i].getClass() == typePiece.getClass()) {
				resultat += tableau[i].superficie;
			}
		}

		return resultat;
	}
	
	public int getNombrePieceType(Piece typePiece) {
		int resultat = 0;

		
		for (int i = 0; i < tableau.length; i++) {
			if(tableau[i].getClass() == typePiece.getClass()) {
				resultat ++;
			}
		}

		return resultat;
	}
}

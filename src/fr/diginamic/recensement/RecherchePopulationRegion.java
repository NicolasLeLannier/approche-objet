package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {

	public RecherchePopulationRegion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(List<Recensement> listeVilleDeBase, Scanner scanner) {
		int popTotal = 0;

		System.out.println("De quel région voulez-vous voir la population ?");

		String nomRegion = scanner.nextLine();

		// Parcourir la liste des villes pour attribuer ceux qu'on a besoin dans une List
		for (Recensement listeVille : listeVilleDeBase) {
			if (listeVille.getVille().getNomRegion().toUpperCase().equals(nomRegion.toUpperCase())) {
				popTotal += listeVille.getVille().getPopulationTotale();
			}
		}

		// Affichage final avec vérification de la population à 0
		if(popTotal == 0) {
			System.out.println("\nNous n'avons pas pu trouver de régions pour : " + nomRegion + "\n");
		} else {
			System.out.println("\nLa population total de la région " + nomRegion + " est de " + popTotal + "\n");
		}
	}

}

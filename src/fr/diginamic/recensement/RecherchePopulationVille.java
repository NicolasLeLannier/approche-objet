package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

	public RecherchePopulationVille() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(List<Recensement> listeVilleDeBase, Scanner scanner) {
		System.out.println("De quelle ville voulez-vous voir la population ?");
		
		String nomVille = scanner.nextLine();

		// Parcourir la liste des villes pour attribuer ceux qu'on a besoin dans une List + Affichage final avec vérification de la population à 0
		for(Recensement listeVille : listeVilleDeBase) {
			if(listeVille.getVille().getNomCommune().toUpperCase().equals(nomVille.toUpperCase())) {
				if(listeVille.getVille().getPopulationTotale() == 0) {
					System.out.println("\nNous n'avons pas pu trouver de ville pour : " + nomVille + "\n");
				} else {
					System.out.println("\nLa population total de " + nomVille + " est de " + listeVille.getVille().getPopulationTotale() + "\n");
				}
			} 
		}
	}

}

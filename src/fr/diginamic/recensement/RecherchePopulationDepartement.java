package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {

	public RecherchePopulationDepartement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(List<Recensement> listeVilleDeBase, Scanner scanner) {
		int popTotal = 0;
		
		System.out.println("De quel département voulez-vous voir la population ? Rentrer son code !");

		String codeDepartement = scanner.nextLine();

		for (Recensement listeVille : listeVilleDeBase) {
			if (listeVille.getVille().getCodeDepartement().equals(codeDepartement)) {
				popTotal += listeVille.getVille().getPopulationTotale();
			}
		}
		if(popTotal == 0) {
			System.out.println("\nNous n'avons pas pu trouver de département pour : " + codeDepartement + "\n");
		} else {
			System.out.println("\nLa population total du " + codeDepartement + " est de " + popTotal + "\n");
		}
	}

}

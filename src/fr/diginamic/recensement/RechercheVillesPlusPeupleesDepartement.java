package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVillesPlusPeupleesDepartement extends MenuService {

	public RechercheVillesPlusPeupleesDepartement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(List<Recensement> listeVilleDeBase, Scanner scanner) {
		Collections.sort(listeVilleDeBase, new ComparatorPopulation());
		
		int compteur = 1;
		
		List<String> listeVilleDuDepartement = new ArrayList<>();
		
		System.out.println("De quel département voulez-vous voir les 10 villes les plus peuplées ? Rentrer son code !");

		String codeDepartement = scanner.nextLine();
		
		for (Recensement listeVille : listeVilleDeBase) {
			if(listeVille.getVille().getCodeDepartement().equals(codeDepartement)) {
				listeVilleDuDepartement.add(listeVille.getVille().getNomCommune() + " avec une population de " + listeVille.getVille().getPopulationTotale());
			}
		}

		if(listeVilleDuDepartement.isEmpty()) {
			System.out.println("\nNous n'avons pas pu trouver de département pour : " + codeDepartement + "\n");
		} else {
			System.out.println("\nLes 10 villes les plus peuplées du département " + codeDepartement + " sont :");
			for (String topVilleDuDepartement : listeVilleDuDepartement) {
				if (compteur <= 10) {
					System.out.println("  " + compteur + " -  " + topVilleDuDepartement);
					compteur++;	
				}
			}
			System.out.print("\n");
		}
	}

}

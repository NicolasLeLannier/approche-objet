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
		// Trie sur les population
		Collections.sort(listeVilleDeBase, new ComparatorPopulation());
		
		// Initialisation d'une variable compteur
		int compteur = 1;
		
		// Initialisation d'une List
		List<String> listeVilleDuDepartement = new ArrayList<>();
		
		// Demande à l'utilisateur le département pour stocker le résultat dans une variable
		System.out.println("De quel département voulez-vous voir les 10 villes les plus peuplées ? Rentrer son code !");
		String codeDepartement = scanner.nextLine();
		
		// Parcourir la liste des villes pour attribuer ceux qu'on a besoin dans une List
		for (Recensement listeVille : listeVilleDeBase) {
			if(listeVille.getVille().getCodeDepartement().equals(codeDepartement)) {
				listeVilleDuDepartement.add(listeVille.getVille().getNomCommune() + " avec une population de " + listeVille.getVille().getPopulationTotale());
			}
		}

		// Affichage final avec vérification sur la List si elle est vide
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

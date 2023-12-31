package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVillesPlusPeupleesRegion extends MenuService {

	public RechercheVillesPlusPeupleesRegion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(List<Recensement> listeVilleDeBase, Scanner scanner) {
		// Trie sur les population
		Collections.sort(listeVilleDeBase, new ComparatorPopulation());

		// Initialisation d'une variable compteur
		int compteur = 1;

		// Initialisation d'une List
		List<String> listeVilleDeRegion = new ArrayList<>();

		// Demande à l'utilisateur la région pour stocker le résultat dans une variable
		System.out.println("De quel région voulez-vous voir les 10 villes les plus peuplées ?");
		String nomRegion = scanner.nextLine();
		
		// Parcourir la liste des villes pour attribuer ceux qu'on a besoin dans une List
		for (Recensement listeVille : listeVilleDeBase) {
			if (listeVille.getVille().getNomRegion().toUpperCase().equals(nomRegion.toUpperCase())) {
				listeVilleDeRegion.add(listeVille.getVille().getNomCommune() + " avec une population de " + listeVille.getVille().getPopulationTotale());
			}
		}

		// Affichage final avec vérification sur la List si elle est vide
		if(listeVilleDeRegion.isEmpty()) {
			System.out.println("\nNous n'avons pas pu trouver de régions pour : " + nomRegion + "\n");
		} else {
			System.out.println("\nLes 10 villes les plus peuplées de la région " + nomRegion + " sont :");
			for (String topVilleDeRegion : listeVilleDeRegion) {
				if (compteur <= 10) {
					System.out.println("  " + compteur + " -  " + topVilleDeRegion);
					compteur++;
				}
			}
			System.out.print("\n");
		}
	}

}

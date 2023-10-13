package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVillesPlusPeupleesFrance extends MenuService {

	public RechercheVillesPlusPeupleesFrance() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(List<Recensement> listeVilleDeBase, Scanner scanner) {
		// Trie sur les population
		Collections.sort(listeVilleDeBase, new ComparatorPopulation());
		
		// Initialisation d'une variable compteur
		int compteur = 1;
		
		// Affichage final avec vérification de la liste si elle est vide
		System.out.println("\nLes 10 villes les plus peuplées de France sont :");
		for(Recensement listeVille : listeVilleDeBase) {
			if(compteur <= 10) {
				System.out.println("  " + compteur + " -  " + listeVille.getVille().getNomCommune());
				compteur ++;
			} 
		}
		System.out.print("\n");
	}

}

package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheRegionPlusPeuplees extends MenuService {

	public RechercheRegionPlusPeuplees() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(List<Recensement> listeVilleDeBase, Scanner scanner) {
		// Trie sur les régions
		Collections.sort(listeVilleDeBase, new ComparatorRegion());
		
		// Initialisation des variables
		int popTotalRegion = 0;
		int compteur = 1;
		String nomRegionActuelle = listeVilleDeBase.get(0).getVille().getNomRegion();
		
		// Initialisation d'une List
		List<Region> sortByValue = new ArrayList<>();
		
		// Parcourir la liste des villes pour attribuer ceux qu'on a besoin dans une List
		for (Recensement listeVille : listeVilleDeBase) {
			if (listeVille.getVille().getNomRegion().equals(nomRegionActuelle)) {
				popTotalRegion += listeVille.getVille().getPopulationTotale();
			} else {
				sortByValue.add(new Region(nomRegionActuelle, popTotalRegion));
				nomRegionActuelle = listeVille.getVille().getNomRegion();
				popTotalRegion = 0;
			}
		}
		
		// Trie par Valeur
		Collections.sort(sortByValue);
		
		// Affichage des 10 premiers
		System.out.println("\nLes 10 régions les plus peuplés : ");
		for(Region r1 : sortByValue) {
			if(compteur <= 10) {
				System.out.println("  " + compteur + " -  Nom de région : " + r1.getNomRegion() + " | Population : " + r1.getPopulationTotal());
				compteur ++;
			}
		}
		System.out.print("\n");
	}

}

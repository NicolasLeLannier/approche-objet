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
		Collections.sort(listeVilleDeBase, new ComparatorPopulation());
		
		int compteur = 1;
		
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

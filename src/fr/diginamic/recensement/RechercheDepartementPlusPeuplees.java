package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheDepartementPlusPeuplees extends MenuService {

	public RechercheDepartementPlusPeuplees() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(List<Recensement> listeVilleDeBase, Scanner scanner) {
		// Trie sur les départements
		Collections.sort(listeVilleDeBase, new ComparatorDepartement());

		// Initialisation des variables
		int popTotalDepartement = 0;
		int compteur = 1;
		String codeDepartementActuelle = listeVilleDeBase.get(0).getVille().getCodeDepartement();

		// Initialisation d'une List
		List<Departement> sortByValue = new ArrayList<>();

		// Parcourir la liste des villes pour attribuer ceux qu'on a besoin dans une List
		for (Recensement listeVille : listeVilleDeBase) {
			if (listeVille.getVille().getCodeDepartement().equals(codeDepartementActuelle)) {
				popTotalDepartement += listeVille.getVille().getPopulationTotale();
			} else {
				sortByValue.add(new Departement(codeDepartementActuelle, popTotalDepartement));
				codeDepartementActuelle = listeVille.getVille().getCodeDepartement();
				popTotalDepartement = 0;
			}
		}

		// Trie par Valeur
		Collections.sort(sortByValue);

		// Affichage des 10 premiers
		System.out.println("\nLes 10 départements les plus peuplés : ");
		for (Departement d1 : sortByValue) {
			if (compteur <= 10) {
				System.out.println("  " + compteur + " -  Numéro de département : " + d1.getNomDepartement() + " | Population : " + d1.getPopulationTotal());
				compteur++;
			}
		}
		System.out.print("\n");
	}

}

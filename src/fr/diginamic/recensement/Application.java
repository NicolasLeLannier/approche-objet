package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.Ville;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int enlevePremierLigne = 0;
		String nombre = "";
		
		// Chemin du fichier
		Path pathFichierDeBase = Paths.get("C:/temp/TP 16 Manipulation de fichier/tp 16 - recensement population 2016.csv");
		
		// Initialisations des listes
		List<String> lectureFichier = Files.readAllLines(pathFichierDeBase);
		List<Recensement> listeVilleDeBase = new ArrayList<>();
		
		// Ajout des données que l'on veux dans la liste listeVilleDeBase d'après la classe Recensement 
		for(String afficherFichier : lectureFichier) {
			String[] tokens = afficherFichier.split(";");
			if(enlevePremierLigne != 0) {
				tokens[9] = tokens[9].replaceAll("\\s", "");
				listeVilleDeBase.add(new Recensement(new Ville(Integer.parseInt(tokens[0]),tokens[1], tokens[2], Integer.parseInt(tokens[5]), tokens[6], Integer.parseInt(tokens[9]))));
			} else {
				enlevePremierLigne ++;
			}
		}
		
//		for(Recensement afficher : listeVilleDeBase) {
//			System.out.println(afficher);
//		}
		
		do {
			Scanner scanner = new Scanner(System.in);
			
			// Affichage du menu
			System.out.println("1. Population d'une ville donnée");
			System.out.println("2. Population d'un département donné");
			System.out.println("3. Population d'une région donnée");
			System.out.println("4. Afficher les 10 régions les plus peuplées");
			System.out.println("5. Afficher les 10 départements les plus peuplés");
			System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
			System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
			System.out.println("8. Afficher les 10 villes les plus peuplées de France");
			System.out.println("9. Sortir");
			
			nombre = scanner.nextLine();
			
			
			// Switch case pour rediriger le programme vers la bonne méthode avec le default qui vérifie si le nombre saisie est bien dans le menu
			switch (nombre) {
			case "1": 
				RecherchePopulationVille recherchePopulationVille = new RecherchePopulationVille();
				recherchePopulationVille.traiter(listeVilleDeBase, scanner);
				break;
			case "2": 
				RecherchePopulationDepartement recherchePopulationDepartement = new RecherchePopulationDepartement();
				recherchePopulationDepartement.traiter(listeVilleDeBase, scanner);
				break;
			case "3": 
				RecherchePopulationRegion recherchePopulationRegion = new RecherchePopulationRegion();
				recherchePopulationRegion.traiter(listeVilleDeBase, scanner);
				break;
			case "4": 
				RechercheRegionPlusPeuplees rechercheRegionPlusPeuplees = new RechercheRegionPlusPeuplees();
				rechercheRegionPlusPeuplees.traiter(listeVilleDeBase, scanner);
				break;
			case "5": 
				RechercheDepartementPlusPeuplees RechercheDepartementPlusPeuplees = new RechercheDepartementPlusPeuplees();
				RechercheDepartementPlusPeuplees.traiter(listeVilleDeBase, scanner);
				break;
			case "6": 
				RechercheVillesPlusPeupleesDepartement rechercheVillesPlusPeupleesDepartement = new RechercheVillesPlusPeupleesDepartement();
				rechercheVillesPlusPeupleesDepartement.traiter(listeVilleDeBase, scanner);
				break;
			case "7": 
				RechercheVillesPlusPeupleesRegion rechercheVillesPlusPeupleesRegion = new RechercheVillesPlusPeupleesRegion();
				rechercheVillesPlusPeupleesRegion.traiter(listeVilleDeBase, scanner);
				break;
			case "8": 
				RechercheVillesPlusPeupleesFrance rechercheVillesPlusPeupleesFrance = new RechercheVillesPlusPeupleesFrance();
				rechercheVillesPlusPeupleesFrance.traiter(listeVilleDeBase, scanner);
				break;
			case "9": 
				System.out.println("Au revoir !");
				break;
			default:
				System.out.println("Veuillez rentrer un chiffre entre 1 et 9 !");
			}
			
		} while(nombre != "9");
	}

}













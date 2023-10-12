package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int enlevePremierLigne = 0;
		
		List<Ville> listeVille = new ArrayList<>();
		Path pathFichierLire = Paths.get("C:/temp/recensement.csv");
		List<String> listFichier = Files.readAllLines(pathFichierLire);
		List<String> fichierFinal = new ArrayList<>();
		
		for(String afficherFichier : listFichier) {
			String[] tokens = afficherFichier.split(";");
//			System.out.println(afficherFichier);
			
//			tokens[0] => departement
//			tokens[1] => nomRegion
//			tokens[6] => nomVille
//			tokens[9] => populationTotal
			if(enlevePremierLigne != 0) {
				tokens[9] = tokens[9].replaceAll("\\s", "");
				listeVille.add(new Ville(tokens[6],tokens[0], tokens[1], Integer.parseInt(tokens[9])));
			} else {
				enlevePremierLigne ++;
			}
		}
		
		
		// Insertion de la 1er ligne
		fichierFinal.add("Nom;Code département;Nom de la région;Population totale");
		
		// Insertion de toute les données ayant une population > 25 000
		for(Ville ville : listeVille) {
			if(ville.getPopulationTotal() > 25000) {
				fichierFinal.add(ville.getNomVille() + ";" + ville.getDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopulationTotal());
				System.out.println(ville);
			}
		}
		
		Path pathGenDestination = Paths.get("C:/temp/recensementFinal.csv");		
		Files.write(pathGenDestination, fichierFinal);
	}

}

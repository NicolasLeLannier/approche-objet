package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int compteur = 0;
		
		List<Ville> listeVille = new ArrayList<>();
		Path pathFichierLire = Paths.get("C:/temp/recensement.csv");
		List<String> listFichier = Files.readAllLines(pathFichierLire);
		
		for(String afficherFichier : listFichier) {
			String[] tokens = afficherFichier.split(";");
//			System.out.println(afficherFichier);
//			tokens[0] => departement
//			tokens[1] => nomRegion
//			tokens[6] => nomVille
//			tokens[9] => populationTotal
			if(compteur != 0) {
				tokens[9] = tokens[9].replaceAll("\\s", "");
				listeVille.add(new Ville(tokens[6],Integer.parseInt(tokens[0]), tokens[1], Integer.parseInt(tokens[9])));
			} else {
				compteur ++;
			}
		}
		
		for(Ville ville : listeVille) {
			System.out.println(ville);
		}
	}

}

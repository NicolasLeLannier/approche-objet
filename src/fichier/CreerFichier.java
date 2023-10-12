package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int compteur = 0;
		List<String> liste100Premier = new ArrayList<>();
		
		Path pathFichierLire = Paths.get("C:/temp/recensement.csv");
		List<String> listFichier = Files.readAllLines(pathFichierLire);
		
		for(String afficherFichier : listFichier) {
			if(compteur < 100) {
				System.out.println(afficherFichier);
				compteur ++;
				liste100Premier.add(afficherFichier);
			}
		}
		
		Path pathGenDestination = Paths.get("C:/temp/recensementPremier.csv");
		List<String> listeOut = new ArrayList<>();
		listeOut.addAll(liste100Premier);
		
		System.out.println("\n----------------------------\n");
		for(String afficherFichier : listeOut) {
			System.out.println(afficherFichier);
		}
		
		Files.write(pathGenDestination, listeOut, StandardOpenOption.APPEND);
	}

}

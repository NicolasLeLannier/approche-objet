package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		Path pathFichierLire = Paths.get("C:/temp/recensement.csv");
		List<String> listFichier = Files.readAllLines(pathFichierLire);
		
		for(String afficherFichier : listFichier) {
			System.out.println(afficherFichier);
		}
	}

}

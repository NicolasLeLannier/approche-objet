package nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class EssaiNio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Attention le fichier n'existe pas nécessairement
		Path path = Paths.get("C:/temp/recensement.csv");
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());

		boolean exist = Files.exists(path);
		boolean isFichier = Files.isRegularFile(path);
		boolean isDossier = Files.isDirectory(path);
		boolean isLisible = Files.isReadable(path);

		// Copier un fichier
		Path pathOrigine = Paths.get("C:/temp/recensement.csv");
		Path pathDestination = Paths.get("C:/temp/destination/recensement.csv");
		Files.copy(pathOrigine, pathDestination, StandardCopyOption.REPLACE_EXISTING);

		// Supprimer un fichier s'il existe
		Files.deleteIfExists(pathDestination);

		// Affiche le contenu d'un répertoire
		Path directory = Paths.get("C:/temp");
		DirectoryStream<Path> liste = Files.newDirectoryStream(directory);
		for (Path p : liste) {
			System.out.println(p);
		}


		// Générer un fichier
		Path pathGenDestination = Paths.get("C:/temp/recensement_out.csv");
		
		List<String> listeout = new ArrayList<>();
//		listeout.add("Tram");
//		listeout.add("De");
//		listeout.add("Tours");
		listeout.add("Fin");
		
		// StandardOpenOption.APPEND pour ajouter à la fin, ne rien mettre pour toute écraser
		Files.write(pathGenDestination, listeout, StandardOpenOption.APPEND);
		
		
		System.out.println("--------------");
		
		// Lire contenu d'un fichier
		Path pathOri = Paths.get("C:/temp/recensement_out.csv");
		List<String> listeFichier = Files.readAllLines(pathOri);
		for (String p : listeFichier) {
			System.out.println(p);
		}
	}

}

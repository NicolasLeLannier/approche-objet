package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tri.Ville;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Ville> tableauVille = new ArrayList<>();
		tableauVille.add(new Ville("Nice", 343000));
		tableauVille.add(new Ville("Carcassonne", 47800));
		tableauVille.add(new Ville("Narbonne", 53400));
		tableauVille.add(new Ville("Lyon", 484000));
		tableauVille.add(new Ville("Foix", 9700));
		tableauVille.add(new Ville("Pau", 77200));
		tableauVille.add(new Ville("Marseille", 850700));
		tableauVille.add(new Ville("Tarbes", 40600));

		Collections.sort(tableauVille, new ComparatorHabitant());

//		System.out.println(tableauVille);

		for (Ville afficher : tableauVille) {
			System.out.println(afficher);
		}

		System.out.println("-------------------");
		
		Collections.sort(tableauVille, new ComparatorNom());
		for (Ville afficher : tableauVille) {
			System.out.println(afficher);
		}
	}

}

package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int min = 999999999;
		String nomVillePlusPeuple = "";
		String nomVilleMoinsPeuple = "";
		
		ArrayList<Ville> tableauVille = new ArrayList<>();
		
		tableauVille.add(new Ville("Nice", 343000));
		tableauVille.add(new Ville("Carcassonne", 47800));
		tableauVille.add(new Ville("Narbonne", 53400));
		tableauVille.add(new Ville("Lyon", 484000));
		tableauVille.add(new Ville("Foix", 9700));
		tableauVille.add(new Ville("Pau", 77200));
		tableauVille.add(new Ville("Marseille", 850700));
		tableauVille.add(new Ville("Tarbes", 40600));
		
		for(Ville contenu : tableauVille) {
			if(contenu.nbHabitant > max) {
				max = contenu.nbHabitant;
				nomVillePlusPeuple = contenu.nom;
			}
		}
		
		System.out.println("Nom de la ville la plus peuplée : " + nomVillePlusPeuple);
		
		for(Ville contenu : tableauVille) {
			if(contenu.nbHabitant < min) {
				min = contenu.nbHabitant;
				nomVilleMoinsPeuple = contenu.nom;
			}
		}
		
		System.out.println("Nom de la ville la moins peuplée : " + nomVilleMoinsPeuple);
		
		for(int i = 0; i < tableauVille.size(); i++) {
			if(tableauVille.get(i).nbHabitant > 100000) {
//				tableauVille.set(i, tableauVille.get(i).nom.toUpperCase());
				tableauVille.get(i).nom = tableauVille.get(i).nom.toUpperCase();
			}
		}
		
		for(Ville contenu : tableauVille) {
			System.out.println(contenu.nom + " / " + contenu.nbHabitant);
		}
	}

}

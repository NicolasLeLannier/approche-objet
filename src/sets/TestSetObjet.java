package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetObjet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double maxPIB = 0;
		double maxPIBTotal = 0;
		double minPIBTotal = 323_000_000 * 70248.63;
		long nbHab = 0;
		double PIB = 0;
		String maxPaysPibParHabitant = "";
		String maxPaysPibTotal = "";
		String minPaysPibTotal = "";
		
		HashSet<Pays> listPays = new HashSet<>();
		listPays.add(new Pays("USA", 323_000_000, 70248.63));
		listPays.add(new Pays("France", 68_042_591, 43658.98));
		listPays.add(new Pays("Allemagne", 83_240_000, 51203.55));
		listPays.add(new Pays("UK", 66_022_000, 46510.28));
		listPays.add(new Pays("Italie", 58_980_000, 35657.50));
		listPays.add(new Pays("Japon", 125_700_000, 39312.66));
		listPays.add(new Pays("Chine", 1_300_000_000, 12556.33));
		listPays.add(new Pays("Russie", 146_000_000, 12194.78));
		listPays.add(new Pays("Inde", 1_428_600_000, 2256.59));
		
		for(Pays contenu : listPays) {
			if(contenu.PibParHabitant > maxPIB) {
				maxPIB = contenu.PibParHabitant;
				maxPaysPibParHabitant = contenu.nom;
			}
		}
		System.out.println(maxPaysPibParHabitant);
		
		for(Pays contenu : listPays) {
			if(contenu.PibParHabitant * contenu.nbHabitant > maxPIBTotal) {
				maxPIBTotal = contenu.PibParHabitant * contenu.nbHabitant;
				maxPaysPibTotal = contenu.nom;
			}
		}
		System.out.println(maxPaysPibTotal);
		
		for(Pays contenu : listPays) {
			if(contenu.PibParHabitant * contenu.nbHabitant < minPIBTotal) {
				minPIBTotal = contenu.PibParHabitant * contenu.nbHabitant;
				minPaysPibTotal = contenu.nom;
				nbHab = contenu.nbHabitant;
				PIB = contenu.PibParHabitant;
			}
		}
		listPays.remove(new Pays(minPaysPibTotal, nbHab, PIB));
		listPays.add(new Pays(minPaysPibTotal.toUpperCase(), nbHab, PIB));
		
		for(Pays contenu : listPays) {
			System.out.println(contenu.nom);
		}
		
		listPays.remove(new Pays(minPaysPibTotal, nbHab, PIB));
		
		System.out.println("------------------");
		
		for(Pays contenu : listPays) {
			System.out.println("Nom : " + contenu.nom + " | Nombre Habitants : " + contenu.nbHabitant + " | PIB total : " + contenu.nbHabitant * contenu.PibParHabitant);
		}
	}

}

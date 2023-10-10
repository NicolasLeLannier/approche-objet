package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salarie salarie = new Salarie("PAPO", "Marc", 2000);
		Pigiste pigiste = new Pigiste("TERA", "Cid", 15, 100);
		
		System.out.println("Salaire du salarié : " + salarie.getSalaire());
		System.out.println("Salaire du pigiste : " + pigiste.getSalaire());
		
		System.out.println("\n");
		System.out.println(salarie.afficherDonnees());
		System.out.println("\n");
		System.out.println(pigiste.afficherDonnees());
	}

}

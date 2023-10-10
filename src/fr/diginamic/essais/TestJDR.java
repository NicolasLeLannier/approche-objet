package fr.diginamic.essais;

import java.util.Scanner;

import fr.diginamic.jdr.Combat;
import fr.diginamic.jdr.Gobelin;
import fr.diginamic.jdr.Loup;
import fr.diginamic.jdr.Personnage;
import fr.diginamic.jdr.Troll;

public class TestJDR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personnage perso = new Personnage();
		
		do {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Quelle type de créture souhaitez-vous combattre ? Loup, Gobelin ou Troll ?");
			String monstreCombattre = scanner.next();
			
//			switch(monstreCombattre) {
//			case "Loup":
//				Loup creature = new Loup();
//			case "Gobelin":
//				Gobelin creature = new Gobelin();
//			case "Troll":
//				Troll creature = new Troll();
//			default:
//				System.out.println("Veuillez renseigner une bonne réponse.");
//			}
//			
//			if(monstreCombattre == "Loup") {
//				Loup creature = new Loup();
//			} else if(monstreCombattre == "Gobelin") {
//				Gobelin creature = new Gobelin();
//			} else if(monstreCombattre == "Troll") {
//				Troll creature = new Troll();
//			} else {
//				System.out.println("Veuillez renseigner une bonne réponse.");
//			}
			
//			Loup loup1 = new Loup();
//			Gobelin gobelin1 = new Gobelin();
//			Troll troLL1 = new Troll();
			
			Troll creature = new Troll();
			Combat combat = new Combat();
			
			
			System.out.println("----------- Stats Personnage -----------");
			System.out.println(perso.getForce());
			System.out.println(perso.getPv());
			System.out.println(perso.getScore());
			
			System.out.println("\n----------- Stats Créature -----------");
			System.out.println(creature.getForce());
			System.out.println(creature.getPv());
			
			
			System.out.println("\n----------- Combat -----------");
			combat.Combattre(perso, creature);
		} while(perso.getPv() > 0);
		
		
	}

}

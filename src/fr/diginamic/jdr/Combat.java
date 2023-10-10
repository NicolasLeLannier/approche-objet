package fr.diginamic.jdr;

public class Combat {

	public void Combattre(Personnage personnage, Creature creature) {
		do {

			int attaquePerso = personnage.force + (int) (Math.random() * (10 - 1)) + 1;
			int attaqueCreature = creature.force + (int) (Math.random() * (10 - 1)) + 1;

			if (attaquePerso > attaqueCreature) {
				creature.pv -= (attaquePerso - attaqueCreature);
				if(creature.pv > 0) {
					System.out.println("Vous attaquez de " + (attaquePerso - attaqueCreature) + ", il reste " + creature.pv + "PV pour vaincre la créature.");
				} else {
					System.out.println("Vous attaquez de " + (attaquePerso - attaqueCreature) + ", la créature n'a plus de point de vie.");
				}
			} else if (attaquePerso < attaqueCreature) {
				personnage.pv -= (attaqueCreature - attaquePerso);
				if(personnage.pv > 0) {
					System.out.println("La créature attaque de " + (attaqueCreature - attaquePerso) + ", il vous reste " + personnage.pv + "PV.");
				} else {
					System.out.println("La créature attaque de " + (attaqueCreature - attaquePerso) + ", vous n'avez plus de point de vie.");
				}
				
			} else {
				System.out.println("Vos attaques sont équivalentes, personne ne perd de point de vie.");
			}

		} while (creature.pv > 0 && personnage.pv > 0);

		if (personnage.pv <= 0) {
			System.out.println("Votre personnage est décédé. Il a obtenu le score de " + personnage.score
					+ " points. Veuillez créer un nouveau personnage.");
		} else {
			if(creature.getClass().getSimpleName() == Loup.class.getSimpleName()) {
				personnage.score ++;
			} else if(creature.getClass().getSimpleName() == Gobelin.class.getSimpleName()) {
				personnage.score += 2;
			} else {
				personnage.score += 5;
			}
			
			System.out.println("\nBravo, vous avez gagné le combat.\nIl vous reste encore " + personnage.pv + " PV.\nVous avez maintenant un score de " + personnage.score + ".");
		}
	}
}

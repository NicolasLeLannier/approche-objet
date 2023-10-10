package fr.diginamic.jdr;

public class Gobelin extends Creature {

	public Gobelin() {
		force = (int) (Math.random()*(10-5)) + 5;
		pv = (int) (Math.random()*(15-10)) + 10;
	}

}

/**
 * 
 */
package fr.diginamic.jdr;

/**
 * @author lelan
 *
 */
public class Troll extends Creature {

	public Troll() {	
		force = (int) (Math.random()*(15-10)) + 10;
		pv = (int) (Math.random()*(30-20)) + 20;
	}

}

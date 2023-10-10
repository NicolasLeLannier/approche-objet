/**
 * 
 */
package fr.diginamic.jdr;

/**
 * @author lelan
 *
 */
public class Loup extends Creature {

	public Loup() {
		force = (int) (Math.random()*(8-3)) + 3;
		pv = (int) (Math.random()*(10-5)) + 5;
	}

}

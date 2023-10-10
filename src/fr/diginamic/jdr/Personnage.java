package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {

	protected int force;
	protected int pv;
	protected int score = 0;
	
	
	/**
	 * @param force
	 * @param pv
	 */
	public Personnage() {
		this.force = (int) (Math.random()*(18-12)) + 12;
		this.pv = (int) (Math.random()*(50-20)) + 20;
	}
	
	
	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}
	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}


	/**
	 * @return the pv
	 */
	public int getPv() {
		return pv;
	}


	/**
	 * @param pv the pv to set
	 */
	public void setPv(int pv) {
		this.pv = pv;
	}


	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}


	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
}

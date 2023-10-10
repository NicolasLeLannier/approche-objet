package fr.diginamic.jdr;

public abstract class Creature {

	protected int force;
	protected int pv;
	
	public Creature() {}

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
	
	
}

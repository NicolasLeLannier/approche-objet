package sets;

public class Pays {

	protected String nom;
	protected long nbHabitant;
	protected double PibParHabitant;
	
	/**
	 * @param nom
	 * @param nbHabitant
	 * @param pIB
	 */
	public Pays(String nom, long nbHabitant, double PibParHabitant) {
//		this.nom = nom;
//		this.nbHabitant = nbHabitant;
//		this.PibParHabitant = PibParHabitant;
		setNom(nom);
		setNbHabitant(nbHabitant);
		setPibParHabitant(PibParHabitant);
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitant
	 */
	public long getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(long nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	/**
	 * @return the pIB
	 */
	public double getPibParHabitant() {
		return PibParHabitant;
	}

	/**
	 * @param pIB the pIB to set
	 */
	public void setPibParHabitant(double PibParHabitant) {
		this.PibParHabitant = PibParHabitant;
	}
	
}

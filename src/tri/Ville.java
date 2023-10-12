package tri;

public class Ville implements Comparable<Ville> {

	protected String nom;
	protected int nbHabitant;
	
	/**
	 * @param nom
	 * @param nbHabitant
	 */
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}


	@Override
	public int compareTo(Ville villeAutre) {
		// Trie sur le nom
//		return this.nom.compareTo(villeAutre.getNom());
		
		// Trie sur la population
		if(this.nbHabitant > villeAutre.getNbHabitant()) {
			return 1;
		} else if(this.nbHabitant < villeAutre.getNbHabitant()) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]";
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
	public int getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
}

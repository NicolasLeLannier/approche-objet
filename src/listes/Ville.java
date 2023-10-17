package listes;

import java.util.Objects;

public class Ville {

	protected String nom;
	protected int nbHabitant;

	/** Constructor
	 * @param nom
	 * @param nbHabitant
	 */
	public Ville(String nom, int nbHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
	}

	// Si 2 objets sont identiques alors leurs hashcode doit aussi être identique
	@Override
	public int hashCode() {
		return Objects.hash(nom, nbHabitant);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Ville other = (Ville) obj;
//		return Objects.equals(this.getNom(), other.getNom()) && this.getNbHabitant() == other.getNbHabitant();
//	}

	@Override
	public boolean equals(Object obj) {

		// Si obj n'est pas de type Ville retourne false
		if (!(obj instanceof Ville) || obj == null) {
			return false;
		}

		// Si ici c'est que type vaut Ville donc on cast car sinon message d'erreur disant
		// que Object ne peux pas être convertit en Ville
		Ville other = (Ville) obj;

		return Objects.equals(this.getNom(), other.getNom()) && this.getNbHabitant() == other.getNbHabitant();
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

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + "]";
	}
}

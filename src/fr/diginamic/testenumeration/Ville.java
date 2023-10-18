package fr.diginamic.testenumeration;

import java.util.Objects;

/**
 * @author lelan
 *
 */
public class Ville {

	/** nom */
	protected String nom;
	
	/** nbHabitant */
	protected int nbHabitant;
	protected Continent continent;

	/** Constructor
	 * @param nom
	 * @param nbHabitant
	 */
	public Ville(String nom, int nbHabitant, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitant=" + nbHabitant + ", continent=" + continent + "]";
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

	/** Getter
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
}

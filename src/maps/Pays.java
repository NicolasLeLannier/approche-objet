package maps;

// Ne compare que pour 1 type (soit int soit String) à la fois
//public class Pays implements Comparable<Pays> {
public class Pays {

	protected String nom;
	protected int nbHab;
	protected String continent;
	
	/**
	 * @param nom
	 * @param nbHab
	 * @param continent
	 */
	public Pays(String nom, int nbHab, String continent) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.continent = continent;
	}

	
//	public int compareTo(Pays autre) {
//		// Trie sur la population
//		if(this.nbHab > autre.getNbHab()) {
//			return 1;
//		} else if(this.nbHab < autre.getNbHab()) {
//			return -1;
//		}
//		return 0;
		
		// Fonctionne uniquement si on utilise des int
//		return this.nbHab - autre.getNbHab();
		
		
		// Trie sur le nom (String)
			// Décroissant
//		return -this.nom.compareTo(autre.getNom());
			// Croissant
//		return this.nom.compareTo(autre.getNom());
//	}
	
	
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHab=" + nbHab + ", continent=" + continent + "]";
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
	 * @return the nbHab
	 */
	public int getNbHab() {
		return nbHab;
	}

	/**
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}

	/**
	 * @param continent the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	
}

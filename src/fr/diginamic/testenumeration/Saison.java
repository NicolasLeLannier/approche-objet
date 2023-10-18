package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps"),
	ETE("Ete"),
	AUTOMNE("Automne"),
	HIVER("Hiver");

	private String libelle;
	private int numOrdre;
	
	/** Constructor
	 * @param libellé
	 * @param numOrdre
	 */
	private Saison(String libelle) {
		this.libelle = libelle;
		this.numOrdre = this.numOrdre + 1;
	}

	@Override
	public String toString() {
		return getLibelle();
	}
	
	public static Saison getSaisonByLibelle(String libelle) {
		for (Saison s : values()) {
			if(s.getLibelle().equalsIgnoreCase(libelle)) {
				return s;
			}
		}
//		throw new IllegalArgumentException("La saison n'éxiste pas");
		return null;
	}

	/** Getter
	 * @return the libellé
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter
	 * @param libellé the libellé to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the numOrdre
	 */
	public int getNumOrdre() {
		return numOrdre;
	}

	/** Setter
	 * @param numOrdre the numOrdre to set
	 */
	public void setNumOrdre(int numOrdre) {
		this.numOrdre = numOrdre;
	}
}

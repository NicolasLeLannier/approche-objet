package fr.diginamic.testenumeration;

public enum Continent {

	EUROPE("Europe"),
	ASIE("Asie"),
	OCEANIE("Océanie"),
	AFRIQUE("Afrique"),
	AMERIQUE("Amérique");
	
	protected String libelle;

	/** Constructor
	 * @param libelle
	 */
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}

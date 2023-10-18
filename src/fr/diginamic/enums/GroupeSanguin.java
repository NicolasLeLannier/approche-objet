package fr.diginamic.enums;

public enum GroupeSanguin {

	APLUS("A+"),
	AMOINS("O-"),
	OPLUS("O+"),
	OMOINS("O-");

	private String libelle;

	/** Constructor
	 * @param nom
	 */
	private GroupeSanguin(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return this.libelle;
	}
	
	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

}

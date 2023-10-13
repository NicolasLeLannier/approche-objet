package fr.diginamic.recensement;

public class Recensement {

	protected Ville ville;
	
	public Recensement() {
	}

	/**
	 * @param ville
	 */
	public Recensement(Ville ville) {
		super();
		this.ville = ville;
	}
	
	@Override
	public String toString() {
		return "Recensement [ville=" + ville + "]";
	}

	/**
	 * @return the ville
	 */
	public Ville getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(Ville ville) {
		this.ville = ville;
	}

}

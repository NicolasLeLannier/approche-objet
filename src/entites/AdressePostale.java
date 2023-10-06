package entites;

public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostal;
	String ville;
	
	static int nbDepartement = 101;
	
	// Non modifiable grâce au final
	static final int NB_REGIONS = 18;
	
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = numeroRue;
		this.ville = ville;
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}

	/**
	 * @return the numeroRue
	 */
	public int getNumeroRue() {
		return numeroRue;
	}

	/**
	 * @param numeroRue the numeroRue to set
	 */
	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	/**
	 * @return the libelleRue
	 */
	public String getLibelleRue() {
		return libelleRue;
	}

	/**
	 * @param libelleRue the libelleRue to set
	 */
	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	/**
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
}

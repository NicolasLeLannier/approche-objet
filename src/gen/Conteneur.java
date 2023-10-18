package gen;

public class Conteneur<T extends Number> {

	private T identifiant;
	private String valeur;
	
	/** Constructor
	 * @param identifiant
	 * @param valeur
	 */
	public Conteneur(T identifiant, String valeur) {
		super();
		this.identifiant = identifiant;
		this.valeur = valeur;
	}

	/** Getter
	 * @return the identifiant
	 */
	public T getIdentifiant() {
		return identifiant;
	}

	/** Setter
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(T identifiant) {
		this.identifiant = identifiant;
	}

	/** Getter
	 * @return the valeur
	 */
	public String getValeur() {
		return valeur;
	}

	/** Setter
	 * @param valeur the valeur to set
	 */
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	
	
}

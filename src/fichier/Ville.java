package fichier;

public class Ville {

	protected String nomVille;
	protected String departement;
	protected String nomRegion;
	protected int populationTotal;
	
	/**
	 * @param nomVille
	 * @param departement
	 * @param nomRegion
	 * @param population
	 */
	public Ville(String nomVille, String departement, String nomRegion, int populationTotal) {
		super();
		this.nomVille = nomVille;
		this.departement = departement;
		this.nomRegion = nomRegion;
		this.populationTotal = populationTotal;
	}

	@Override
	public String toString() {
		return "Ville [nomVille=" + nomVille + ", departement=" + departement + ", nomRegion=" + nomRegion
				+ ", populationTotal=" + populationTotal + "]";
	}

	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * @param nomVille the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/**
	 * @return the departement
	 */
	public String getDepartement() {
		return departement;
	}

	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
	}

	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/**
	 * @return the population
	 */
	public int getPopulationTotal() {
		return populationTotal;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulationTotal(int populationTotal) {
		this.populationTotal = populationTotal;
	}
	
	
}

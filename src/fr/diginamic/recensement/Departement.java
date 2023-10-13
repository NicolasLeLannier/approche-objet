package fr.diginamic.recensement;

import java.util.Comparator;

public class Departement implements Comparable<Departement> {

	protected String nomDepartement;
	protected int populationTotal;
	
	/**
	 * @param nomRegion
	 * @param popTotalRegion
	 */
	public Departement(String nomDepartement, int popTotalRegion) {
		super();
		this.nomDepartement = nomDepartement;
		this.populationTotal = popTotalRegion;
	}
	
	@Override
	public int compareTo(Departement r) {
		if(this.getPopulationTotal() > r.getPopulationTotal()) {
			return -1;
		} else if(this.getPopulationTotal() < r.getPopulationTotal()) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Departement [codeDepartement=" + nomDepartement + ", populationTotal=" + populationTotal + "]";
	}

	/**
	 * @return the nomRegion
	 */
	public String getNomDepartement() {
		return nomDepartement;
	}
	/**
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
	/**
	 * @return the populationTotal
	 */
	public int getPopulationTotal() {
		return populationTotal;
	}
	/**
	 * @param populationTotal the populationTotal to set
	 */
	public void setPopulationTotal(int populationTotal) {
		this.populationTotal = populationTotal;
	}
	
	
}

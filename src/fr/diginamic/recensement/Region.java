package fr.diginamic.recensement;

import java.util.Comparator;

public class Region implements Comparable<Region> {

	protected String nomRegion;
	protected int populationTotal;
	
	/**
	 * @param nomRegion
	 * @param popTotalRegion
	 */
	public Region(String nomRegion, int popTotalRegion) {
		super();
		this.nomRegion = nomRegion;
		this.populationTotal = popTotalRegion;
	}
	
	@Override
	public int compareTo(Region r) {
		if(this.getPopulationTotal() > r.getPopulationTotal()) {
			return -1;
		} else if(this.getPopulationTotal() < r.getPopulationTotal()) {
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Region [nomRegion=" + nomRegion + ", populationTotal=" + populationTotal + "]";
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

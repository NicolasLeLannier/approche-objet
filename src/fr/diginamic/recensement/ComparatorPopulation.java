package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorPopulation implements Comparator<Recensement> {

	public ComparatorPopulation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Recensement v1, Recensement v2) {
		if(v1.getVille().getPopulationTotale() > v2.getVille().getPopulationTotale()) {
			return -1;
		} else if(v1.getVille().getPopulationTotale() < v2.getVille().getPopulationTotale()) {
			return 1;
		}
		return 0;
	}

}

package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorDepartement implements Comparator<Recensement> {

	public ComparatorDepartement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Recensement v1, Recensement v2) {
		return v1.getVille().getCodeDepartement().compareTo(v2.getVille().getCodeDepartement());
	}
}

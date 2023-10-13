package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorRegion implements Comparator<Recensement> {

	public ComparatorRegion() {
		// TODO Auto-generated constructor stub
	}

	// Trie sur les régions
	@Override
	public int compare(Recensement v1, Recensement v2) {
		return v1.getVille().getNomRegion().compareTo(v2.getVille().getNomRegion());
	}

}

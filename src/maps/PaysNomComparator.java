package maps;

import java.util.Comparator;

public class PaysNomComparator implements Comparator<Pays> {

	@Override
	public int compare(Pays p1, Pays p2) {
		return -p1.getNom().compareTo(p2.getNom());
	}

}

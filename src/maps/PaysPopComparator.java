package maps;

import java.util.Comparator;

public class PaysPopComparator implements Comparator<Pays> {

	@Override
	public int compare(Pays p1, Pays p2) {
		if(p1.getNbHab() > p2.getNbHab()) {
			return 1;
		} else if(p1.getNbHab() < p2.getNbHab()) {
			return -1;
		}
		return 0;
	}

}

package maps;

import java.util.Comparator;

public class PaysComparator implements Comparator<Pays> {
	
	private int critere = 0;

	
	
	/**
	 * @param critere
	 */
	public PaysComparator(int critere) {
		super();
		this.critere = critere;
	}



	@Override
	public int compare(Pays p1, Pays p2) {
		if(critere == 1) {
			if(p1.getNbHab() > p2.getNbHab()) {
				return 1;
			} else if(p1.getNbHab() < p2.getNbHab()) {
				return -1;
			}
		}
		return -p1.getNom().compareTo(p2.getNom());
	}

}

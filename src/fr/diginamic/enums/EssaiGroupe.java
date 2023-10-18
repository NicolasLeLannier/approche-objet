package fr.diginamic.enums;

public class EssaiGroupe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GroupeSanguin gs = GroupeSanguin.AMOINS;
		
		Personne p = new Personne("Dupont", "Alebert", gs);
		
		GroupeSanguin[] listeGS = GroupeSanguin.values();
		
		for(GroupeSanguin g : listeGS) {
			System.out.println(g);
		}
		
		GroupeSanguin gs3 = GroupeSanguin.valueOf("AMOINS");
		System.out.println(gs3);
	}

}

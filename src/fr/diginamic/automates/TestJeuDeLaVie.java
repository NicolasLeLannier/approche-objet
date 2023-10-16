package fr.diginamic.automates;

public class TestJeuDeLaVie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JeuDeLaVie jeu = new JeuDeLaVie();

		for(int i = 0; i < 10; i++) {
			System.out.println(jeu.AfficherJeu());
			jeu.generationSuivante();
		}
		
//		jeu.AfficherJeu();
	}

}

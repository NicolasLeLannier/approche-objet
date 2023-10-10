package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Theatre theatre = new Theatre("Théatre de la Fleur", 100, 60, 2700);
		
		theatre.inscrire(5, 45);
		theatre.inscrire(15, 45);
		theatre.inscrire(16, 45);
		theatre.inscrire(5, 45);
		
		theatre.inscrire(3, 45);
		theatre.inscrire(2, 45);
		
		theatre.inscrire(1, 45);
		theatre.inscrire(3, 45);
		
		
		System.out.println("Total de client inscrit : " + theatre.getTotalClientInscrit());
		System.out.println("Recette total : " + theatre.getRecetteTotalEtablissement());
	}

}

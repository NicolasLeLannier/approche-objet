package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Ville> listeVilles = new ArrayList<>();
		listeVilles.add(new Ville("New York", 360000, Continent.AMERIQUE));
		listeVilles.add(new Ville("Paris", 360000, Continent.EUROPE));
		listeVilles.add(new Ville("Pékin", 360000, Continent.ASIE));
		listeVilles.add(new Ville("Moscou", 360000, Continent.EUROPE));
		listeVilles.add(new Ville("Berlin", 360000, Continent.EUROPE));
		listeVilles.add(new Ville("Sydney", 360000, Continent.OCEANIE));
		listeVilles.add(new Ville("Sao Paulo", 360000, Continent.AMERIQUE));
		listeVilles.add(new Ville("Dakar", 360000, Continent.AFRIQUE));
		
		for(Ville v : listeVilles) {
			System.out.println(v.getNom() + " => " + v.getContinent());
		}
	}

}

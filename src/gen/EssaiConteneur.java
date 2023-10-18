package gen;

public class EssaiConteneur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conteneur<Integer> c1 = new Conteneur<Integer>(12, "Coucou");
		Conteneur<Double> c2 = new Conteneur<Double>(14.5, "Coucou");
		
		c1.setIdentifiant(25);
		c2.setIdentifiant(10.9);
	}

}

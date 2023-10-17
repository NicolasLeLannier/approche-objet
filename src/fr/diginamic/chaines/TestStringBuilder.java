package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder builder = new StringBuilder();
		
		long debut = System.currentTimeMillis();
		
		for(int i = 1; i <= 100000; i++) {
			builder.append(i).append(", ");
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes pour append : " + (fin - debut));
		
		
		String conca = "";
		
		long debut2 = System.currentTimeMillis();
		
		for(int i = 1; i <= 100000; i++) {
			conca += i;
		}
		
		long fin2 = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes pour la concaténation : " + (fin2 - debut2));
	}

}

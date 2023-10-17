package stringpool;

import java.util.Locale;

import tri.Ville;

public class DemoStringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = new String("Bonjour");
		String b = new String("Bonjour");
		
		if(a == b) {
			System.out.println("Vous êtes identiques");
		} else {
			System.out.println("Vous êtes différents");
		}
		
		
		Integer c = 548;
		Integer d = 548;
		
		if(c == d) {
			System.out.println("Vous êtes identiques");
		} else {
			System.out.println("Vous êtes différents");
		}
		
		
		String s = "       Hello  w ";
		s = s.concat("World");
		s = s.trim();
		System.out.println(s);
		
		// %s => Chaine
		// %d => int
		// %f => float	(%.1f => 1 chiffre après la virgule)
		// %n => Retour à la ligne
		String f = String.format(Locale.FRANCE, "Je m'appelle %s et j'ai %.2f € en poches", "Robert", 2.5);
		System.out.println(f);
		
		
		StringBuilder builder = new StringBuilder("Bonjour ");
		builder.append("tout le monde ").append(28).append(" ").append(false).append(new Ville("Tours", 250000));
		
		String ch = builder.toString();
		System.out.println(ch);
	}

}

package listes;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville v1 = new Ville("Tours", 123000);
		Ville v2 = new Ville("Tours", 123000);
		Ville v3 = new Ville(null, 123000);
		
//		System.out.println(v1.hashCode());
//		System.out.println(v2.hashCode());
		
		if(v1.equals(v2)) {
			System.out.println("Identique");
		} else {
			System.out.println("Différent");
		}
	}

}

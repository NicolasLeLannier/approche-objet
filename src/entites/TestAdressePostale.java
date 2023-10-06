package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adr1 = new AdressePostale(37390, "Nana", 6, "Tours");
		AdressePostale adr2 = new AdressePostale(89390, "Jazejl", 4, "Orléans");
		
//		adr1.codePostal = 37390;
//		adr1.libelleRue = "Nana";
//		adr1.numeroRue = 6;
//		adr1.ville = "Tours";
//		
//		adr2.codePostal = 89390;
//		adr2.libelleRue = "Jazejl";
//		adr2.numeroRue = 4;
//		adr2.ville = "Orléans";
		
		System.out.println(adr1.ville);
	}

}

package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adr1 = new AdressePostale();
		AdressePostale adr2 = new AdressePostale();
		
		adr1.codePostal = 37390;
		adr1.libelleRue = "Nana";
		adr1.numeroRue = 6;
		adr1.ville = "Tours";
		
		adr2.codePostal = 89390;
		adr2.libelleRue = "Jazejl";
		adr2.numeroRue = 4;
		adr2.ville = "Orléans";
	}

}

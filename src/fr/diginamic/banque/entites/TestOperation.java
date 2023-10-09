package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sommeCompte = 0;

		Operation[] op1 = {new Credit("08/10/2023", 120), new Debit("09/10/2023", 45), new Credit("09/10/2023", 345), new Debit("10/10/2023", 200)};
		
		for(int i = 0; i < op1.length; i++) {
			System.out.println(op1[i].toString());
			System.out.println(op1[i].getType());
			
			if(op1[i].getType() == "CREDIT") {
				sommeCompte += op1[i].montant;
			} else {
				sommeCompte -= op1[i].montant;
			}
		}
		
		System.out.println(sommeCompte);
	}

}

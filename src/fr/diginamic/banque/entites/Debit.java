package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOperation, int montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "DEBIT";
	}
}

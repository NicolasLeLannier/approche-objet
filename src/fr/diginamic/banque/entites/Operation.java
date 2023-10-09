package fr.diginamic.banque.entites;

public abstract class Operation {

	protected String dateOperation;
	protected int montant;
	
	/**
	 * @param dateOperation
	 * @param montant
	 */
	public Operation(String dateOperation, int montant) {
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Operation [type=" + getType() + ", dateOperation=" + dateOperation + ", montant=" + montant + "]";
	}
	
	public abstract String getType();

	/**
	 * @return the dateOperation
	 */
	public String getDateOperation() {
		return dateOperation;
	}

	/**
	 * @param dateOperation the dateOperation to set
	 */
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	/**
	 * @return the montant
	 */
	public int getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(int montant) {
		this.montant = montant;
	}
	
	
}

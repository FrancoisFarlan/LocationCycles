package fr.eni.ecole.locationsCycles;

import java.time.LocalDate;

public abstract class Cycle {

	protected String marque;
	protected String modele;
	private LocalDate dateAchat;
	protected double tarif;
	
	/**
	 * @param marque
	 * @param modele
	 * @param dateAchat
	 * @param tarif
	 */
	public Cycle(String marque, String modele, LocalDate dateAchat) {
		this.marque = marque;
		this.modele = modele;
		this.dateAchat = dateAchat;
	} 
	
	public int age() {
		return dateAchat.until(LocalDate.now()).getYears();
	}
	
	@Override
	public String toString() {
		int age = this.age();
		return String.format("%s %s %s (%dan%s)", this.getClass().getSimpleName(), this.marque, this.modele, age, age > 1 ? "s" : "");
	}
	protected abstract double getTarif(); 
	
	
}

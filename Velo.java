package fr.eni.ecole.locationsCycles;

import java.time.LocalDate;

public class Velo extends Cycle{

	private int vitesses;

	/**
	 * @param marque
	 * @param modele
	 * @param dateAchat
	 * @param tarif
	 * @param vitesses 
	 */
	public Velo(String marque, String modele, LocalDate dateAchat, int vitesses) {
		super(marque, modele, dateAchat);
		this.vitesses = vitesses; 
	}

	@Override
	protected double getTarif() {
		return 4.9;
	}
	
	@Override 
	public String toString() {
		return String.format("%s %d vitesse%s", super.toString(), this.vitesses, vitesses > 1 ? "s" : "");
	}
}

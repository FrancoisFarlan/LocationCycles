package fr.eni.ecole.locationsCycles;

import java.time.LocalDate;

public class Gyropode extends CycleAMoteur{
	
	private int tailleMin;

	/**
	 * @param marque
	 * @param modele
	 * @param dateAchat
	 * @param tarif
	 * @param autonomie
	 */
	public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomie, int tailleMin) {
		super(marque, modele, dateAchat, autonomie);
		this.tailleMin = tailleMin;
	}

	@Override
	protected double getTarif() {
		return 29.9;
	}
	
	@Override
	public String toString() {
		return String.format("%s [%dm%d min]", super.toString(), this.tailleMin/100, this.tailleMin%100 ); 
	}
}

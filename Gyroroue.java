package fr.eni.ecole.locationsCycles;

import java.time.LocalDate;

public class Gyroroue extends CycleAMoteur{

	/**
	 * @param marque
	 * @param modele
	 * @param dateAchat
	
	 * @param autonomie
	 */
	public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat, autonomie);
	}

	@Override
	protected double getTarif() {
		return 18.9;
	}

	
	
	
}

package fr.eni.ecole.locationsCycles;

import java.time.LocalDate;

public abstract class CycleAMoteur extends Cycle{

	protected int autonomie;
	
	public CycleAMoteur(String marque, String modele, LocalDate dateAchat, int autonomie) {
		super(marque, modele, dateAchat);
		this.autonomie = autonomie; 
	}

	public String toString() {
		return String.format("%s %d km d'autonomie", super.toString(), this.autonomie);
	}
}

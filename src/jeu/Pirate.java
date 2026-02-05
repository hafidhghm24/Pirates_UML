package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class Pirate {
	private String nom;
	private int nbCoeur;

	private int nbCases;
	private Des des = new Des();
	
	
	public Pirate(String nom, int nbCoeur) {
		this.nom = nom;
		this.nbCoeur = nbCoeur;
	}
	
	public int deplacer() {
		
		des.lancerDes();
		
		nbCases += des.getValeur();
		System.out.println("je me deplace a la case " + nbCases);
		
		
		
		return nbCases;
	}
}

package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class Pirate {
	private String nom;
	private int nbCoeur;
	private int nbCases;
	private Des des = new Des();
	private int val;
	private int dif;
	
	private boolean victoire;
	
	public Pirate(String nom, int nbCoeur) {
		this.nom = nom;
		this.nbCoeur = nbCoeur;
	}
	
	public int deplacer() {
		
		des.lancerDes(nom);
		
		
		val = des.getValeur();
		
		nbCases += val;
		System.out.println("je me deplace a la case " + nbCases);
		
		if(nbCases == 30) {
			System.out.println(nom + "A Gagné !");
			victoire = true;
		}
		else if(nbCases > 30) {
			dif = nbCases - 30;
			nbCases -= dif;
		}
		
		
		return nbCases;
	}
	
	public boolean getVictoire() {
		
		return victoire;
	}
}

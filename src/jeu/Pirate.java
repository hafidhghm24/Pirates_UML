package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class Pirate {
	private String nom;
	private int nbCoeur;
	private Couleur couleur;
	private int nbCases;
	private Des des;
	private int val;
	private int dif;
	private boolean victoire;
	private Affichage journal;
	
	public Pirate(String nom, int nbCoeur, Couleur couleur, Affichage journal) {
		this.nom = nom;
		this.nbCoeur = nbCoeur;
		this.journal = journal;
		des = new Des(journal);
	}
	
	public int deplacer() {
		
		des.lancerDes(nom);
		
		
		val = des.getValeur();
		
		nbCases += val;
		journal.afficheDeplacement(nbCases);
		
		if(nbCases == 30) {
			journal.afficheVictoire(nom);
			victoire = true;
		}
		else if(nbCases > 30) {
			dif = nbCases - 30;
			nbCases -= dif;
			victoire = false;
		}
		
		
		return nbCases;
	}
	
	public boolean getVictoire() {
		
		return victoire;
	}
}

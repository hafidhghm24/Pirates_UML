package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class Pirate {
	private String nom;
	private int nbCoeur;
	private int nbCases;
	private Des des;
	
	
	public Pirate(String nom, int nbCoeur) {
		this.nom = nom;
		this.nbCoeur = nbCoeur;
		
	}
	
	public int Deplacer() {
		System.out.println("on lance le Dés ... \n");
		des.lancerDes();
		System.out.println("la valeur du Dés est : " + des.getValeur());
		
		
		return nbCases;
	}
}

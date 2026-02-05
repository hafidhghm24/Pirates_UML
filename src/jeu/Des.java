package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class Des {
	private int valeur;
	private Random random;
	
	public Des() {
		
		try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	public void lancerDes() {
		System.out.println("on lance le Dés ...");
		valeur = random.nextInt(0,12);
		System.out.println("la valeur du Dés est : " + valeur);
	}
	
	public int getValeur() {
		return valeur;
	}
}

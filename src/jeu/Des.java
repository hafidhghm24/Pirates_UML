package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class Des {
	private int valeur;
	private Random random;
	
	public void Des() {
		try {
            random = SecureRandom.getInstanceStrong();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	public void lancerDes() {
		valeur = random.nextInt(0,12);
	}
	
	public int getValeur() {
		return valeur;
	}
}

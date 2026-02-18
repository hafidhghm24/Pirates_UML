package test_jeu;

import jeu.*;

public class Jeu {

	private int nbCoeurs = 10;
	private Pirate joueur1;
	private Pirate joueur2;

	public Jeu(Affichage journalPirate, String nom1, String nom2) {

		joueur1 = new Pirate(nom1, nbCoeurs, Couleur.ROUGE,  journalPirate);
		joueur2 = new Pirate(nom2, nbCoeurs, Couleur.BLEU,  journalPirate);

		boolean victoire1 = joueur1.getVictoire();
		boolean victoire2 = joueur2.getVictoire();
		
		boolean mort1 = joueur1.estMort();
		boolean mort2 = joueur2.estMort();

		jouer(victoire1, victoire2);
	}

	protected void jouer(boolean victoire1, boolean victoire2) {
		while (!joueur1.getVictoire() && !joueur2.getVictoire() && !joueur1.estMort() && !joueur2.estMort()) {

            joueur1.deplacer(joueur2);

            if (!joueur1.getVictoire() && !joueur2.estMort()) {
                joueur2.deplacer(joueur1);
            }
		}
	}

}

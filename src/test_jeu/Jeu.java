package test_jeu;


import jeu.*;

public class Jeu {

	private int nbCoeurs = 5;
	private Pirate joueur1;
	private Pirate joueur2;
	private Affichage journal;

	public Jeu(Affichage journalPirate, String nom1, String nom2) {
		this.journal = journalPirate;
		
		Plateau plateau1 = new Plateau();
		Plateau plateau2 = new Plateau();
		
		joueur1 = new Pirate(nom1, nbCoeurs, Couleur.ROUGE,  journal, plateau1);
		joueur2 = new Pirate(nom2, nbCoeurs, Couleur.BLEU,  journal, plateau2);
		
		journal.affichePirate(joueur1.getNom(), joueur1.getCouleur());
		journal.affichePirate(joueur2.getNom(), joueur2.getCouleur());
		
		
		jouer();
	}

	protected void jouer() {
		
		while (!joueur1.getVictoire() && !joueur2.getVictoire() && !joueur1.testestMort() && !joueur2.testestMort()) {

			journal.scanner();
            joueur1.deplacer(joueur2);

            if (!joueur1.getVictoire() && !joueur2.testestMort()) {

            	journal.scanner();
                joueur2.deplacer(joueur1);
            }
		}
	}

}

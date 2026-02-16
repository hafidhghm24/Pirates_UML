package jeu;

public class Pirate {
	private String nom;
	private int nbCoeur;
	
	private Couleur couleur;

	private Plateau plateau;

	private Des des;
	private int val;

	private boolean victoire;
	private Affichage journal;

	public Pirate(String nom, int nbCoeur, Couleur couleur, Affichage journal) {
		this.nom = nom;
		this.nbCoeur = nbCoeur;
		this.journal = journal;
		this.couleur = couleur;
		des = new Des(journal);
		plateau = new Plateau(30);

	}

	public int deplacer() {

		des.lancerDes(nom);
		val = des.getValeur();

		plateau.incrCase(val);
		journal.afficheDeplacement(plateau.getPosition());

		testVictoire();

		return plateau.getPosition();
	}

	protected void testVictoire() {
		if (plateau.getPosition() == plateau.getNbCases()) {
			journal.afficheVictoire(nom);
			victoire = true;
		} else if (plateau.getPosition() > plateau.getNbCases()) {
			plateau.reculeCase();
			journal.afficheRecule();
			
			victoire = false;
		}
	}

	

	public boolean getVictoire() {
		return victoire;
	}
}

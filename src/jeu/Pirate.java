package jeu;

public class Pirate {
	private String nom;
	private int nbCoeur;
	
	private Couleur couleur;
	
	private Des des;
	private int val;

	private boolean victoire;
	private Affichage journal;
	private boolean estBloquer;
	private Plateau plateau;

	private boolean mort;

	public Pirate(String nom, int nbCoeur, Couleur couleur, Affichage journal, Plateau plateau) {
		
		this.nom = nom;
		this.nbCoeur = nbCoeur;
		this.journal = journal;
		this.couleur = couleur;
		this.plateau = plateau;
		des = new Des(journal);
		

	}

	public int deplacer(Pirate ennemi) {
		if (estBloquer) {
            journal.afficheBloque(nom);
            estBloquer = false; 
            return plateau.getPosition();
        }

        des.lancerDes(nom);
        val = des.getValeur();

        plateau.incrCase(val);
        journal.afficheDeplacement(plateau.getPosition());

        
        
        testVictoire(ennemi);

        return plateau.getPosition();
	}

	protected void testVictoire(Pirate ennemi) {
		if (plateau.getPosition() == plateau.getNbCases()) {
			journal.afficheVictoire(nom);
			victoire = true;
		}
		
		
		else if (plateau.getPosition() > plateau.getNbCases()) {
			plateau.reculeCase();
			journal.afficheRecule();
			
			victoire = false;
		}

	}
	
	public void perteVie(int degats){
		nbCoeur -= degats;
		if (nbCoeur <= 0) {
            nbCoeur = 0;
            mort = true;
        }
	}
	
	public boolean testestMort() {
		return nbCoeur <= 0;
	}
	
	
	public void estBloquer() {
        estBloquer = true;
    }
	
	public boolean getBloquer() {
        return estBloquer;
    }
	
	
	public String getNom() {
        return nom;
    }


	public boolean getVictoire() {
		return victoire;
	}
}

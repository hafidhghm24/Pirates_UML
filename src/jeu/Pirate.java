package jeu;

public class Pirate {
	private String nom;
	private int nbCoeur;
	
	private Couleur couleur;
	
	private Des des;

	private boolean victoire;
	private Affichage journal;
	private boolean estBloquer;
	private Plateau plateau;



	public Pirate(String nom, int nbCoeur, Couleur couleur, Affichage journal, Plateau plateau) {
		
		this.nom = nom;
		this.nbCoeur = nbCoeur;
		this.journal = journal;
		this.couleur = couleur;
		this.plateau = plateau;
		des = new Des(journal);

	}

	public int deplacer(Pirate ennemi) {
		int valeur;
		if (estBloquer) {
            journal.afficheBloque(nom);
            estBloquer = false; 
            return plateau.getPosition();
        }

        des.lancerDes(nom);
        valeur = des.getValeur();

        plateau.incrCase(valeur);
        journal.afficheDeplacement(plateau.getPosition());

        
        
        testVictoire();

        if(!victoire && plateau.getPosition() <= plateau.getNbCases()) {
        	Case caseActuelleCase = plateau.getCase(plateau.getPosition());
        	caseActuelleCase.actionCase(this, ennemi, journal);
        }
        
        journal.affichePosition(nom, plateau.getPosition());
        return plateau.getPosition();
	}

	protected void testVictoire() {
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
        }
		journal.affichePV(nom, nbCoeur);
	}
	
	public void soin() {
		if(nbCoeur< 4) {
			nbCoeur += 2;
			journal.affichePV(nom, nbCoeur);
		}
		else {
			journal.affichePasManger(nom);
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
	
	public Couleur getCouleur() {
		return couleur;
	}
	
	public int getNbCoeur() {
		return nbCoeur;
	}
}

package jeu;

public class Plateau {
    private int positionPirate;
    private int nbCases = 30;
    private Case[] cases  = new Case[nbCases];
    private int surplus;
    
    
    
    public Plateau(Affichage journal) {
        for (int i = 0; i < nbCases; i++) {
            cases[i] = new Case(i + 1);  
            } 
        
        /*
         * cases[7] = new CaseArme(7, Arme.CANON);
        cases[7].action(joueur, ennemi, journal);
        
        cases[12] = new CaseArme(12, Arme.EPEE );
        cases[7].action(joueur, ennemi, journal);
        
        cases[22] = new CaseArme(22, Arme.FUSIL);
        cases[7].action(joueur, ennemi, journal);
        
        
        
        cases[5] = new CaseFilet(5);
        cases[7].action(joueur, ennemi, journal);
        
        cases[15] = new CaseFilet(15);
        cases[7].action(joueur, ennemi, journal);
        */
        
        
        positionPirate = 0;
    }
    
    public void incrCase(int val) {
        positionPirate += val;
    }
 
    public void reculeCase() {
        surplus = positionPirate - cases.length;
        positionPirate = cases.length - surplus;
        cases[positionPirate].actionCase(null, null, null);
        
        }

    public int getPosition() {
        return positionPirate;
    }

    public int getNbCases() {
        return cases.length;
    }

    public Case getCase(int numero) {
        return cases[numero - 1];
    }

    public boolean estDerniereCase(int position) {
        return position == cases.length;  
    }
    
    public CaseType getCaseType() {
    	return casetype;
    }
}
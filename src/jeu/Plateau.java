package jeu;

public class Plateau {
    private int positionPirate;
    private int nbCases = 30;
    private Case[] cases  = new Case[nbCases];
    
    
    
    
    public Plateau() {
        for (int i = 0; i < nbCases; i++) {
            cases[i] = new CaseNormal(i + 1);  
            } 
        
        cases[7]  = new CaseArme(Arme.CANON, 8); 
        
        cases[12] = new CaseArme(Arme.EPEE,  13);
        cases[17] = new CaseArme(Arme.EPEE, 17);
        
        cases[22] = new CaseArme(Arme.FUSIL, 23);
        cases[4] = new CaseArme(Arme.FUSIL, 4);
        
        

        cases[5]  = new CaseFilet(6);
        cases[15] = new CaseFilet(16);
        cases[20] = new CaseFilet(21);
        
        
        cases[21] = new CaseManger(22);
        cases[24] = new CaseManger(25);
        cases[28] = new CaseManger(29);
        
        
        positionPirate = 0;
    }
    
    public void incrCase(int val) {
        positionPirate += val;
        
    }
 
    public void reculeCase() {
    	int surplus;
        surplus = positionPirate - cases.length;
        positionPirate = cases.length - surplus;
        
        }

    public int getPosition() {
        return positionPirate;
    }

    public int getNbCases() {
        return nbCases;
    }

    public Case getCase(int numero) {
        return cases[numero - 1];
    }

    public boolean estDerniereCase(int position) {
        return position == cases.length;  
    }
    
    
}
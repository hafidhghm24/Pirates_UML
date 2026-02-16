package jeu;

public class Plateau {
    private Case[] cases;
    private int positionPirate;
    
    public Plateau(int nbCases) {
        cases = new Case[nbCases];
        for (int i = 0; i < nbCases; i++) {
            cases[i] = new Case(i + 1);  
            } 
        positionPirate = 0;
    }

    public void incrCase(int val) {
        positionPirate += val;
    }
 
    public void reculeCase() {
        int surplus = positionPirate - cases.length;
        positionPirate -= surplus;
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
}
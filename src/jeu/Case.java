package jeu;


public abstract class Case {
    private int numero;

    
    protected Case(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }
    
    protected abstract void action(Pirate joueur, Pirate ennemi, Affichage journal);

}
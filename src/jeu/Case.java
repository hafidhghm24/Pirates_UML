package jeu;


public class Case {
    private int numero;
    private Arme arme; 
    private CaseType casetype;
    
    protected Case(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void actionFilet(Pirate joueur, Pirate ennemi, Affichage journal) {

    	
        joueur.estBloquer();
        journal.afficheBloque(joueur.getNom());
    }
    
    
    public void actionArme(Pirate joueur, Pirate ennemi, Affichage journal) {
        
    	int degats = arme.getDegats();
        ennemi.perteVie(degats);
        journal.afficheAttaque(joueur.getNom(), arme, degats);

        if (ennemi.estMort()) {
            journal.afficheMort(ennemi.getNom());
        }
    }

    
    public Arme getArme() {
        return arme;
    }
    
}
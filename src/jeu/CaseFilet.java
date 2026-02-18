package jeu;

public class CaseFilet extends Case {

    public CaseFilet(int numero) {
        super(numero);  }

    @Override
    public void action(Pirate joueur, Pirate ennemi, Affichage journal) {

 
        joueur.setBloquer(true);
        journal.afficheBloque(joueur.getNom());
    }
}
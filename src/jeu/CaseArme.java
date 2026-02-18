package jeu;

public class CaseArme extends Case {

    private Arme arme; 
    public CaseArme(int numero, Arme arme) {
        super(numero);
        this.arme = arme;
    }

    @Override
    public void action(Pirate joueur, Pirate ennemi, Affichage journal) {
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
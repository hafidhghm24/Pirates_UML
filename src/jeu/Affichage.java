package jeu;

public interface Affichage {
	void affichePirate(String nom, Couleur couleur);
	void afficheDee(int value);
	void afficheLanceDee(String nom);
	void afficheDeplacement(int nbcase);
	void afficheVictoire(String nom);
	void afficheRecule();
    void afficheBloque(String nom);
    void afficheAttaque(String nom, Arme arme, int degats);
    void afficheMort(String nom);
    void affichePV(String nom, int pv);
    void affichePosition(String nom, int position);
    void afficheFilet(String nom);
    void affichesoin(String nom);
    void affichePasManger(String nom);
    
    public void scanner();
}

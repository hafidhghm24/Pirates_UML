package jeu;

public interface Affichage {
	public void affichePirate(String nom, Couleur couleur);
	public void afficheDee(int value);
	public void afficheLanceDee(String nom);
	public void afficheDeplacement(int nbcase);
	public void afficheVictoire(String nom);
	public void afficheRecule();
    public void afficheBloque(String nom);
    public void afficheAttaque(String nom, Arme arme, int degats);
    public void afficheMort(String nom);
    public void affichePV(String nom, int pv);
    public void affichePosition(String nom, int position);
    public void afficheFilet(String nom);
    public void affichesoin(String nom);
    public void affichePasManger(String nom);
    
    public void scanner();
}

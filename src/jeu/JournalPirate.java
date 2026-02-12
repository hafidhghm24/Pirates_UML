package jeu;

public class JournalPirate implements Affichage{
	
	@Override
	public void affichePirate(String nom) {
		System.out.println("Bien le bonjour ! je suis "+ nom +" le grand");
	}
	
	@Override
	public void afficheDee(int value) {
		System.out.println("ARRrrr mon Dés est : " + value);
		
	}
	
	@Override
	public void afficheLanceDee(String nom) {
		System.out.println("Attention ! le grand "+nom +" lance le Dee ");
	}
		
	@Override
	public void afficheDeplacement(int nbcase) {
		System.out.println("Hissez ho ! Garder le cap !!");
		
	}
	
	@Override
	public void afficheVictoire(String nom) {
		System.out.println("OHÉ OHÉ moi le grand "+ nom + " j'ai REUSI !");
	}
}

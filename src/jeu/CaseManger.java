package jeu;

public class CaseManger extends Case{
	public CaseManger(int numero) {
		super(numero, CaseType.MANGER);

	}
	
	@Override
	public void actionCase(Pirate joueur, Pirate ennemi, Affichage journal) {
		journal.affichesoin(joueur.getNom());
		joueur.soin();
		
	        
			
	}
	



}

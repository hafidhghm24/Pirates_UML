package test_jeu;
import jeu.*;

public class testJeu{
	public static void main(String[] args) 
	{
		System.out.println("Debut programme");
		
		int nbCoeurs = 10;
		Pirate joueur1 = new Pirate("Bill", nbCoeurs);
		Pirate joueur2 = new Pirate("Jack", nbCoeurs);
		
		boolean victoire1 = joueur1.getVictoire();
		boolean victoire2 = joueur2.getVictoire();
		
		
		while(!victoire2) 
		{
			joueur1.deplacer();
			victoire1 = joueur1.getVictoire();
			
			if(!victoire1) 
			{
			joueur2.deplacer();
			victoire2 = joueur2.getVictoire();
			}
		}
		
	
	
	}
	
}

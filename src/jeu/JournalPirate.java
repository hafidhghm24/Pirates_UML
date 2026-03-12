package jeu;

import java.util.Scanner;

public class JournalPirate implements Affichage {
	public Scanner scanner = new Scanner(System.in);
	
	@Override
	public void affichePirate(String nom, Couleur couleur) {
		System.out.println("Bien le bonjour ! je suis " + nom + " le grand et je suis fiére d'arpanté la couleur " + couleur);
	}

	@Override
	public void afficheDee(int value) {
		System.out.println("ARRrrr mon Dés est : " + value);

	}

	@Override
	public void afficheLanceDee(String nom) {
		System.out.println("\nAttention ! le grand " + nom + " lance le Dé ");
	}

	@Override
	public void afficheDeplacement(int nbcase) {
		System.out.println("Hissez ho ! Garder le cap !!");

	}

	@Override
	public void afficheVictoire(String nom) {
		System.out.println("OHÉ OHÉ moi le grand " + nom + " j'ai REUSI !");
	}

	@Override
	public void afficheRecule() {
		System.out.println("Mille sabords ! JE RECULE !!!");
	}
	
	@Override
    public void afficheBloque(String nom) {
        System.out.println("Le grand " + nom + " JE SUIS PIEGER !");
    }

    @Override
    public void afficheAttaque(String nom, Arme arme, int degats) {
        System.out.println("BOUM ! " + nom + " trouve un " + arme + " et inflige " + degats + " dégâts !");
    }

    @Override
    public void afficheMort(String nom) {
        System.out.println("Le grand " + nom + " sombre dans les abysses (IL EST MORT !)");
    }
    
    @Override
    public void affichePV(String nom, int pv) {
        System.out.println("LES PV de " +  nom+": " + pv );
    }
    
    @Override
    public void affichePosition(String nom, int position) {
    	System.out.println("la position de " + nom + ": " + position);
    }
    
    @Override
    public void afficheFilet(String nom){
    	System.out.println("Un filet ! Le grand " + nom + " est piégé pendant 1 tour !");
    }
    

    
    @Override
    public void scanner() {
    	System.out.println("Veuillez saisir y pour continuer :");
    	scanner.next();
    }
    
    @Override
    public void affichesoin(String nom) {
    	System.out.println(nom + ": uuuuuh ça a lair trop bon !");
    }
    
    @Override
    public void affichePasManger(String nom) {
    	System.out.println(nom + ": NOOON je suis calé je ne peu rien manger !");
    }
    
    

}

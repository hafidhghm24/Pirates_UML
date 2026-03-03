package jeu;


public class Case {
    private int numero; 
    private CaseType type;
    
    protected Case(int numero, CaseType type) {
        this.numero = numero;
        this.type = type;
    }
    
    public int getNumero() {
        return numero;
    }
    
    
    public void actionCase(Pirate joueur, Pirate ennemi, Affichage journal) {
    	this.type = CaseType.NORMAL;
    }
    
	public CaseType getType() {
		return type;
	}
    
    
    
}
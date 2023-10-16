package Personnage;

public class Humains {
	private int argent;
	private String boisson;
	private String nom;
	private Humains [] memoire = new Humains [30]; 
	private int nb = 1;

	 public Humains(int argent, String boisson, String nom) {
		this.argent = argent;
		this.boisson = boisson;
		this.nom = nom;
	 }
		
	 public int getArgent() {
		 return argent;
	 }

	 public String getBoisson() {
		 return boisson;
	 }

	 public String getNom() {
		 return nom;
	 }

	 public void ajouterArgent(int argent) {
		 this.argent += argent;
	 }
		
	 public void perdreArgent(int argent) {
		 this.argent -= argent;
	 }
		
	 public void direBonjour() {
		 parler("Bonjour ! Je m’appelle " + nom + " j’aime boire du " + boisson + " et j'ai " + argent + " sous en poche." ); 
	 }
		 
	 public void parler(String texte) {
		 System.out.println("(" + nom + ")" + " - " + texte);
	 }
	 
	 public void boire() {
		 parler("Mmmm, un bon verre de "+ boisson + " ! GLOUPS !");
	 }
		
	 public void acheter(int prix, String boisson) {
		 if (argent - prix >= 0){
			 parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une " + boisson + " à " + prix + " sous.");
			 perdreArgent(prix);
		 } else {
			 parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + boisson + " à " + prix + " sous.");
		 }
	 }
	 
	public void faireConnaissanceAvec(Humains humain, Humains [] memoire) {
		if (this.nb < memoire) {
			this.memoire[this.nb] = humain;
			this.nb ++;	
				
			parler("Je connais beaucoup de monde dont : " + humain.getNom());
		} else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}	 
	 
	 public void listerConnaissance(){
		 
	 }
	 
	 public void memoriser(){
		 
	 }
}
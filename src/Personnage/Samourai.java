package Personnage;

public class Samourai extends Ronins {
	String seigneur;

	public Samourai(int argent, String boisson, String nom, String seigneur) {
		super(argent, boisson, nom);
		this.seigneur = seigneur;
	}
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
	}

	public void direBonjour(){
		super.direBonjour();
		parler("Je suis fier de servir le seigneur "+ this.seigneur);
	}
}
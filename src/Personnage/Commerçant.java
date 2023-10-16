package Personnage;

public class Commerçant extends Humains {
	public Commerçant(int argent, String nom) {
		super(argent, "thé", nom);
	}
	
	public void commercantParler() {
		parler("J'ai tout perdu ! Le monde est vraiment trop injuste ...");
	}

	public int seFaireExtorquer() {
		int n = getArgent();
		perdreArgent(n);
		parler("J'ai perdu " + n + " sous ! Le monde est vraiment trop injuste ...");
		return n;
	}
	
	public void recevoir(int argent) {
		parler("je te remercie pour les " + argent +" sous, généreux donateur !");
		super.ajouterArgent(argent);
	}
}
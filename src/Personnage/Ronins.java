package Personnage;

public class Ronins extends Humains {
	int honneur = 1;
	
	public Ronins(int argent, String boisson, String nom) {
		super(argent, boisson, nom);
	}

	void donner(Commerçant commercant ,int argent) {
		int argentDonner = argent ;
		perdreArgent(argentDonner);
		parler("Prends commercant je te donne "+ argentDonner + " sous.");
		commercant.recevoir(argentDonner);
	}
	
	void provoquer(Yakuzas y) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		int r = y.getReputation();
		
		if ( (this.honneur * 2) > r ) {
			int argentGagner = y.perdre();
			ajouterArgent(argentGagner);
			this.honneur ++;
			parler("Je t’ai eu petit Yakusa !");
		} else {
			y.gagner();
			this.honneur -- ;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		}
	}
}
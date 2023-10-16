package Personnage;

public class Traitre extends Samourai {
	private int traitrise = 0; 

	public Traitre(int argent, String boisson, String nom, String seigneur) {
		super(argent, boisson, nom, seigneur);
	}

	public void ranconner(Commerçant commercant){
		if(this.traitrise < 3) {
			int argentGagner = commercant.seFaireExtorquer();
			ajouterArgent(argentGagner);
			parler("J'ai extroquer un commercant de " + argentGagner + " sous.");
			this.traitrise ++;
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + this.traitrise + ". Chut !");
	}
	
	public void faireLeGentil(Humains humain, int argent) {
		int argentDonner = argent ;
		perdreArgent(argentDonner);
		parler("Prends je te donne "+ argentDonner + " sous.");
		humain.ajouterArgent(argentDonner);
		if(this.traitrise != 0) {
			this.traitrise = this.traitrise - (argentDonner/10);
		}
	}
}
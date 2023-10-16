package Personnage;

public class Yakuzas extends Humains {
	String clan;
	int reputation = 0;

	public Yakuzas(int argent, String boisson, String nom , String clan) {
		super(argent, boisson, nom);
		this.clan = clan;
	}
	
	public void extorquer(Commerçant commercant, int argent) {
		int argentGagner = commercant.seFaireExtorquer();
		ajouterArgent(argentGagner);
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler("Commerçant, si tu tiens à la vie donne moi ta bourse !");
		parler("J’ai piqué les " + argentGagner + " sous de commerçant, ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
	}

	public void gagner() {
		reputation ++;
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de Warsong ? Je l'ai dépouillé de ses 54 sous.");
	}
	
	public int perdre() {
		int argentPerdu = getArgent();
		perdreArgent(argentPerdu);
		parler("J’ai perdu mon duel et mes "+ argentPerdu + " sous, snif... J'ai déshonoré le clan de Warsong.");
		reputation --;
		return argentPerdu;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de "+ this.clan);
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
}
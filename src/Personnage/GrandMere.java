package Personnage;
import java.util.Random;

public class GrandMere extends Humains {
	private Humains [] memoire = new Humains [5]; 
	private int nb = 1;

	public GrandMere(int argent, String nom) {
		super(argent, " tisane " , nom);
	}

	private String humainHasard() {
		String type;
		Random random = new Random();
		int randomInt = random.nextInt(4);
		
		switch(randomInt){
			case 0 : type = "Yakuza";
					break;
			case 1 : type = "Ronin";
					break;
			case 2 : type = "Samourai";
					break;
			case 3 : type = "Commercant";
					break;
			default : type = "Habitant";
					break;
		}
		return type;
	}
	
	public void ragoter() {
		for (int i = 1; i < this.nb; i++) {
			if(memoire[i] instanceof Traitre) {
				parler("Je sais que " + memoire[i].getNom() + " est un Traitre. Petit chenapan !");
			} else {
				parler("Je crois que " + memoire[i].getNom() + " est un "+ humainHasard());
			}
		}
	}
}
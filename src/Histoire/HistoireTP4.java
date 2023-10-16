package Histoire;

public class HistoireTP4 {

	public static void main(String[] args) {

	Humains h = new Humains (54, "Kombucha", "Prof");
	h.direBonjour();
	h.boire();
	
	Commerçant c = new Commerçant(35,"Marco");
	c.direBonjour();
	
	Yakuzas y = new Yakuzas(30,"biere","Yaku le noir", "WarSong");
	y.direBonjour();
	y.extorquer(c);
	
	Ronins r = new Ronins(54,"sake","Roro");
	r.donner(c, 40);
	r.provoquer(y);
	r.direBonjour();
	
	Ronins musaichi = new Samourai(10 , "coca" ,"Akimoto", "Miyamoto");
	musaichi.direBonjour();
	musaichi.boire();
	 
	Samourai s = new Samourai(100 , "cocktail" ,"Mokay", "Miyamoto");
	s.boire("coca");
	s.boire();
	
	Traitre t = new Traitre(100, "orange juce", "Omar", "bob");
	t.direBonjour();
	t.traitreExtorquer(c);
	t.faireLeGentil(r, 5);
	t.direBonjour();
	
	GrandMere g = new GrandMere(11,"mom");
	g.faireConnaissanceAvec(s);
	g.ragoter();
	g.faireConnaissanceAvec(t);
	g.ragoter();
	
	}
}
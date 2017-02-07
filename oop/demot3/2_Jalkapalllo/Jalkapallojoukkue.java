class Jalkapallojoukkue extends Joukkue{
	final int MAX_PELAAJIA = 22;
	String kotistadion;
	
	Jalkapallojoukkue(String k){
		super();
		kotistadion = k;
	}
	
	public void lisaaPelaaja(String n, int num, String pp){
		if(pelaajat.size < MAX_PELAAJIA){
			Pelaaja uusiPelaaja = new Pelaaja(n,num,pp);
			pelaajat.add(uusiPelaaja);
		}
		else{System.out.println("Joukkue taynna");}
	}
}
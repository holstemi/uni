public class Joukkue{
	public ArrayList<Pelaaja> pelaajat;
	
	public Joukkue(){
		pelaajat = new ArrayList<Pelaaja>()
	}
	
	public void lisaaPelaaja(String n, int num, String pp){
		Pelaaja uusiPelaaja = new Pelaaja(n,num,pp);
		pelaajat.add(uusiPelaaja);
	}
	
	public void poistaPelaaja(int num){
		for (Pelaaja x : pelaajat){
			if(x.annaNumero() == num){
				pelaajat.remove(a);
			}
		}
	}
	
	public void tulostaJoukkue(){
		for (Pelaaja x : pelaajat){
			System.out.print(x.annaNimi());
			System.out.print(x.annaNumero());
			System.out.println(x.annaPelipaikka());
		}
	}
}

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
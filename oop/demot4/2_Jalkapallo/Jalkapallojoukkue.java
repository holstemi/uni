import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Jalkapallojoukkue extends Joukkue{
	final int MAX_PELAAJIA = 22;
	 private String kotistadion;
	 private double budjetti;
	 
	
	Jalkapallojoukkue(String k){
		super();
		this.asetaKotistadion(k);
	}
	
	public void lisaaPelaaja(String n, int num, String pp){
		if(pelaajat.size() < MAX_PELAAJIA){
			Jalkapallonpelaaja uusiPelaaja = new Jalkapallonpelaaja(n,num,pp);
			pelaajat.add(uusiPelaaja);
		}
		else{System.out.println("Joukkue taynna");}
	}
	public void lisaaPelaaja(Jalkapallonpelaaja j) {
		pelaajat.add(j);
		try {
			lisaaBudjetti(j.annaPalkka());
		} catch (BudjettiYlitetty e) {
			
			System.out.println("VIRHE: "+e.getMessage());
		}
	}
	public void tulostaPelaajatPalkka(int n){
	List<Jalkapallonpelaaja> p = new ArrayList<Jalkapallonpelaaja>();
	for(int i = 0; i < pelaajat.size();i++){
		p.add((Jalkapallonpelaaja)pelaajat.get(i));}
	
	Collections.sort(p);
	for (int i = p.size(); i >=n;i--){   
   System.out.println(p.get(i-1).toString());    
  }
	

}


	public String annaKotistadion() {
		return kotistadion;
	}

	public void asetaKotistadion(String kotistadion) {
		this.kotistadion = kotistadion;
	}

	public void lisaaBudjetti(double a ) throws BudjettiYlitetty{
		if(budjetti+a > Joukkue.PALKKAKATTO){
			throw new BudjettiYlitetty("Ylittaa palkkakaton");
		}
		budjetti += a;
			
			
	}
	public void tulostaBudjetti(){
		System.out.println(budjetti);
	}
	

	
}

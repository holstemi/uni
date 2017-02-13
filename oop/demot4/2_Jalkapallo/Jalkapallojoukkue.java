import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Jalkapallojoukkue extends Joukkue{
	final int MAX_PELAAJIA = 22;
	String kotistadion;
	
	Jalkapallojoukkue(String k){
		super();
		kotistadion = k;
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

	
	
}

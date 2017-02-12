import java.util.Comparator;

class Jalkapallonpelaaja extends Pelaaja implements Comparable<Jalkapallonpelaaja>, Comparator<Jalkapallonpelaaja>{
	boolean oikeajalkainen;
	double palkka;
	
	Jalkapallonpelaaja(String n, int m, String pp){
		super(n, m, pp);
		oikeajalkainen = true;
		this.palkka = 100.0;
	
	}
	
	public void onOikeajalkainen(boolean x){
		oikeajalkainen = x;
	}
	public boolean onkoOikeajalkainen(){
		return oikeajalkainen;
	}
	public void asetaPalkka(double x){
		palkka = x;
	}
	public double annaPalkka(){
		return palkka;
	}
	public String toString(){
	return "Nimi:"+this.nimi+",Pelinumero:"+ this.numero+",Pelipaikka:"+this.pelipaikka+",Oikeajalkainen:"+this.oikeajalkainen+",Palkka:"+this.palkka;
	}
	@Override
	public int compareTo(Jalkapallonpelaaja jalkapallonpelaaja) {
		if( this.palkka < jalkapallonpelaaja.annaPalkka()){
			return -1;
		}else if(this.palkka == jalkapallonpelaaja.annaPalkka()){
			return 0;
		}else{
			return 1;
		}
	
	}
	public int compare(Jalkapallonpelaaja p1,Jalkapallonpelaaja p2){
		return (int) (p1.annaPalkka()-p2.annaPalkka());
		
	}
	
}

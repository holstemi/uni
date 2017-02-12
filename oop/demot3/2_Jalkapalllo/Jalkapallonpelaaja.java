class Jalkapallonpelaaja extends Pelaaja implements Comparable<Jalkapallonpelaaja>{
	boolean oikeajalkainen;
	double palkka;
	
	Jalkapallonpelaaja(){
		oikeajalkainen = true;
		viikkopalkka = 100.0;
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
		return viikkopalkka;
	}
	public String toString(){
	return "Nimi:"+this.nimi+", Pelinumero:"+ this.numero+", Pelipaikka:"+this.pelikaikka+", Oikeajalkainen:"+this.oikeajalkainen+" ,Palkka:"+this.palkka;
	}
	Public int compareTo(Jalkapallonpelaaja jalkapallonpelaaja){
		
	
	}
}

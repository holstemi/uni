public class Pelaaja{
	String nimi;
	int numero;
	String pelipaikka;
	
	public Pelaaja(String n, int num, String pp){
		nimi = n;
		numero = num;
		pelipaikka = pp;
	}
	
	public String annaNimi(){
		return nimi;
	}
	public int annaNumero(){
		return numero;
	}
	public String annaPelipaikka(){
		return pelipaikka;
	}
}

class Jalkapallonpelaaja extends Pelaaja{
	boolean oikeajalkainen;
	double viikkopalkka;
	
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
	public void viikonPalkka(double x){
		viikkopalkka = x;
	}
	public double annaPalkka(){
		return viikkopalkka;
	}
}
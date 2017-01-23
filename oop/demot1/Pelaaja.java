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
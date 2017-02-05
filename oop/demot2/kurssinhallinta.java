public class Opiskelija{
	String nimi;
	int opiskelijanumero;
	ArrayList<Integer> tulokset;
	
	Opiskelija(String n, int o, ArrayList<Integer> t){
		nimi = n;
		opiskelijanumero = o;
		tulokset = t;
	}
}

public class Kurssi{
	String tila;
	String luennoitsija;
	String kurssiseloste;
	String opetustila;
	int tuntienMaara;
	int opintopisteita;
	int opiskelijamaara;
	int minimaara;
	
	public void lisaaOpiskelija(param){}
	public void poistaOpiskelija(param){}
	public int annaArvosana(param){}
}
public class Tentti{
	Kurssi kurssi;
	double maxpisteet;
	double saadutpisteet;
	double lapipaasyraja;
	int arvosana;
	ArrayList<String> kysymykset;
	ArrayList<String> vastaukset;
	Opiskelija opiskelija;
	
	public void lisaaKysymys(param){}
	public void lisaaVastaus(){}
	public double tarkistaVastaukset(param){}
	
}

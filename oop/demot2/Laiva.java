public class Laiva{
	
	protected String nimi;
	protected double pituus;
	protected double syvays;
	protected double nopeus_knt;
	
	public Laiva(String n, double p, double s, double knt){
		nimi = n;
		pituus = p;
		syvays = s;
		nopeus_knt = knt;
	}
	
	public double kulkeeMatkan(double km){
		System.out.println("Laiva kulkee " + km + "ajassa " + (60*km/(3.6*nopeus_knt*0.514444)) + "min");
	}
}

class Rahtilaiva extends Laiva{
	double kapasiteetti;
	double rahti;
	
	public Rahtilaiva(String n, double p, double s, double knt, double cap, double rahti){
		super(n,p,s,knt);
		kapasiteetti = cap;
		if(rahti <= cap){
			this.rahti = rahti;
		}
		else{
			System.out.println("Rahti ylittaa laivan kapasiteetin. Lastin kooksi asetettu laivan kapasiteetti.");
			this.rahti = cap;
		}
	}
	
	public double kulkeeMatkan(double km){
		System.out.println("Laiva kulkee " + km + "ajassa " + (60*km/(3.6*nopeus_knt*0.514444*(1+(rahti/kapasiteetti)))) + "min");
	}
}

class Autolautta extends Laiva{
	final int kapasiteetti;
	int matkustajamaara;
	int ajoneuvojenmaara;
	
	public Autolautta(String n, double p, double s, double knt, int cap, int mm, int am){
		super(n,p,s,knt);
		kapasiteetti = cap;
		if((mm + 10*am) <= cap){
			matkustajamaara = mm;
			ajoneuvojenmaara= am;
		}
		else{
			System.out.println("Rahti ylittaa laivan kapasiteetin.");
			matkustajamaara = 9*cap/10;
			ajoneuvojenmaara = cap/10;
		}
}
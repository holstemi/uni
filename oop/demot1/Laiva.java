public class Laiva{
	
	String nimi;
	double pituus;
	double syvays;
	double nopeus_knt;
	
	public Laiva(String n, double p, double s, double knt){
		nimi = n;
		pituus = p;
		syvays = s;
		nopeus_knt = knt;
	}
	
	public double kulkeeMetriMatkan(double m){
		return (m/(nopeus_knt*0.514444));
	}
	public double kulkeeSolmuMatkan(double m){
		return (m/nopeus_knt);
	}
}
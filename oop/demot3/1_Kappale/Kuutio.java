public class Kuutio implements Kappale(){
	double ala;
	Piste kp;
	
	Kuutio(int x, int y, double sivu){
		kp = new Piste(x,y);
		ala = 6*sivu*sivu;
	}
	
	public double annaAla(){
		return ala;
	}
}
class Piste(){
	private int x;
	private int y;
	
	Piste(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String annaPiste(){
		return "["+x+","+y+"]";
	}
}
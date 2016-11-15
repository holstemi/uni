import java.util.Random;

public class demo13 {
	
	static int SATUNNAISMAX = 15;

	public static void main(String[] q){

		Random r = new Random();
		int satunnaisluku = 1; //= r.nextInt(SATUNNAISMAX); //Korkeintaan 15 arvoksi
		String s = "";
		for(int i=0; i<=satunnaisluku; i++){
			int pituus = r.nextInt(4); //Satunnaisluku (max. 4)
			if(s.length() < pituus){s += i;} //Merkkijonnoon max. 3 numeroa. s korkeintaan "0123" (tai "012", "01", "0")
			int kokonaisluku = Integer.parseInt(s); //Muutetaan merkkijono numeroiksi
			if(kokonaisluku%2 == 0){ //Jos parillinen (eli jos satunnaisluku on parillinen) 
				s = (kokonaisluku/2)+""; //kokonaisluku jaetaan kahdella. Käytännössä s = 6 tai 0
			} 
		}
		if(s.length() == satunnaisluku){System.out.println("Algoritmi onnistui.");} //Jos satunnaisluvuksi on tullu 1, algoritmi onnistuu
		else{System.out.println("Algoritmi ei t�ll� kertaa onnistunut.");} //Muuten epäonnistuu
	}
}

import java.util.Random;

public class demo13 {
	
	static int SATUNNAISMAX = 15;

	public static void main(String[] q){

		Random r = new Random();
		int satunnaisluku = r.nextInt(SATUNNAISMAX); //Korkeintaan 15 arvoksi
		String s = "";
		
		for(int i=0; i<=satunnaisluku; i++){
			int pituus = r.nextInt(4); //Satunnaisluku (max. 4)
			if(s.length() < pituus){s += i;} //Lisää merkkijonnoon numeroita 0-4
			int kokonaisluku = Integer.parseInt(s); //Muutetaan merkkijono numeroiksi
			if(kokonaisluku%2 == 0){ //Jos parillinen 
				s = (kokonaisluku/2)+""; //kokonaisluku jaetaan kahdella ja sijoitetaan s:ään
			} 
		}
		
		if(s.length() == satunnaisluku){System.out.println("Algoritmi onnistui.");} //Algoritmi onnistuu
		else{System.out.println("Algoritmi ei t�ll� kertaa onnistunut.");} //Muuten epäonnistuu
	}
}

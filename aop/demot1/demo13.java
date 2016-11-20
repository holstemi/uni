
import java.util.Random;

public class demo13 {
	
	static int SATUNNAISMAX = 15;

	public static void main(String[] q){

		Random r = new Random();
		int satunnaisluku = r.nextInt(SATUNNAISMAX); //Korkeintaan 15 satunnaisluvun arvoksi
		System.out.println("Satunnaisluku:"+satunnaisluku); //Kontrolliprintti
		String s = "";
		//13
		for(int i=0; i<=satunnaisluku; i++){
			int pituus = r.nextInt(4); //Toinen satunnaisluku (max. 4). Jos tästä tulee 0, kun i=0 --> error
			System.out.print("2. rnd muuttuja: "+pituus+" "); //Kontrolliprintti
			if(s.length() < pituus){
				s += i; //Lisää merkkijonnoon numeron väliltä 0-4
			} //19
			System.out.print("Merkkijono: "+s+" "); //Kontrolliprintti
			int kokonaisluku = Integer.parseInt(s); //Muutetaan merkkijono numeroiksi. Heittää erroreita, kun s tyhjä
			if(kokonaisluku%2 == 0){
				s = (kokonaisluku/2)+""; //S jaetaan kahdella.
			} 
			System.out.println("Merkkijono: "+s+" "); //Kontrolliprintti
		}
		System.out.println("S pituus: "+s.length()); //Kontrolliprintti
		
		if(s.length() == satunnaisluku){System.out.println("Algoritmi onnistui.");} //Algoritmi onnistuu
		else{System.out.println("Algoritmi ei t�ll� kertaa onnistunut.");} //Muuten epäonnistuu
	}
}

//Johtopäätökset kontrolliprinttien perusteella:

//s.length() maksimiarvo on 3 ja min 1 --> epäonnistuu varmasti, kun satunnaisluku > 3 tai 0, jolloin s.length()=1.
//Huom: Erikoistapauksena s.length() voi saada arvon 4, jos satunnaismuuttuja >= 10. Algoritmi joka tapauksessa epäonnistuu tällöin
//Mikä on tämän koodin tarkoitus? - Ei mitään käryä

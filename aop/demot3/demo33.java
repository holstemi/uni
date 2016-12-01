import java.util.Random;
import java.util.Scanner;

public class demo33 {
	
	public static void main(String[] args){
		teht3();
	}

	private static void teht3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Anna merkkijono:");
		String mjono = scan.nextLine();
		System.out.println("Anna etsittävät merkit:");
		String merkit = scan.nextLine();
		scan.close();
		int merkkienMaara = laskeMerkit(mjono, merkit);

		System.out.println(merkkienMaara); //aputuloste

		String muodostettavaMerkkijono = "";
		if(merkkienMaara %2 == 0){
			tuotaParillinenMerkkijono(""); //HUOM! ei palauta mitaan, joten muodostetavaMerkkijono on tyhja
		}else{
			muodostettavaMerkkijono = "0";
		}
		
		System.out.println("Viimeiseksi merkiksi muodostui "+viimeinenMerkki(muodostettavaMerkkijono)); //HUOM! palauttaa virheen, kun merkkienMaara parillinen
	}




	/**
	 * Laskee esiintymien määrän
	 * @param mjono merkkijono, josta merkkejä etsitään
	 * @param merkit merkkijono, jota etsitään
	 * @return kuinka monta kertaa merkkijono merkit esiintyi merkkijonossa mjono
	 */



	private static int laskeMerkit(String mjono, String merkit) {
		int maara = 0;
		//indexOf palauttaa -1, kun etsittävää merkkijonoa ei löytynyt. Muulloin palautuu indeksi, josta merkkijono alkaa.
		for(int i=mjono.indexOf(merkit); i>=0; i=mjono.indexOf(merkit, i+1)){
			maara++;
		}
		return maara;
	}




	/**
	 * Tuotetaan uusi nelinumeroinen merkkijono. Merkkijono on parillinen kokonaisluku.
	 * @param muodostettavaMerkkijono merkkijono, johon numeroita kerätään. On lopuksi parillinen sekä nelinumeroinen.
	 */





	private static void tuotaParillinenMerkkijono(String muodostettavaMerkkijono) { //HUOM! ei palauta tai tulosta mitaan. Mika on taman tarkoitus?
		Random rand = new Random();
		for(int i=0; i<4; i++){			
			int luku = rand.nextInt(10);
			if(i==3){
				//viimeinen kierros: varmistetaan parillinen, yksinumeroinen luku
				if(luku % 2==1){
					luku++;
					luku %= 10;
				}
			}			
			muodostettavaMerkkijono += luku;
		}
		System.out.println(muodostettavaMerkkijono); //aputuloste
	}
	



	/**
	 * Palauttaa viimeisen merkin annetusta merkkijonosta.
	 * @param mjono Merkkijono, josta viimeinen merkki halutaan
	 * @return yksi merkki.
	 */




	private static char viimeinenMerkki(String mjono) { //HUOM! palauttaa virheen, kun merkkienMaara parillinen. Palauttaa 0, kun merkkienMaara parillinen
		return mjono.charAt(mjono.length()-1);
	}
	
}

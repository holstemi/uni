import java.util.Random;

public class tka { //yleisesti ottaen: ohjelmassa kaytetty nimeamiskaytanto on todella huono koodin luettavuuden kannalta

	public static int rvtra = 11;	//jokseenkin turha yleien muuttuja, koska sita kaytetaan koodissa vain kerran
		
	public static void main(String[] tk){		
		double tka = 0;		
		while(tka(tka)){ //boolean: tka < 5
			tka = tka(tka());
		}		
		if(tka(tka)){ //boolean: tka < 5. Edellisen while loopin takia tama ehto ei koskaan toteudu
			System.out.println(tka);
		}
		else{
			System.out.println(0);} //tapahtuu aina ja tulostuu 0
		}
		
	public static int[] tka(){
		Random ka = new Random();
		int[] tk = new int[ka.nextInt(rvtra)+7]; //luodaan int muotoinen taulukko, jonka koko vah. 7
		for(int tka = 0; tka < tk.length; tka++){ 
			tk[tka] = ka.nextInt(tka+1)+1; //taytetaan se satunnaisilla positiivisilla numeroilla
		}
		return tk; //palautetaan taulukko
		}	
				
	private static double tka(int[] tk) {
		if(tk.length == 0){ //ehto ei toteudu koskaan
			return 0;
		}
		int tka = 0;
		for(int tka1 : tk){ //kaydaan taulukko lapi
			tka += tka1; //ja listataan taulukona arvot int muuttujaan tka
		}
		return tka/tk.length; //palautetaan taulukon numeroiden keskiarvo
		}	
			
	public static boolean tka (double tka){return tka <5;}

}


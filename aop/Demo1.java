import java.util.Scanner;

public class Demo1{
	//Demot1 all-in-one
	public static void main(String[] args){
		Scanner lukija = new Scanner(System.in);
		System.out.print("Valitse demotehtävä (ei 3): ");
		int demo = lukija.nextLine();
		if (demo = 1){
			//Tulosta lyhin merkkijono
			String s1 = lukija.nexLine("Ensimmäinen merkkijono: ");
			String s2 = lukija.nexLine("Toinen merkkijono: ");
			String s3 = lukija.nexLine("Kolmas merkkijono: ");
			if ((s1.length() < s2.length())&&(s1.length() < s3.length()){
				System.out.println(s1);
			}
			if ((s2.length() < s1.length())&&(s2.length() < s3.length()){
				System.out.println(s2);
			}
			else{System.out.println(s3);}
		}
		else if (demo = 2){
			//Onko täysi-ikäinen vuoden 2015 loppuun mennessä?
			int svuosi = lukija.nextLine("Syntymävuotesi: ");
			if (2015 - svuosi <= 18){String ika = "Alaikäinen"}
			else {String ika = "Täysi-ikäinen"}
			System.out.println("Vuoden 2015 lopussa olit: " + ika)
		}
		else if (demo = 4){
			//Etsii sähköopstiosoitteesta domain osan (esim. utu.fi)
		}
		else if (demo = 5){
			//Ratkaisee toisen asteen yhtälön
			
		}
		else if (demo = 6){
			//Kapitalisoi merkkijonosta A kaikki kohdat joissa merkkijono B esiintyy
		}
		else{
			System.out.println("Etsimääsi demoa ei löytynyt. Yritä uudelleen.")
		}
		lukija.close();
	}
}
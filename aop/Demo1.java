import java.util.Scanner;

public class Demo1{
	//Demot1 all-in-one
	public static void main(String[] args){
		Scanner lukija = new Scanner(System.in);
		System.out.print("Valitse demotehtävä (ei 3): ");
		int demo = lukija.nextLine();
		if (demo = 1){
			String s1 = lukija.nexLine("Ensimmäinen merkkijono: ");
			String s2 = lukija.nexLine("Toinen merkkijono: ");
			String s3 = lukija.nexLine("Kolmas merkkijono: ");
		}
		else if (demo = 2){
			int svuosi = lukija.nextLine("Syntymävuotesi: ");
			if (2015 - svuosi <= 18){String ika = "Alaikäinen"}
			else {String ika = "Täysi-ikäinen"}
			System.out.println("Vuoden 2015 lopussa olit: " + ika)
		}
		else if (demo = 4){
			
		}
		else if (demo = 5){
			
		}
		else if (demo = 6){
			
		}
		else{
			System.out.println("Etsimääsi demoa ei löytynyt. Yritä uudelleen.")
		}
		lukija.close();
	}
}
import java.util.Scanner;

public class Demo1{
	//Demot1 all-in-one
	public static void main(String[] args){
		Scanner lukija = new Scanner(System.in);
		System.out.print("Valitse demoteht�v� (ei 3): ");
		int demo = lukija.nextLine();
		if (demo = 1){
			//Tulosta lyhin merkkijono
			String s1 = lukija.nexLine("Ensimm�inen merkkijono: ");
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
			//Onko t�ysi-ik�inen vuoden 2015 loppuun menness�?
			int svuosi = lukija.nextLine("Syntym�vuotesi: ");
			if (2015 - svuosi <= 18){String ika = "Alaik�inen"}
			else {String ika = "T�ysi-ik�inen"}
			System.out.println("Vuoden 2015 lopussa olit: " + ika)
		}
		else if (demo = 4){
			//Etsii s�hk�opstiosoitteesta domain osan (esim. utu.fi)
		}
		else if (demo = 5){
			//Ratkaisee toisen asteen yht�l�n
			
		}
		else if (demo = 6){
			//Kapitalisoi merkkijonosta A kaikki kohdat joissa merkkijono B esiintyy
		}
		else{
			System.out.println("Etsim��si demoa ei l�ytynyt. Yrit� uudelleen.")
		}
		lukija.close();
	}
}
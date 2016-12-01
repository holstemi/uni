import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.Random;

public class demot3_aio{
	
	public static void main(String[] args){
		try{
			Scanner re = new Scanner(System.in);
			System.out.print("Valitse demotehtava: ");
			int demo = re.nextInt();
			re.nextLine();
			System.out.println("------------------------");

			if (demo == 1){
				System.out.print("Syota merkkijono: ");
				String s = re.nextLine();
				System.out.println("------------------------");
				System.out.println("Palindromi: " + onkoPalindromi(s));
			}
			else if (demo == 2){
				System.out.print("Syota nopan heittojen lukumaara: ");
				int a = re.nextInt();
				System.out.print("Syota nopan tahkojen lukumaara: ");
				int b = re.nextInt();
				System.out.println("------------------------");
				System.out.println("Nopanheittojen summa: " + heitaNoppaa(a,b));
			}
			else if (demo == 3){
				System.out.print("Ks. tiedosto demo33.java");
			}
			else if (demo == 4){
				System.out.print("Syota merkkijono: ");
				String s = re.nextLine();
				System.out.println("------------------------");
				System.out.println(poistaErikoismerkit(s));
			}
			else if (demo == 5){
				System.out.print("Syota merkkijono: ");
				String s = re.nextLine();
				int y = s.length();
				System.out.println(y); //tulostetaan merkkien lukumaara
				tulostaRiskeja(y); //tulostetaan y verran asterikseja
				int kpl = 0;
				for (int i = 0; i < y; i++){
					for (int j = 0; j < y; j++){
						if (s.charAt(i) == s.charAt(j)){
							kpl++;
						}
					}
					tulostaRiskeja(kpl); //tulostetaan kpl verran asterikseja
					kpl = 0;
				}
				tulostaRiskeja(y); //tulostetaan y verran asterikseja
			}
			else if (demo == 6){
				System.out.print("Syota merkkijono: ");
				String s = re.nextLine();
				int sana = 1;
				int summa = 0;

				for (int j = 0; j < s.length(); j++){ //sanojen lukumaara (4 puolipistetta)
					if (s.charAt(j) == ' '){
						sana++;
					}
				}
				System.out.println("Sanojen lukumaara: " + sana);
				System.out.println("Syota kokonaislukuja sanojen maara: "); //sanojen lukumaaran verran lukuja ja niiden summa (5 puolipistetta)
				for (int j = 0; j < sana; j++){
					summa += re.nextInt();
				}
				System.out.println("Niiden summa: " + summa);
				System.out.println("Sanasi oli palindromi: " + onkoPalindromi(s)); //oliko sana palindromi? (1 + 4 puolipistetta)
			}
			else{System.out.println("Etsimaasi demoa ei loytynyt. Yrita uudelleen.");}
			re.close();
		}
		catch(Exception e){System.out.println("Jokin meni pieleen, yrita uudelleen!");}
	}
	
	public static boolean onkoPalindromi(String m){
		String g = new StringBuilder(m).reverse().toString(); //kaantaa alkuperaisen merkkijonon ympari uuteen muuttujaan
		int ml = m.length();
		if (m.equals(g)){ //on palindromi jos g ja m ovat samat merkkijonot
			return true;
		}
		else{return false;}
	}

	public static int heitaNoppaa(int n, int tahkot){
		Random rd = new Random();
		int a = rd.nextInt(n*tahkot-n+1)+n;
		return a;
	}

	public static String poistaErikoismerkit (String m){
		String g = "";
		char[] ok = {'1','2','3','4','5','6','7','8','9','0','ä','Ä','ö','Ö','å','Å'}; //erikoisemmat merkit
		for (int i = 0; i < m.length(); i++){
			boolean contains = false;
			for (char c : ok) { //kaydaan lapi lista ok
    				if (c == m.charAt(i)) {
        				contains = true;
        				break;
    				}
			}
			if (contains){
				g += m.charAt(i); //jos merkki erikisempien merkkien listassa
			}
			else if ((int)Character.toLowerCase(m.charAt(i)) <= 122 && (int)Character.toLowerCase(m.charAt(i)) >= 97){
				g += m.charAt(i); //jos merkki on valilla a-z
			}
			else { g += " ";}
		}
		return g;
	}

	public static void tulostaRiskeja(int x){
		for (int i = 0; i < x; i++){ //tulostetaan x verran asterikseja
			System.out.print("*");
		}
		System.out.println();
	}
}

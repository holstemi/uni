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
				System.out.println(onkoPalindromi(s));
			}
			else if (demo == 2){
				System.out.print("Syota nopan heittojen lukumaara: ");
				int a = re.nextInt();
				System.out.print("Syota nopan tahkojen lukumaara: ");
				int b = re.nextInt();
				System.out.println("------------------------");
				System.out.println("Nopanheittojen summa: "+heitaNoppaa(a,b));
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
				System.out.println(s.length()); //tulostetaan merkkien lukumaara
				for (int i = 0; i < s.length(); i++){ //tulostetaan merkkien lukumaaran verran asterikseja
					System.out.print("*");
				}
				int kpl = 0;
				for (int i = 0; i < s.length(); i++){
					for (int j = 0; j < s.length(); j++){
						if (s.charAt(i) == s.charAt(j)){
							kpl++;
						}
					}
					for (int g = 0; g < kpl; g++){
						System.out.print("*"); //tulostetaan kyseisen merkin esiintymisten lukumaaran verran asterikseja
					}
					kpl = 0;
					System.out.println();
				}
				for (int i = 0; i < s.length(); i++){ //tulostetaan merkkien lukumaaran verran asterikseja
					System.out.print("*");
				}
			}
			else if (demo == 6){
				System.out.print("Syota merkkijono: ");
				String s = re.nextLine();
				int sana = 0;
				ins summa = 0;
				for (int j = 0; j < s.length(); j++){ //sanojen lukumaara
					if (s.charAt(j) == ' '){
						sana++;
					}
				}
				System.out.println(sana);
				System.out.println("Syota kokonaislukuja: "); //sanojen lukumaaran verran lukuja ja niiden summa
				for (int j = 0; j < sana; j++){
					summa += re.nextInt();
				}
				System.out.println(summa);
				System.out.println("Sanasi oli palindromi: " + onkoPalindromi(s)); //oliko sana palindromi?
			}
			else{System.out.println("Etsimaasi demoa ei loytynyt. Yrita uudelleen.");}
			re.close();
		}
		catch(Exception e){System.out.println("Jokin meni pieleen, yrita uudelleen!");}
	}
	
	public static boolean onkoPalindromi(String m){
		String g = new StringBuilder(m).reverse().toString();
		int ml = m.length();
		if (m.equals(g)){
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
		char[] ok = {'1','2','3','4','5','6','7','8','9','0','ä','Ä','ö','Ö','å','Å'};
		for (int i = 0; i < m.length(); i++){
			if ((int)Character.toLowerCase(m.charAt(i)) <= 122 && (int)Character.toLowerCase(m.charAt(i)) >= 97){
				g += m.charAt(i);
			}
			boolean contains = false;
			for (char c : charArray) {
    				if (c == m.charAt(i)) {
        				contains = true;
        				break;
    				}
			}
			if (!contains){
				g += m.charAt(i);
			}
			else { g += " ";}
		}
		return g;
	}
}

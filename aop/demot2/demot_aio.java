import java.util.Scanner;

public class demot_aio{
	
	public static int fibonacci(int n){ //fibonaaccin luvun laskeva metodi
		if (n <= 1){return 1;}
		else {return (fibonacci(n-1) + fibonacci(n-2));}
	}

	public static String sis(String s){
		String s2 = "";
		for (int i = 0; i < s.length(); i++){
			if (s2.indexOf(s.charAt(i)) == -1){ //tarkistetaan onko sen hetkinen merkki jo uudessa jonossa
				for (int j = 0; j < s.length(); j++){
					if (s.charAt(i) == s.charAt(j)){
						s2 += s.charAt(j);
					}
				}						
			}
		}
		return s2;
	}

	public static String unic(String a, String b, String s){
		String g = "";
		for (int i = 0; i < s.length(); i++){
			if (a.indexOf(s.charAt(i)) == -1 && b.indexOf(s.charAt(i)) == -1){
				g += s.charAt(i);
			}
		}return g;
	}

	public static void main(String[] args){
		try{
			Scanner re = new Scanner(System.in);
			System.out.print("Valitse demotehtava: ");
			int demo = re.nextInt();
			re.nextLine();
			System.out.println("------------------------");
			if (demo == 1){
				System.out.print("Syota kokonaisluku n: ");
				int f = re.nextInt();
				System.out.println("------------------------");
				for (int i = 0; i < f; i++){
					System.out.print(fibonacci(i) + " ");
					System.out.print((i+1)*(i+1) + " ");
				}
			}
			else if (demo == 2){
				System.out.print("Syota merkkijono: ");
				String m = re.nextLine();
				System.out.print("Syota numero: ");
				int e = re.nextInt();
				System.out.println("------------------------");
				String c = "";
				for (int i = 0; i < m.length();i++){
					if ((int)Character.toLowerCase(m.charAt(i)) <= 122 && (int)Character.toLowerCase(m.charAt(i)) >= 97){ //tarkistetaaan etta syotetty merkki on kirjain ASCII -taulukossa
						if ((int)Character.toLowerCase(m.charAt(i)+e%26) > 122){
							c += (char)((int)Character.toLowerCase(m.charAt(i))+e%26-26);
						}
						else{
							c += (char)((int)Character.toLowerCase(m.charAt(i))+e%26);
						}
					}
					else if ((int)Character.toLowerCase(m.charAt(i)) == 32){c += " ";}
					else{System.out.println("Syottamasi merkki ei ollut kirjain.");}
				}
				System.out.println("Salakirjoitettu merkkijono: " + c);
			}
			else if (demo == 3){
				System.out.print("Syota pariton positiivinen kokonaisluku: ");
				int k = re.nextInt();
				System.out.println("------------------------");
				if (k%2 != 0 && k > 0){
					for (int i = 0; i <= k/2; i++){ //tulostetaan salmiakin ylaosa
						for (int z = 0; z < (k/2-i); z++){
							System.out.print(" ");
						}
						for (int g = 0; g <= 2*i; g++){
							System.out.print("*");
						}
						for (int d = 0; d < (k/2-i); d++){
							System.out.print(" ");
						}
						System.out.println();
					}
					for (int i = k/2; i > 0; i--){ //tulostetaan salmiakin alaosa
						for (int z = k/2+1; z > i; z--){
							System.out.print(" ");
						}
						for (int z = k/2+1; z > ((k/2+2)-2*i); z--){
							System.out.print("*");
						}
						for (int z = k/2+1; z > i; z--){
							System.out.print(" ");
						}
						System.out.println();
					}
				}else{System.out.println("Syottamasi luku ei ole parillinen ja/tai postiivinen kokonaisluku.");}
			}
			else if (demo == 4){
				System.out.print("Syota merkkijono: ");
				String s = re.nextLine();
				System.out.println("------------------------");
				System.out.println("Uusi merkkijono: " + sis(s));
			}
			else if (demo == 5){
				System.out.print("Syota merkkijono A: ");
				String a = re.nextLine();
				System.out.print("Syota merkkijono B: ");
				String b = re.nextLine();
				System.out.print("Syota merkkijono C: ");
				String c = re.nextLine();
				System.out.println("------------------------");
				System.out.println("Uniikit merkit merkkijonossa A: " + unic(b,c,a));
				System.out.println("Uniikit merkit merkkijonossa B: " + unic(a,c,b));
				System.out.println("Uniikit merkit merkkijonossa C: " + unic(a,b,c));
			}
			else if (demo == 6){
				System.out.print("Ks. tiedosto demo26.java");
			}
			else{System.out.println("Etsimaasi demoa ei loytynyt. Yrita uudelleen.");}
			re.close();
		}
		catch(Exception e){System.out.println("Jokin meni pieleen, yrita uudelleen!");}
	}
}

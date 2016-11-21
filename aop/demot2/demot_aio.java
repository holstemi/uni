import java.util.Scanner;
import java.lang.Math;

public class demot_aio{
	
	public static void main(String[] args){
		try{
			Scanner re = new Scanner(System.in);
			System.out.print("Valitse demotehtava: ");
			int demo = re.nextInt();
			re.nextLine();
			System.out.println("------------------------");
			if (demo == 1){
				System.out.print("Syota kokonaisluku n: ");
				int n = re.nextInt();
				System.out.println("------------------------");
				
				public static int fibonacci(int n){
					if (n <= 1){return n;}
					else {return fibonacci(n-1) + fibonacci(n-2);}
				}
				
				for (int i = 0; i <= n; i++){
					System.out.print(fibonacci(i) + " ");
					System.out.print(i*i + " ");
				}
			}
			else if (demo == 2){
				System.out.print("Syota merkkijono: ");
				String m = re.nextLine();
				System.out.print("Syota numero: ");
				int e = re.nextInt();
				System.out.println("------------------------");
				String c;
				for (int i = 0; i <= m.length();i++){
					if ((int)m.charAt(i).toLowercase()+e < 123 && (int)m.charAt(i).toLowercase()+e > 96){
						c += (char)((int)m.charAt(i).toLowercase()+e);
					}
					else if ((int)m.charAt(i).toLowercase()+e > 122){
						c += (char)((int)m.charAt(i).toLowercase()+e-25);
					}
					else{System.out.println("Syottamasi merkki ei ollut kirjain.");}
				}
				System.out.println(c);
			}
			else if (demo == 3){
				System.out.print("Syota pariton positiivinen kokonaisluku: ");
				int k = re.nextInt();
				System.out.println("------------------------");
				if (k%2 != 0 && k > 0){
					for (int i = 0; i <= k; i++){
						for (int j = 0; j <= 2*i-1; j++){
							System.out.print("*");
						}
					}
				}else{System.out.println("Syottamasi luku ei ole parillinen ja/tai postiivinen kokonaisluku.");}
			}
			else if (demo == 4){
				System.out.print("Syota merkkijono: ");
				String s = re.nextLine();
				System.out.println("------------------------");
				
			}
			else if (demo == 5){
				System.out.print("Syota merkkijono A: ");
				String a = re.nextLine();
				System.out.print("Syota merkkijono B: ");
				String b = re.nextLine();
				System.out.print("Syota merkkijono C: ");
				String c = re.nextLine();
				System.out.println("------------------------");
				
			}
			else if (demo == 6){
				System.out.print("Ks. tiedosto demo26.java");
			}
			else{System.out.println("Etsimaasi demoa ei loytynyt. Yrita uudelleen.");}
			lukija.close();
		}
		catch(Exception e){System.out.println("Jokin meni pieleen, yrita uudelleen!");}
	}
}

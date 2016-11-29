mport java.util.Scanner;

public class demot3_aio{
	
	public static boolean onkoPalindromi(String m){
		String g = "";
		int ml = m.length();
		//if (ml%2 = 0){
			for (int i = ml; i > ml/2; i--){
				g += m.charAt(i);
			}
		//}
		if (m.substring(0,ml).equals(g)){
			return true;
		}
		else{return false;}
	}

	public static void main(String[] args){
		try{
			Scanner re = new Scanner(System.in);
			System.out.print("Valitse demotehtava: ");
			int demo = re.nextInt();
			re.nextLine();
			System.out.println("------------------------");
			if (demo == 1){
				System.out.print("Syota merkkijono: ");
				string s = re.nextLine();
				System.out.println("------------------------");
				System.out.println(onkoPalindromi(s);)
			}
			else if (demo == 2){
				
			}
			else if (demo == 3){
				System.out.print("Ks. tiedosto demo33.java");
			}
			else if (demo == 4){
				
			}
			else if (demo == 5){
				
			}
			else if (demo == 6){
				
			}
			else{System.out.println("Etsimaasi demoa ei loytynyt. Yrita uudelleen.");}
			re.close();
		}
		catch(Exception e){System.out.println("Jokin meni pieleen, yrita uudelleen!");}
	}
}

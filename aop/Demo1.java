import java.util.Scanner;
import java.Math;

public class Demo1{
	
	public static void main(String[] args){
		Scanner lukija = new Scanner(System.in);
		System.out.print("Valitse demotehtava (ei 3): ");
		int demo = lukija.nextInt();
		lukija.nextLine();
		if (demo == 1){
			String s1 = lukija.nextLine();
			String s2 = lukija.nextLine();
			String s3 = lukija.nextLine();
			if ((s1.length() < s2.length())&&(s1.length() < s3.length())){
				System.out.println(s1);
			}
			else if ((s2.length() < s1.length())&&(s2.length() < s3.length())){
				System.out.println(s2);
			}
			else{System.out.println(s3);}
		}
		else if (demo == 2){
			int svuosi = lukija.nextInt();
			String ika;
			if (2015 - svuosi < 18){ika = "Alaikainen";}
			else {ika = "Taysi-ikainen";}
			System.out.println("Vuoden 2015 lopussa olit: " + ika);
		}
		else if (demo == 4){
			String mail = lukija.nextLine();
			int mp = mail.indexOf('@');
			int pit = mail.length();
			String dom = mail.substring(mp+1,pit);
			System.out.println(dom);
		}
		else if (demo == 5){
			int a = lukija.nextInt();
			int b = lukija.nextInt();
			int c = lukija.nextInt();
			double disk = b*b-4*a*c
			if (disk > 0){
				System.out.println((-b+Math.sqrt(disk))/(2*a));
				System.out.println((-b-Math.sqrt(disk))/(2*a));
			}else{System.out.println("Kahta reallijuurta ei loytynyt");}
		}
		else if (demo == 6){
			
		}
		else{
			System.out.println("Etsimaasi demoa ei loytynyt. Yrita uudelleen.");
		}
		lukija.close();
	}
}

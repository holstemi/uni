import java.lang.Math;
import java.util.Scanner;

public class demo26 {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Anna kaksi lukua:");
		int a = s.nextInt();
		if(a < 0){
			System.out.println("Luvun t�ytyy olla positiivinen. Anna uusi luku:");
			a = s.nextInt();			
		}
		
		System.out.println("Kiitos! Anna seuraava luku:");
		int b = s.nextInt();
		
		System.out.println(Math.sqrt(a)); //tulostetaan ensimmaisen luvun neliojuuri
		System.out.println("----");
		
		int temp = 0;

		for (int i = 0; i < 4; i++){
			if(a > 0){
				temp = a; //tallennetaan a:n arvo valiaikaismuuttujaan
				a = b%a; //a on b:n jakojaannos a:lla
				b = temp; //b saa a:n alkuperaisen arvon
			}
		}
		
		temp = b;
		System.out.println(b);
	
		for (int i = 0; i < 2;i++){
			if(temp > 0){
				System.out.println(--temp);
			}
		}
		if(temp > 0){
			temp = temp-2;
			System.out.println(temp);
		}
		if(temp > 0){
			int x = --temp;
			System.out.println(x);
			temp--;
		}
		if(temp > 0){
			System.out.println(temp);
			System.out.println(--temp);
		}
	}
}

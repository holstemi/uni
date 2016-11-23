import java.lang.Math

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
		
		System.out.println(Math.sqrt(a));
		System.out.println("----");
		
		int temp = a;
		temp = a;
		a = b%a;
		b = temp;
		for (int i = 0; i < 3; i++){
			if(a > 0){
				temp = a;
				a = b%a;
				b = temp;
			}
		}
		
		temp = b;
		System.out.println(b);
	
		if(temp > 0){
			System.out.println(--temp);
		}
		if(temp > 0){
			int luku = temp;
			luku = luku-1;
			System.out.println(luku);
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
		}
		if(temp > 0){
			temp -= 1;
			System.out.println(temp);
		}
	}
}

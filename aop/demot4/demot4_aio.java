import java.util.Scanner;
import java.lang.StringBuffer;
import java.util.Random;

import java.util.ArrayList;

public class demot4_aio{
	
	public static void main(String[] args){
		try{
			Scanner re = new Scanner(System.in);
			System.out.print("Valitse demotehtava: ");
			int demo = re.nextInt();
			re.nextLine();
			System.out.println("------------------------");
			Random rd = new Random();

			if (demo == 1){
				int g = re.nextInt();
				int x = re.nextInt();
				int[] taulu = new int[x];
				tulostaTaulu(lisaaTaulukkoon(taulu,g));
			}
			else if (demo == 2){
				int[] a = {2,5,7,0};
				int[] b = {7,3,2,8};
				tulostaTaulu(vertaaTaulu(a,b));
			}
			else if (demo == 3){
				int[] taulu = new int[rd.nextInt(200)];
				for(int i = 0; i < taulu.length;i++){
					taulu[i] = rd.nextInt(200);
				}
				int[] jalkeen = satunnainenMiinus(rd,taulu);
				vertaileTauluja(taulu,jalkeen);

			}
			else if (demo == 4){
				System.out.print("Ks. tiedosto demo44.java");
			}
			else if (demo == 5){
				int[] taulu1 = new int[rd.nextInt(20)];
				int[] taulu2 = new int[rd.nextInt(20)];
				for(int i = 0; i < taulu1.length;i++){
					int y = 0;
					for(int j = 0; j < 200; j++){
						y = rd.nextInt(200);
						if (y%2 == 0){
							if(y%4 != 0){
								break;
							}
						}
					}
					taulu1[i] = y;
				}for(int i = 0; i < taulu2.length;i++){
					int y = rd.nextInt(200);
					if(y%2 == 0 && y%4 != 0){
						taulu2[i] = y;
					}
				}
				if(taulu1.length == taulu2.length){
					boolean g = true;
					for (int i = 0; i < taulu1.length; i++){
						if(taulu1[i] != taulu2[i]){g = false; break;}
					}
					System.out.println(g);
				}
				else{
					if(taulu1.length < taulu2.length){tulostaTaulu(taulu1);}
					else{tulostaTaulu(taulu2);}

				}
			}
			else if (demo == 6){
				
			}
			else{System.out.println("Etsimaasi demoa ei loytynyt. Yrita uudelleen.");}
			re.close();
		}
		catch(Exception e){System.out.println("Jokin meni pieleen, yrita uudelleen!");}
	}

	public static int[] lisaaTaulukkoon(int[] t, int n){
		int j = 0;
		for (int i = 0; i <= n; i++){
			if (j < t.length){
				t[j] = i;
				j++;
			}
			else{
				j = 0;
				t[j] = i;
				j++;
			}
		}
		return t;
	}

	public static int[] satunnainenMiinus(Random rd, int[] taulu){
		int k = rd.nextInt(2)+1;
		int[] temp = new int[taulu.length];
		for (int i = 0; i < taulu.length; i++){
			temp[i] = taulu[i];
		}
		for (int i = 0; i < k; i++){
			temp[rd.nextInt(taulu.length)] = -1;
		}
		return temp;
	}

	public static void vertaileTauluja(int[] before, int[] after){
		tulostaTaulu(before);
		tulostaTaulu(after);
		for (int i = 0; i < after.length; i++){
			if (before[i] != after[i]){System.out.println(before[i]);}
		}
	}

	public static int[] vertaaTaulu(int[] a, int[] b){
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a.length; j++){
				if (b[i] == a[j]){b[i]=0;}
			}
		}
		return b;
	}

	public static void tulostaTaulu(int[] t){
		for (int i = 0; i < t.length; i++){
			if (i != t.length -1){System.out.print(t[i]+",");}
			else{System.out.print(t[i]);}
		}
		System.out.println();
	}
}

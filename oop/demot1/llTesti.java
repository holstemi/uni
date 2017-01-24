import java.util.ArrayList;
import java.util.Random;

public class llTesti{
	public static void main(String[] args){
		ArrayList<Integer> testi = new ArrayList<Integer>();
		Random rnd = new Random();
		for (int i = 0; i < 10; i++){
			testi.add(rnd.nextInt(10));
		}
		linkitettyLista ll = new linkitettyLista();
		ll.asetaLista(testi);
		testaa(ll.annaLista());
		ll.poistaArvo(4);
		print(ll.annaSeuraavaIndex(3));
		testaa(ll.annaLista());
		ll.lisaaArvo(3,2);
		testaa(ll.annaLista());
		print(ll.etsiArvo(7));
	}

	public static void print(int a){
		System.out.println(a);
	} 

	public static void testaa(ArrayList<Integer> a){
		for (int i = 0; i < a.size(); i++){
			print(a.get(i));	 
		}
		System.out.println("-------------");
	}
}

import java.lang.Thread;
import java.util.ArrayList;
public Tyokalupakki{
	ArrayList<Tyokalupakki> tyokalut = new ArrayList<Tyokalupakki>();
	boolean onTeroitettavissa();
	boolean onLadattavissa();
	
	protected void lataaAkku(){
		if(onLadattavissa){
			System.out.println("Akkua ladataan, odota hetki...");
			Thread.sleep(1000);
			System.out.println("Akku ladattu!");
		}
	}
	
	protected void teroita(){
		if(onTeroitettavissa){
			System.out.println("Teroitetaan, odota hetki...");
			Thread.sleep(1000);
			System.out.println("Teroitus valmis!");
		}
	}
	protected String aani(){
	return "aani";
	}
}

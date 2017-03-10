package flappy;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Hiscore { //KESKENERÄINEN
	
	public void write(String s) throws FileNotFoundException{ //tallentaa tiedostoon, muttei tarkista korkeinta tulosta
		try(PrintWriter out = new PrintWriter("hiscore.txt")){
		    out.println(s);
		}
	}
	
}

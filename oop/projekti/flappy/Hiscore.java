package flappy;

import java.io.*;

public class Hiscore { //TEORIASSA TOIMII
	
	public void write(int t) throws FileNotFoundException{
		File f = new File("score.txt");
		if(!f.exists()){
			try(PrintWriter out = new PrintWriter("score.txt")){
			    out.println(t);
			}
		}
		else{
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader("score.txt"));
			try {
				String rivi = br.readLine();
				int hi = Integer.parseInt(rivi);
				if(hi >= t){
					FileWriter wr = new FileWriter(f, false); // false to overwrite.
					wr.write(t);
					wr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

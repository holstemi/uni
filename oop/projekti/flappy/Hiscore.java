package flappy;

import java.io.*;

public class Hiscore { //TEORIASSA TOIMII
	
	/**
	 * 
	 * HISCORE -OLIO
	 * 	
	 * @param t			P‰‰ttyneen pelin tulos
	 * @return			Paras tulos, joka saavutettu peliss‰
	 * @throws FileNotFoundException
	 */
	
	public static int check(int t) throws FileNotFoundException{
		File f = new File("score.txt");
		if(!f.exists()){
			try(PrintWriter out = new PrintWriter("score.txt")){
			    out.println(t);
			    return t;
			}
		}
		else{
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader("score.txt"));
			try {
				String rivi = br.readLine();
				int hi = Integer.parseInt(rivi);
				if(hi <= t){
					FileWriter wr = new FileWriter(f, false); //set 2nd param. false to overwrite.
					wr.write(t);
					wr.close();
					return t;
				}
				else{
					return hi;
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return t;
		
	}
	
}

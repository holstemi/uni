package flappy2;

import java.io.*;

public class Highscore {
	
	/**
	 * 
	 * HISCORE -OLIO
	 * 	
	 * @param t			P‰‰ttyneen pelin tulos
	 * @param hi		Paras peliss‰ saavutettu tulos (tallennettu tiedostoon)
	 * @return			Paras tulos, joka saavutettu peliss‰
	 * @throws FileNotFoundException, IOExeption
	 */
	
	public static int check(int t) throws FileNotFoundException, IOException{
		File f = new File("score.txt");
	
		if(!f.exists()){
			try(PrintWriter out = new PrintWriter("score.txt")){
			    out.println(Integer.toString(t));
			    return t;
			}
		}
		else{
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader("score.txt"));
			try {
				String tmp = br.readLine();
				if(tmp == null | tmp.length() == 0){
					FileWriter wr = new FileWriter(f, false); //set 2nd param. false to overwrite.
					wr.write(Integer.toString(t));
					wr.close();
					return t;
				}
				else if(tmp != null){
					int hi = Integer.parseInt(tmp);
					if(hi <= t){
						FileWriter wr = new FileWriter(f, false); //set 2nd param. false to overwrite.
						wr.write(Integer.toString(t));
						wr.close();
						return t;
					}
					else{
						return hi;
						}
				}
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				try(PrintWriter out = new PrintWriter("score.txt")){
				    out.println(Integer.toString(t));
				    return t;
				}
			}
		
			catch (NumberFormatException e){
				e.printStackTrace();
				FileWriter wr = new FileWriter(f, false); //set 2nd param. false to overwrite.
				wr.write(Integer.toString(0));
				wr.close();
				return 0;
			}
		return t;
		}
	
	}
	
}

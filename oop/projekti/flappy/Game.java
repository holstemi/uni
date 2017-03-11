package flappy;

import java.io.FileNotFoundException;

public class Game {
	
	/**
	 * 
	 * GAME -OLIO
	 * 
	 * @param play		Onko peli käynnissä?
	 * @param score		Pelikerran tulos
	 * 
	 * Metodit:
	 * + Getterit ja setterit
	 */
	
	private boolean play;
	private int score;
	
	public Game(){
		setPlay(true);
		score = 0;
	}
	
	public void incScore(){
		score++;
	}
	public int getScore(){
		return score;
	}

	public boolean play() {
		return play;
	}

	public void setPlay(boolean play) {
		this.play = play;
		if(!play){
			try {
				Hiscore.check(score);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

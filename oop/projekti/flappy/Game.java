package flappy;


public class Game {
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
	}
}

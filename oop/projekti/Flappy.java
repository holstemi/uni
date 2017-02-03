public class Flappy{
	
	public static void main(String args[]){
		Game g = new Game();
		while(g.play){
			g.refresh();
			if(){
				g.gameOver();
			}
			Thread.sleep(100);
		}
	}
	
}

class Game{
	
	private char[][] field;
	private boolean play;
	
	public Game(){
		play = true;
		field = new char[10][20];
		spawnBird();
	}
	
	public void refresh(){
		for (int i = 0; i < 50; ++i){System.out.println();} //clear screen
		for (char[] y : field){ //topmost array
			for (int i = y.length; i >= 0; i--){ //rightmost column
				System.out.print(x);
			}
		}
	}
	
	public void gameOver(){
		play = false;
	}
	
	public void spawnBird(){
		field[5][10] = '@'; //alustetaan lintu
	}
}
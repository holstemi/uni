public class Flappy{
	
	public static void main(String args[]){
		Game g = new Game();
		while(g.play){
			g.refresh();
			if(){
				g.gameOver();
			}
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
		for (int y = 0; y < field.length; y++){
			System.out.print("|");
			for (char x : field[y]){
				System.out.print(x);
			}
			System.out.println("|")
		}
	}
	
	public void gameOver(){
		play = false;
	}
	
	public void spawnBird(){
		field[5][10] = '@'; //alustetaan lintu
	}
}
import java.util.Scanner;

public class Flappy{
	
	public static void main(String args[]){
		Game g = new Game(20,40,1);
		while(g.play){
			try{
				g.refresh();

				if(g.sc.hasNext()){
					String tmp = g.sc.next();
					if(tmp.equals(" ")){
						g.b.y++;
					}
				}

				//g.b.y++;
				g.count++;
				Thread.sleep(1000/g.fps); //inverse of refresh rate
				if(g.count > 5){
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("Game over");
				g.play = false;
			}
		}
		g.sc.close();
	}
	
}

class Game{
	
	private String[][] field;
	boolean play;
	int count;
	Scanner sc;
	Bird b;
	int fps;
	
	public Game(int row, int col, int fps){
		play = true;
		field = new String[row][col];
		b = new Bird(row/2, col/3);
		sc = new Scanner(System.in);
		this.fps = fps;
	}
	
	public void refresh(){
		for (int i = 0; i < 50; ++i){System.out.println();} //clear screen
		clear(); //clear field
		field[b.y][b.x] = "@"; //palce bird
		printField();
	}

	public void printField(){
		for (int y = 0; y < field.length; y++){
			for (int x = 0; x < field[y].length; x++){
				System.out.print(field[y][x]);
			}
			System.out.println();
		}
	}

	public void clear(){
		for(int y = 0; y < field.length; y++){
			for(int x = 0; x < field[y].length; x++){
				field[y][x] = ".";
			}
		}
	}
}

class Bird{

	int y;
	int x;

	Bird(int y, int x){
		this.y = y;
		this.x = x;
	}
}

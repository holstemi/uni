import java.util.Scanner;

public class Flappy{
	
	public static void main(String args[]){
		Game g = new Game();
		while(g.play){
			try{
				g.refresh();
				/*int tmp = 0;
				while(!g.sc.nextLine().equals(" ") && tmp == 0){
					g.b.y--;
					tmp = 1;
				}
				while(g.sc.nextLine().equals(" ") && tmp == 1){
					g.b.y++;
					tmp = 2;
				}*/
				g.b.y++;
				g.count++;
				Thread.sleep(1000);
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
	
	public Game(){
		play = true;
		spawnGame(20,40);
		sc = new Scanner(System.in);
	}
	
	public void refresh(){
		for (int i = 0; i < 50; ++i){System.out.println();} //clear screen
		clear(); //clear field
		field[Bird.y][Bird.x] = "@"; //palce bird
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

	public void spawnGame(int row, int col){
		field = new String[row][col];
		for(int y = 0; y < field.length; y++){
			for(int x = 0; x < field[y].length; x++){
				field[y][x] = ".";
			}
		}
		b = new Bird(row/2, col/3);
		
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
	static int y;
	static int x;

	Bird(int y, int x){
		this.y = y;
		this.x = x;
	}
}

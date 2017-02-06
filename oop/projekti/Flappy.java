import java.util.Scanner;
import java.lang.Thread;

public class Flappy{
	
	public static void main(String args[]){
		if(args[0] == null){Game g = new Game(20,40,1);}
		else{Game g = new Game(20,40,args[0]);}
		Input in = new Input();
		while(g.play){
			try{
				in.start();
				g.refresh();
				
				if(in.Status() == WAITING){
					g.b.y--;
				}else{g.b.y++;}
				
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
	Bird b;
	int fps;
	
	public Game(int row, int col, int fps){
		play = true;
		field = new String[row][col];
		b = new Bird(row/2, col/3);
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

class Input extends Thread{
	Scanner sc;
	
	public Input(){
		sc = new Scanner(System.in);
		String a = sc.nextLine();
	}
}

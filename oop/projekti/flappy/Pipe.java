package flappy;

import java.awt.Rectangle;
import java.util.Random;

public class Pipe extends Rectangle { //PITÄISI TOIMIA

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Rectangle up;
	private Rectangle down;
	
	public Pipe(){
		Random r = new Random();
		int var = r.nextInt(375);
		setUp(new Rectangle(800,0,10,var)); //Syntax: Rectangle(vas_yläkulma_x, vas_yläkulma_y, leveys, korkeus) - Jframessa indexit kasvaa ilmeisesti samoin kuin matriiseissakin
		setDown(new Rectangle(800,var,10,var));
	}


	public Rectangle getDown() {
		return down;
	}

	public void setDown(Rectangle down) {
		this.down = down;
	}

	public Rectangle getUp() {
		return up;
	}

	public void setUp(Rectangle up) {
		this.up = up;
	}
	
	public void move(int x){
		up.setLocation((int)(this.getX()-x), (int)(this.getY())); //setLocation(int x, int y) - Moves this Rectangle to the specified location.
		down.setLocation((int)(this.getX()-x), (int)(this.getY()));
	}
}

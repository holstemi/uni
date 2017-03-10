package flappy;

import java.awt.Rectangle;
import java.util.Random;

public class Pipe extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Rectangle up;
	private Rectangle down;
	private int vx;
	
	public Pipe(){
		Random r = new Random();
		int var = r.nextInt(375);
		setUp(new Rectangle(800,0,40,var)); //Syntax: Rectangle(vas_yläkulma_x, vas_yläkulma_y, leveys, korkeus) - Jframessa indexit kasvaa ilmeisesti samoin kuin matriiseissakin
		setDown(new Rectangle(800,var,40,var));
		vx = 10;
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

	public int getVX() {
		return vx;
	}

	public void setVX(int vx) {
		this.vx = vx;
	}
	
	public void move(){
		up.setLocation((int)(this.getX()-vx), (int)(this.getY())); //setLocation(int x, int y) - Moves this Rectangle to the specified location.
		down.setLocation((int)(this.getX()-vx), (int)(this.getY()));
	}
}

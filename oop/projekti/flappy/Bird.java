package flappy;

import java.awt.*;

public class Bird {
	private int y;
	private int x;
	private int vy;
	private int vx;
	public Image lintu;

	public Bird(){
		lintu = Toolkit.getDefaultToolkit().getImage("lintu.png"); //linnun kuva puuttuu viel‰
		x = 400;
		y = 400;
	}

	public void jump(){
		setVY(5); //t‰t‰ s‰‰dett‰v‰ viel‰ valittavan kuvan koon mukaan
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getVY() {
		return vy;
	}

	public void setVY(int vy) {
		this.vy = vy;
	}

	public int getVX() {
		return vx;
	}

	public void setVX(int vx) {
		this.vx = vx;
	}
}

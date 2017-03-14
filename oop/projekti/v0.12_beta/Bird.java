package flappy;

import java.awt.*;

public class Bird {
	
	/**
	 * 
	 * LINTU -OLIO
	 * 
	 * @param y						Linnun sijainti y akselilla
	 * @param x						Linnun sijainti x akselilla (vakio)
	 * @param vy 					Linnun nopeus y-suunnassa (ei käytössä tällä hetekellä)
	 * @param lintu					Linnun custom kuva
	 * 
	 * Metodit:
	 * + Getterit ja seterit
	 * + move(int amount)			Siirtää lintua y -suunnassa amount verran
	 */
	
	private int y;
	public final int x;
	//private int vy;
	public Image lintu;

	public Bird(){
		lintu = Toolkit.getDefaultToolkit().getImage("lintu.png"); //HUOM! linnun kuva puuttuu vielä
		x = 300;
		y = 400;
		//vy = -5;
	}

	public void move(int amount){
		setY(this.y + amount);
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	/*public int getVY() {
		return vy;
	}

	public void setVY(int vy) {
		this.vy = vy;
	}*/
	

}

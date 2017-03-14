package flappy;

public class Flappy{
	
	/**
	 * 
	 * MAIN -LUOKKA, JOSSA AJATEAAN OHJELMA
	 * 
	 * @param args
	 */
	
	public static void main(String args[]){
		Game g = new Game();
		Bird b = new Bird();
		Pipe p = new Pipe();
		while(g.play()){
			
			try{
				checkHit(g,b,p);
				
				//SCREEN REFERSH TÄHÄN
				
				moveStuff(b,p);
				if(!g.play()){
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("Game over. Score: " + g.getScore()); //HEITTÄÄ GAME OVER RUUDUN JA NÄYTTÄÄ SCOREN
			}
		}
	}
	
	public static void checkHit(Game g, Bird b, Pipe p){ //tarkistetaan onko lintu osunut putkeen
		if(b.x >=  p.getUp().getX() && b.x <= (p.getUp().getX() + p.getUp().getWidth())){
			if(b.getY() <= p.getDown().getY() || b.getY() >= p.getUp().height){
				g.setPlay(false); //osuma --> asetetaan peli loppumaan
			}
			g.incScore(); //lintu menee putkien välistä, joten tulos paranee (HUOM: putken leveys nyt 10)
		}
	}
	
	public static void moveStuff(Bird b, Pipe p){
		if(true){ //TÄHÄN: jos saatu inputtia näppäimistöltä
			b.move(20);
		}  
		else{b.move(-5);}
		p.move(10); //putki liikkuu aina esimerkiksi 10 koordinaattia x suunnassa
		//Se, että mitä taphtuu jos lintu lentää liian ylös tai kun putki ajautuu ulos näytöstä, ei ole vielä handlattu
	}
}
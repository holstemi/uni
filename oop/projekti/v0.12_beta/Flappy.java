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
				
				//SCREEN REFERSH T�H�N
				
				moveStuff(b,p);
				if(!g.play()){
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("Game over. Score: " + g.getScore()); //HEITT�� GAME OVER RUUDUN JA N�YTT�� SCOREN
			}
		}
	}
	
	public static void checkHit(Game g, Bird b, Pipe p){ //tarkistetaan onko lintu osunut putkeen
		if(b.x >=  p.getUp().getX() && b.x <= (p.getUp().getX() + p.getUp().getWidth())){
			if(b.getY() <= p.getDown().getY() || b.getY() >= p.getUp().height){
				g.setPlay(false); //osuma --> asetetaan peli loppumaan
			}
			g.incScore(); //lintu menee putkien v�list�, joten tulos paranee (HUOM: putken leveys nyt 10)
		}
	}
	
	public static void moveStuff(Bird b, Pipe p){
		if(true){ //T�H�N: jos saatu inputtia n�pp�imist�lt�
			b.move(20);
		}  
		else{b.move(-5);}
		p.move(10); //putki liikkuu aina esimerkiksi 10 koordinaattia x suunnassa
		//Se, ett� mit� taphtuu jos lintu lent�� liian yl�s tai kun putki ajautuu ulos n�yt�st�, ei ole viel� handlattu
	}
}
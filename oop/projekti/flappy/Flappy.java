package flappy;

public class Flappy{
	
	public static void main(String args[]){
		Game g = new Game();
		Bird b = new Bird();
		Pipe p = new Pipe();
		while(g.play()){
			
			try{
				moveStuff(b,p);
				checkHit(g,b,p);
				//SCREEN REFERSH TÄHÄN
				
				//jtn koodia
				
				
				if(!g.play()){
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("Game over"); //HEITTÄÄ GAME OVER RUUDUN
			}
		}
	}
	
	public static void checkHit(Game g, Bird b, Pipe p){ //tarkistetaan onko lintu osunut putkeen
		if(b.x >=  p.getUp().getX() && b.x <= (p.getUp().getX() + p.getUp().getWidth())){
			if(b.getY() <= p.getDown().getY() || b.getY() >= p.getUp().height){
				g.setPlay(false); //osuma --> asetetaan peli loppumaan
			}
			g.incScore();
		}
	}
	
	public static void moveStuff(Bird b, Pipe p){
		if(gotInput()){ //TÄHÄN: jos saatu inputtia näppäimistöltä
			b.move(20);
		}  
		else{b.move(-5);}
		p.move(10); //putki liikkuu aina esimerkiksi 10 koordinaattia x suunnassa
	}
}
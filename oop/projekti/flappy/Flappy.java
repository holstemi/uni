package flappy;

public class Flappy{
	
	public static void main(String args[]){
		Game g = new Game();
		Bird b = new Bird();
		Pipe p = new Pipe();
		while(g.play()){
			
			try{
				checkHit(g,b,p);
				//SCREEN REFERSH TÄHÄN
				
				//jtn koodia
				
				
				if(g.play()){ //virhe, korjaa
					throw new Exception();
				}
			}catch(Exception e){
				System.out.println("Game over"); //HEITTÄÄ GAME OVER RUUDUN
			}
		}
	}
	
	public static void checkHit(Game g, Bird b, Pipe p){ //tarkistetaan onko lintu osunut putkeen
		if(b.getX() >=  p.getUp().getX() && b.getX() <= (p.getUp().getX() + p.getUp().getWidth())){
			if(b.getY() <= p.getDown().getY() || b.getY() >= p.getUp().height){
				g.setPlay(false);
			}
		}
	}
	
}
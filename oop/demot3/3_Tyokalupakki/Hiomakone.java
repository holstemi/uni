public class Hiomakone extends Tyokalupakki{

public Hiomakone(){
	private String nimi = new String("Hiomakone");	
	tyokalut.add(this);
}
public boolean onTeroitettavissa(){
  return false;
  }
	public boolean onLadattavissa(){
  return true;
  }
	public String aani(){
	return "Viuuu";
	}

	
}

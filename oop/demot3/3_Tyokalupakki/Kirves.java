public class Kirves extends Tyokalupakki{
public Kirves(){
	private String nimi = new String("Kirves");
	tyokalut.add(this);
}
boolean onTeroitettavissa(){
  return true;
  }
	public boolean onLadattavissa(){
  return false;
  }
	public String aani(){
	return "Klops";
	}
}

}

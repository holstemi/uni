public class Puukko extends Tyokalupakki{
public Puukko(){
	private String nimi = new String("Puukko");
	tyokalut.add(this);
}
public boolean onTeroitettavissa(){
  return true;
  }
	public boolean onLadattavissa(){
  return false;
  }
	public String aani(){
	return "Shhs";
	}
}
}

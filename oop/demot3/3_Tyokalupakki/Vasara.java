public class Vasara extends Tyokalupakki{
public Vasara(){
	private String nimi = new String("Vasara");
	tyokalut.add(this);
}
public boolean onTeroitettavissa(){
  return false;
  }
	public boolean onLadattavissa(){
  return false;
  }
	public String aani(){
	return "Klop";
	}
}
}

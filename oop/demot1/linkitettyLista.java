import java.util.ArrayList;

class linkitettyLista{
	ArrayList<Integer> arvo;
	ArrayList<Integer> index;
	
	public linkitettyLista(){
		arvo = new ArrayList<Integer>();
		index = new ArrayList<Integer>();
	}

	public void asetaLista(ArrayList<Integer> arvo){
		this.arvo = arvo;
		for (int i = 0; i < arvo.size()-2; i++){
			index.add(i+1);
		}
		index.add(arvo.size()-2,0);
	}

	public void lisaaArvo(int index, int arvo){
		this.arvo.add(index,arvo);
		this.index.add(index, this.index.get(index-1));
		this.index.set(index-1, index);	 
	}

	public void poistaArvo(int index){
		arvo.remove(index);
		this.index.set(index-1, this.index.get(index));
		this.index.remove(index);
	}

	public int etsiArvo(int arvo){
		for (int i = 0; i < this.arvo.size(); i++){
			if(arvo == this.arvo.get(i)){
				if (i == 0){return 0;}
				else{
					return this.index.get(i-1);
				}
			}	 
		}
		return 404;	 
	}
	
	public int annaSeuraavaIndex(int index){
		return this.index.get(index);	 
	}

	public int annaArvo(int index){
		return arvo.get(index);	 
	}
	public ArrayList<Integer> annaLista(){
		return arvo;	 
	}
	public ArrayList<Integer> annaIndex(){
		return index;	 
	} 

}

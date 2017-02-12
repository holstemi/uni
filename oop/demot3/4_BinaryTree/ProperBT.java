public class ProperBT<T>{
	
	private Node<T> root;
	private ArrayList<Node<T>[]> level;
	//int levels;
	
	public ProperBT<T>(){
		level = new ArrayList<Node[]>();
		root = null;
		Node<T>[] lvl_1 = new Node[1];
		level.add(lvl_1);
	}
	
	
	public void print(){
		Node now = root;
        if (now != null){
            System.out.println(now);
            altPrint(now.left);
            altPrint(now.right);
		}
	}
	
	public boolean altFind(T item){
		Node now = root;
		if (!now.getItem().equals(item)){
			try{
				altFind(now.left);
				altFind(now.right);
			}catch(Exception e){
				System.out.println("Item not found!");
				return false;
			}
		}
		else{
			System.out.println("Item found!");
			return true;
		}
	}
	
	public boolean add(T item){
		Node newNode = new Node(item);
		Node now = root;
		
		while(true){
			
			Node bottom = checkLeftBranch(now);
			
			if(bottom.right == null && bottom.left != null){
				bottom.right = newNode; 
				newNode.parent = bottom; 
				return true;
			}
			
			now = bottom;
			
			try{
				now = nextRightBranch(now);
			}catch(Exception e){
				now = root;
				for(now.left != null){
					now = now.left;
				}
				now.left = newNode;
				newNode.parent = now;
				return true;
			}
		}
	}
	
	public boolean find(T data){
		Node now = root;
		
		while(tmp.left != null){
			if(now.getItem().equals(data)){System.out.println("Item was found!"); return true;}
			else{now = now.left;}
		}
		while(true){
			if(now.getItem().equals(data)){System.out.println("Item was found!"); return true;}
			
			Node bottom = checkLeftBranch(now);
			
			now = bottom;
			if(now.getItem().equals(data)){System.out.println("Item was found!"); return true;}
			try{now = nextRightBranch(now);}
			catch(Exception e){System.out.println("Item not found!");return false;}
		}
	}
	
	public void print(){
		Node now = root;
		
		for(int i = 0; i < levels; i++){
			try{
				while(true){
					iteratePrint(now);
				}
			}catch(Exception e){
				System.out.println(); //rivinvaihto
				now = root;
				for(int j = 0; j <= i; j++){
					now = now.left;
				}
				System.out.print(now.getItem());
			}
		}
	}
	
	public void iteratePrint(Node now){
		now = nextRightBranch(now);
		for(int j = now.getLevel(); j <= i; j++){
			now = now.left;
		}
		System.out.print(now.getItem());
	}
	
	public Node nextRightBranch(Node x){
		Node tmp = x;
		while(tmp.parent.right.equals(tmp)){
			tmp = tmp.parent;
		}
		return tmp.parent.right;
	}
	
	public Node checkLeftBranch(Node x){
		Node now = x;
		while(now.left != null){
			if(now.right == null){return now;}
			else{now = now.left;}
		}
		return now;
	}
}

class Node<T>{
	private T item;
	Node<T> parent;
	Node<T> left;
	Node<T> right;
	
	public Node<T>(T item){
		this.item = item;
	}
	
	public T getItem(){
		return item;
	}
	
	public int getLevel(){
		int counter = 0;
		while(!parent.equals(root)){
			counter++;
		}
		return counter;
	}
}
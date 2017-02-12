public class BST<T>{
	
	private Node<T> root;
	int levels;
	
	public void print(){
		Node now = root;
        if (now != null){
            System.out.println(now);
            altPrint(now.left);
            altPrint(now.right);
		}
	}
	
	public void find(int id){ //BST:n lapikayntiin
		iterFind(id, root);
	}
	
	public Node iterFind(int id, Node now){
		if(now.getId()==id){
			System.out.println("Found!");
			return now;
		}
		else if(now.getId() < id && now.right.getId() > id){
			System.out.println("No nodes with such id in tree");
			return now;
		}
		else if(now.getId() > id){
			iterFind(id, now.left);
		}
		iterFind(id, now.right);
	}
	
	public boolean add(T item, int id){
		Node newNode = new Node(item, id);
		iterFind(id, root).right = newNode;
	}
	
	/*
	
	YLEISELLE PUULLE
	------------------------------------------------
	
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
	}*/
}

class Node<T>{
	private T item;
	private int id;
	Node parent;
	Node left;
	Node right;
	
	public Node<T>(T item, int id){
		this.item = item;
		this.id = id;
	}
	
	public T getItem(){
		return item;
	}
	
	public int getId(){
		return id;
	}
	
	public int getLevel(){
		int counter = 0;
		while(!parent.equals(root)){
			counter++;
		}
		return counter;
	}
}
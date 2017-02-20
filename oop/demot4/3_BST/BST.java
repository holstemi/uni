public class BST<T extends Comparable<T>>{
	
	private Node<T> root;
	//int levels;
	
	public BST(){
		root = null;
	}
	
	public void print(){
		iterPrint(root);
	}
	public void iterPrint(Node now){
		 if (now != null){
			iterPrint(now.left);
            System.out.println(now.getItem()+" ");
            iterPrint(now.right);
		}
	}
	
	public void find(int id){
		if(seek(id) != null){
			System.out.println("Item with given id not found!");
		}
		else{System.out.println("Found!");}
	}
	
	public Node seek(T item){ //BST:n lapikayntiin
		Node now = root;
		while(now != null){
			if(item.compareTo(now.getItem()) == 1 && now.left != null){
				now = now.right;
			}
			else if(item.compareTo(now.getItem()) == 1 && now.left == null){
				return now;
			}
			else if(item.compareTo(now.getItem()) == -1 && now.left != null){
				now = now.left;
			}
			else if(item.compareTo(now.getItem()) == -1 && now.left == null){
				return now;
			}
		}
		return null;
	}
	
	public void add(T item){
		Node newNode = new Node(item);
		if(root == null){root = newNode;}
		else{
			Node tmp = seek(item);
			if(tmp != null){
				if(item.compareTo(tmp.getItem()) == 1){
					newNode.left = tmp.left;
					tmp.left = newNode;
				}else{
					newNode.right = tmp.right;
					tmp.right = newNode;
				}
				System.out.println("add: ok");
			}else{System.out.println("add: error");}
		}
	}
}

class Node<T extends Comparable<T>>{
	private T item;
	//private int id;
	//Node parent;
	Node left;
	Node right;
	
	/*public Node(T item, int id){
		this.item = item;
		this.id = id;
	}*/
	
	public Node(T item){
		this.item = item;
	}
	
	public T getItem(){
		return item;
	}
	
	/*public int getId(){
		return id;
	}
	
	public int getLevel(){
		int counter = 0;
		while(!parent.equals(root)){
			counter++;
		}
		return counter;
	}*/
}

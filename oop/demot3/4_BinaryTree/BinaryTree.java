import java.lang.Math;

public class BinaryTree<T>{
	
	Node<T> root;
	int maxLevel;
	
	public BinaryTree(){
		maxLevel = 1;
	}
	
	public BinaryTree(T item){
		maxLevel = 1;
		root = new Node(item,0);
	}
	
	public void print(){
		Node now = root;
		while(now.next != null){
			System.out.println(now.giveItem());
			for(int i = 0; i < level; i++)System.out.print("/ \");
			now = now.next;
		}
		System.out.println(now.giveItem());
	}
	
	public void add(T item){
    		Node newNode = new Node(item);
			int level = 0;
			int maxOnLevel = 1;
			int onLevel = 1;
			if (root == null){
				root = newNode;
			}
    		else{
				Node now = root;
				while(now.left != null || now.right != null){
					now = now.left;
					level = now.lvl;
					maxOnLevel = Math.Pow(2,level);
				}
				if(now.left == null){now.left = newNode;}
				else if(now.right == null){onLevel++; now.right = newNode;}
				else{onLevel++; level--;}
				size++;
				System.out.println(item + " added to BinaryTree!");
			}
   	}
	
	public boolean findNodeWithData(T item){
		Node now = root;
		int counter = 0;
		while(now != null){
			if(now.giveItem().equals(item)){
				System.out.println("Found a node containing " + item + " at index " + counter);
				return true;
			}
			now = now.next;
			counter++;
		}
		System.out.println("Error: No node found with given data!");
		return false;
	}
	
	public goLeft(){
		while(now.left != null){
			now = now.left;
		}
	}
}

class Node<T>{
	private T item;
	int lvl;
	Node left;
	Node right;
	
	public Node(T item, int level){
		this.item = item;
		this.level = level;
	}
	
	public giveItem(){
		return item;
	}
}

import java.util.ArrayList;
import java.lang.Math;

public class BinaryTree<T>{
	
	private Node<T> root;
	private ArrayList<Node[]> level;
	
	public BinaryTree(){
		level = new ArrayList<Node[]>();
		root = null;
		Node[] lvl_1 = new Node[1];
		level.add(lvl_1);
	}
	
	public BinaryTree(T item){
		level = new ArrayList<Node[]>();
		root = new Node(item);
		Node[] lvl_1 = new Node[1];
		lvl_1[0] = root;
		level.add(lvl_1);
	}
	
	/*public void print(){
		Node now = root;
		while(now.next != null){
			System.out.println(now.giveItem());
			for(int i = 0; i < level; i++)System.out.print("/ \");
			now = now.next;
		}
		System.out.println(now.giveItem());
	}*/
	
	public boolean add(T item){
    	Node newNode = new Node(item);
		if (root == null){
			root = newNode;
			
		}
    	else{
			for(Node[] x : level){
				for(int i = 0; i < x.length; i++){
					if(x[i].left == null){x[i].left = newNode; return true;}
					else if(x[i].right == null){x[i].right = newNode; return true;}
				}
			}
			Node[] lvl_x = new Node[Math.Pow(2,level.size())];
			lvl_x[0] = newNode;
			level.add(lvl_x);
		}
   	}
	
	/*
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
			if(now.giveItem().equals(data)){System.out.println("Item was found!"); return true;}
			else{now = now.left;}
		}
		while(true){
			if(now.giveItem().equals(item)){System.out.println("Item was found!"); return true;}
			
			Node bottom = checkLeftBranch(now);
			
			now = bottom;
			if(now.giveItem().equals(item)){System.out.println("Item was found!"); return true;}
			try{now = nextRightBranch(now);}
			catch(Exception e){System.out.println("Item not found!");return false;}
		}
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
	*/
	
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
	//Node parent;
	Node left;
	Node right;
	
	public Node(T item){
		this.item = item;
	}
	
	public giveItem(){
		return item;
	}
}

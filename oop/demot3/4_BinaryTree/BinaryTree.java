import java.util.ArrayList;
import java.lang.Math;

public class BinaryTree<T>{
	
	private Node<T> root;
	private ArrayList<Node[]> level;
	//int levels;
	
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
	
	public void print(){
		Node now = root;
		for(Node[] x : level){
			for(int i = 0; i < x.length; i++){
				System.out.print(x[i].getItem());
			}
			System.out.println();
		}
	}
	
	public boolean add(T item){
    	Node newNode = new Node(item);
		if (root == null){
			root = newNode;
			Node[] tmp = level.get(0);
			tmp[0] = root;
		}
    	else{
			for(int j = 0; j < level.size(); j++){
				Node[] x = level.get(j);
				for(int i = 0; i < x.length; i++){
					if(x[i] == null){
						if(i%2 == 0){
							level.get(j-1)[i/2].left = newNode; return true;
						}
						else{level.get(j-1)[i/2].right = newNode; return true;}
					}
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
	*/
	
	public boolean find(T item){
		Node now = root;
		int counter = 0;
		while(now != null){
			if(now.getItem().equals(item)){
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
	
	public T getItem(){
		return item;
	}
	
	/*public int getLevel(){
		int counter = 0;
		while(!parent.equals(root)){
			counter++;
		}
		return counter;
	}
}

import java.util.ArrayList;
import java.lang.Math;

public class BinaryTree<T>{
	
	private Node<T> root;
	private ArrayList<Node<T>[]> level;
	
	public BinaryTree<T>(){
		level = new ArrayList<Node<T>[]>();
		root = null;
		Node<T>[] lvl_1 = new Node[1];
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
	
	/*
	public void altPrint(){
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
	*/
	
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
}

class Node<T>{
	private T item;
	Node left;
	Node right;
	
	public Node(T item){
		this.item = item;
	}
	
	public T getItem(){
		return item;
	}
}

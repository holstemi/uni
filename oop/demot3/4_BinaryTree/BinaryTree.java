import java.util.ArrayList;
import java.lang.Math;

public class BinaryTree<T>{
	
	private Node<T> root;
	private ArrayList<Node<T>[]> level;
	
	public BinaryTree(){
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
	*/
	
	public void find(T item){
		iterFind(item, root);
	}
	
	public boolean iterFind(T item, Node now){
		while(!now.getItem().equals(item)){
			try{
				iterFind(item, now.left);
				iterFind(item, now.right);
			}catch(Exception e){
				System.out.println("Item not found!");
			}
		}
		System.out.println("Item found!");
		return true;
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
			Node[] lvl_x = new Node[(int)Math.pow(2.0,level.size())];
			lvl_x[0] = newNode;
			level.add(lvl_x);
		}
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

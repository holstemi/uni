class LinkedList{
	
	Node head;
	int size;
	
	public LinkedList(int item){
		head = new Node(item);
		size = 0;
	}
	
	public void show(){
		Node now = head;
		while(now.next!=null){
			System.out.print(now.item+" -> ");
			item = item.next;
		}
		System.out.println(item.data);
	}
	
	public void add(int item){
		Node newNode = new Node(item,location);
		
	}
}

public class Node{
	int item;
	Node next;
	
	public Node(int item){
		this.item = item;
	}
}
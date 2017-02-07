public class LinkedList<Type>{
	
	Node<Type> first; //the first node
	Node<Type> last; //the last node
	int size; //size of the list
	
	public LinkedList(){
		size = 0;
	}
	
	public void print(){ //print what the LinkedList contains
		Node now = first;
		while(now.next != null){
			System.out.print(now.item + " -> ");
			now = now.next;
		}
		System.out.println(now.item);
	}
	
	public void add(Object item){ //add an item to the end of the list
    		Node newNode = new Node(item);
			if (first == null){
				first = newNode;
			}
    		else{
				Node now = first;
				while(now.next != null){
					now = now.next;
				}
				now.next = newNode;
				newNode.previous = now;
				size++;
				System.out.println(item + " added to the end of our LinkedList!");
			}
   	}
	
	public void addToIndex(Object item, int index){
		if(checkIndex(index)){
			Node newNode = new Node(item);
			Node now = first;
    			for(int i = 0; i < index-1; i++){
    				now = now.next;
    			}
    			newNode.next = now.next;
    			now.next = newNode;
			newNode.previous = now;
			newNode.next.previous = newNode;
    			size++;
    			System.out.println("Success! " + item + " added at index " + index);
    		}
    	}
	
	public boolean deleteNodeWithData(Object item){
		Node now = first;
		while(now != null){
			if(now.item.equals(item)){
				if(now.next != null){
					now.previous.next = now.next;
					now.next.previous = now.previous;
				}
				now.previous.next = null;
				now = null;
				size--;
				System.out.println("Success! The first occurrence of a node with data " + item + " deleted.");
				return true;
			}
			now = now.next;
		}
		System.out.println("Error: No node found with given data!");
		return false;
	}
	
	public void deleteNodeAtIndex(int index){
		if (index == 0){
			first = first.next;
			first.previous = null;
			size--;
			System.out.println("Success! Node at index " + index + " deleted.");
		}
		else if(checkIndex(index)){
			Node now = first;
			for(int i = 0; i < index; i++){
				now = now.next;
			}
			now.previous.next = now.next;
			now.next.previous = now.previous;
			now = null;
			size--;
			System.out.println("Success! Node at index " + index + " deleted.");
		}
	}
	
	public void findNodeAtIndex(int index){
		if(checkIndex(index)){
			Node now = first;
			for(int i = 0; i < index; i++){
				now = now.next;
			}
			System.out.println("Node at index contains: " + now.item);
		}
	}
	
	public boolean findNodeWithData(Object item){
		Node now = first;
		int counter = 0;
		while(now != null){
			if(now.item.equals(item)){
				System.out.println("Found a node containing " + item + " at index " + counter);
				return true;
			}
			now = now.next;
			counter++;
		}
		System.out.println("Error: No node found with given data!");
		return false;
	}
	
	public boolean checkIndex(int index){
		if(index > size || index < 0){
    			System.out.println("Error: index out of bounds!");
    			return false;
    		}
		return true;
	}
}

class Node<Type>{
	Type item;
	Node next;
	Node previous;
	
	public Node(Type item){
		this.item = item;
	}
}

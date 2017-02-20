public class Malliratkaisu{
	public static void main(String[] args) {
		LHM<String> t = new LHM<String>();
		t.put();
		t.get();
		t.remove();
		t.size();
	}
}

class LHM<T>{
	
	Node<T> first; //the first node
	Node<T> last; //the last node
	int size; //size of the list
	
	public LHM(){
		size = 0;
	}
	
	public void print(){
		Node now = first;
		while(now.next != null){
			System.out.print(now.item+"_"+now.key + " -> ");
			now = now.next;
		}
		System.out.println(now.item+"_"+now.key);
	}
	
	public void put(T item, int key){ //add an item to the end of the list
    		Node newNode = new Node(T item, int key);
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
				System.out.println(item + " added to the end of our LinkedHashMap!");
			}
   	}
	
	public boolean remove(int key){
		Node now = first;
		while(now != null){
			if(now.key.equals(key)){
				if(now.next != null){
					now.previous.next = now.next;
					now.next.previous = now.previous;
				}
				now.previous.next = null;
				now = null;
				size--;
				System.out.println("Success! The node with key " + key + " deleted.");
				return true;
			}
			now = now.next;
		}
		System.out.println("Error: No node found with given key!");
		return false;
	}
	
	public T get(int key){
		Node now = first;
		int counter = 0;
		while(now != null){
			if(now.key.equals(item)){
				return now.item;
			}
			now = now.next;
			counter++;
		}
		System.out.println("Error: No node found with given key!");
		return null;
	}
	
	public int size(){
		return size;
	}
}

class Node<T>{
	T item;
	int key;
	Node next;
	Node previous;
	
	public Node(Type item; int key){
		this.item = item;
		this.key = key;
	}
}
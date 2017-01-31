public class LinkedListTest{
	public static void main(String[] args) {

    	LinkedList L = new LinkedList();
    	L.add(1);
    	L.print();
    	L.add(2);
    	L.print();
    	L.add(3);
    	L.print();
    	L.deleteNodeWithData(2);
    	L.print();
    	L.deleteNodeAtIndex(3);
    	L.print();
    	L.deleteNodeAtIndex(1);
    	L.print();
	}
}


//Crediz for helpin understand: https://gist.github.com/akshaynagpal/14ee8b54cd018bd05b2a3c2432c818dc
public class LinkedListTest{
	public static void main(String[] args) {

    	LinkedList L = new LinkedList();
    	L.add(1);
    	L.show();
    	L.add(2);
    	L.show();
    	L.add(3);
    	L.show();
    	L.deleteNodeWithData(2);
    	L.show();
    	L.deleteNodeAtIndex(3);
    	L.show();
    	L.deleteNodeAtIndex(1);
    	L.show();
}


//Crediz for helpin understand: https://gist.github.com/akshaynagpal/14ee8b54cd018bd05b2a3c2432c818dc
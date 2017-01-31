public class LinkedListTest{
	public static void main(String[] args) {

    	LinkedList L = new LinkedList(0.0);
    	L.add(1);
    	L.print();
    	L.add("Moi");
    	L.print();
    	L.add(3);
    	L.print();
    	L.deleteNodeWithData(3);
	L.findNodeWithData("Moi");
	L.addToIndex("terve",2);
    	L.print();
    	L.deleteNodeAtIndex(3);
    	L.print();
    	L.deleteNodeAtIndex(1);
    	L.print();
	}
}

public class BSTest{
	public static void main(String[] args) {

    	BST<Integer> b = new BST<Integer>();
    	b.add(1);
    	b.print();
    	b.add(5);
    	b.print();
    	b.add(3);
    	b.print();
	b.find(3);
	b.add(42);
	b.add(2021);
	b.add(364);
	b.add(34);
	b.add(769);
	b.add(6);
    	b.print();
	}
}

public class BSTest{
	public static void main(String[] args) {

    	BST<Integer> b = new BST<Integer>();
    	b.add(1,1);
    	b.print();
    	b.add(5,5);
    	b.print();
    	b.add(3,3);
    	b.print();
		b.find(3);
		b.add(42,42);
		b.add(2021,2021);
		b.add(364,364);
		b.add(34,34);
		b.add(769,769);
		b.add(6,6);
    	b.print();
	}
}

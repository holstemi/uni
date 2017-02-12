public class BinaryTreeTest{
	public static void main(String[] args) {

    	BinaryTree<Integer> B = new BinaryTree<Integer>();
    	B.add(1);
    	B.print();
    	B.add(5);
    	B.print();
    	B.add(3);
    	B.print();
		B.find(3);
    	B.print();
	}
}

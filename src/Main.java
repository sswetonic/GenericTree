public class Main {

    public static void main(String[] args) {

        Node<Integer> test1 = new Node<>(5);
        test1.addChild(new Node<>(1));
        test1.addChild(new Node<>(2));
        test1.addChild(new Node<>(3));
        test1.addChild(new Node<>(4));

        Node<Integer> test2 = new Node<>(8);
        test2.addChild(new Node<>(11));
        test2.addChild(new Node<>(22));
        test2.addChild(new Node<>(33));
        test2.addChild(new Node<>(44));

        Node<Integer> test3 = new Node<>(9);
        test3.addChild(test1);
        test3.addChild(test2);

        Tree<Integer> testTree = new Tree<>(test3);
        System.out.println(testTree.getNode(5));
    }
}

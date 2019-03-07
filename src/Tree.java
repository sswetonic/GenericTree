import java.util.Stack;

public class Tree<E> {
    private Node<E> root;

    public Tree(E rootData) {
        root = new Node<>(rootData);
    }

    public Tree(Node<E> root) {
        this.root = root;
    }


}

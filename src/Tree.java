import java.util.Stack;

public class Tree<E> {
    private Node<E> root;

    public Tree(E rootData) {
        root = new Node<>(rootData);
    }

    public Tree(Node<E> root) {
        this.root = root;
    }

    public Node<E> getNode(E data) {
        Node<E> current = root;
        for (E nodeData : current.getChildren().keySet()) {


            Node<E> child = current.getChild(nodeData);
            if (child.getData() == data) {
                return child;
            }
            current = child;
        }
        return null;
    }
}

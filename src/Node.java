import java.util.ArrayList;
import java.util.List;

public class Node<E> {
    private E data;
    private List<Node<E>> children;

    public Node(E data) {
        this.data = data;
        children = new ArrayList<>();
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public List<Node<E>> getChildren() {
        return children;
    }

    public void addChild(Node<E> child) {
        children.add(child);
    }
}

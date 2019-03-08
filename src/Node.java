import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node<E> {
    private E data;
    private Map<E, Node<E>> children = new HashMap<>();

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    Map<E, Node<E>> getChildren() {
        return children;
    }

    Node<E> getChild(E data) {
        return children.get(data);
    }

    public void addChild(Node<E> child) {
        this.children.put(child.data, child);
    }
}

public class Node<T> {
    private T value;
    private Node nextNode;

    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }

    public void createNode(T value) {
        this.nextNode = new Node(value);
    }


    public boolean hasNext() {
        if(nextNode == null) {
            return false;
        }
        return true;
    }


    public Node getNextNode() {
        return this.nextNode;
    }

    
    public T getValue() {
        return this.value;
    }
}

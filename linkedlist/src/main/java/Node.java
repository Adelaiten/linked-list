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


    public Node getNextNode() {
        return this.nextNode;
    }


    public void setNextNode(Node<T> node) {
        this.nextNode = node;
    }


    public T getValue() {
        return this.value;
    }


    public void removeNextNode() {
        if(nextNode.hasNext()) {
            Node<T> tempNode = nextNode.getNextNode();
            this.nextNode = tempNode;
        }else {
            nextNode = null;
        }

    }

    public boolean hasNext() {
        if(nextNode == null) {
            return false;
        }
        return true;
    }
}


public class LinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int listLength;

    public LinkedList() {
        this.firstNode = null;
        this.listLength = 0;
    }

    public void add(T value) {
        if(this.firstNode == null) {
            this.firstNode = new Node<T>(value);
            this.lastNode = this.firstNode;
        }else {
            Node nextNode = new Node<T>(value);
            this.lastNode.setNextNode(nextNode);
            System.out.println(lastNode.getValue());
            this.lastNode = nextNode;
        }
        this.listLength++;
    }


    public T get(int index) {
        if(index >= listLength || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if(index == 0) {
            return this.firstNode.getValue();
        }else if(index == listLength - 1) {
            return this.lastNode.getValue();
        }

        Node<T> node = firstNode.getNextNode();

        for(int i = 1; i < listLength - 1; i++) {
            if(i == index) {
                return node.getValue();
            }
            node = node.getNextNode();
        }

        return null;

    }

    public void remove(int index) {
        if(index >= listLength || index < 0) { //jeszcze gdy pusta lista
            throw new IndexOutOfBoundsException();
        }
        Node<T> tempNode = this.firstNode;
        if(index == 0) {
            tempNode = this.firstNode.getNextNode();
            this.firstNode = tempNode;
            listLength--;
        }else {
            for(int i = 0; i < listLength; i++) {
                if(i+1 == index) {
                    tempNode.removeNextNode();
                    listLength--;
                    break;
                }
                tempNode = tempNode.getNextNode();
            }
        }

    }

    public void insert(int index, T value) {
        Node<T> node = new Node<>(value);
        Node tempNode = this.firstNode;
        for(int i = 0; i < listLength; i++) {
            if(i+1 == index) {

            }
            tempNode = tempNode.getNextNode();
        }
    }


}

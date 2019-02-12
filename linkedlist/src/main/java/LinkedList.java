
class LinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int listLength;


    LinkedList() {
        this.firstNode = null;
        this.listLength = 0;
    }


    void add(T value) {

        throwExceptionWhenValueNull(value);

        if(this.firstNode == null) {
            addWhenListEmpty(value);
        }else {
            pushNextNode(value);
        }
        this.listLength++;
    }


    T get(int index) {
        throwExceptionWhenInvalidIndex(index);
        int FIRST_INDEX = 0;
        int LAST_INDEX = listLength - 1;

        if(index == FIRST_INDEX) {
            return this.firstNode.getValue();
        }else if(index == LAST_INDEX) {
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


    void remove(int index) {
        throwExceptionWhenInvalidIndex(index);
        int FIRST_INDEX = 0;
        Node<T> tempNode = this.firstNode;

        if(index == FIRST_INDEX) {
            removeFirstNode();
        }else {
            removeNode(index, tempNode);
        }
        listLength--;
    }


    void insert(int index, T value) {
        throwExceptionWhenValueNull((T) value);

        Node<T> node = new Node<>(value);
        Node tempNode = this.firstNode;

        addWhenIndexHigher(index, value);

        throwErrorWhenLowerThanZero(index);

        insertionLoop(index, node, tempNode);
    }


    private void pushNextNode(T value) {
        Node nextNode = new Node<T>(value);
        this.lastNode.setNextNode(nextNode);

        this.lastNode = nextNode;
    }


    private void addWhenListEmpty(T value) {
        this.firstNode = new Node<T>(value);
        this.lastNode = this.firstNode;
    }


    private void removeNode(int index, Node<T> tempNode) {
        for(int i = 0; i < listLength; i++) {
            if(i+1 == index) {
                tempNode.removeNextNode();
                break;
            }
            tempNode = tempNode.getNextNode();
        }
    }


    private void removeFirstNode() {
        Node<T> tempNode;
        tempNode = this.firstNode.getNextNode();
        this.firstNode = tempNode;
    }


    private void throwExceptionWhenValueNull(T value) {
        if (value == null) {
            throw new NullPointerException();
        }
    }


    private void insertionLoop(int index, Node<T> node, Node tempNode) {
        for(int i = 0; i < listLength; i++) {
            if(i+1 == index) {
                Node indexNode = tempNode.getNextNode();
                node.setNextNode(indexNode);

                tempNode.setNextNode(node);
                listLength++;
                break;
            }
            tempNode = tempNode.getNextNode();
        }
    }


    private void throwErrorWhenLowerThanZero(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }


    private void addWhenIndexHigher(int index, T value) {
        if(index >= (listLength)) {
            add(value);
        }
    }


    private void throwExceptionWhenInvalidIndex(int index) {
        if (index >= listLength || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

}

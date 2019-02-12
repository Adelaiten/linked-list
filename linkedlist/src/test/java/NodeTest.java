import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NodeTest {

    @Test
    void checkIfHasNextReturnsTrue() {
        Node<Integer> node = new Node<Integer>(5);
        node.setNextNode(Mockito.mock(Node.class));
        assertTrue(node.hasNext());
    }

    @Test
    void checkIfHasNextReturnsFalse() {
        Node<Integer> node = new Node<Integer>(5);
        assertFalse(node.hasNext());
    }
}

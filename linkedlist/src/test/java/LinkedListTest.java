
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedListTest {

    @Test
    void checkIfGetReturnsRightNode() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        assertAll(
                () -> assertEquals(2, linkedList.get(0)),
                () -> assertEquals(3, linkedList.get(1)),
                () -> assertEquals(4, linkedList.get(2)),
                () -> assertEquals(5, linkedList.get(3))
        );
    }

    @Test
    void checkIfThrowsExceptionWhenIndexHigherThanListLength() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.get(8));
    }

    @Test
    void checkIfThrowsExceptionWhenIndexLowerThanZero() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.get(-1));
    }

    @Test
    void checkIfItemRemoved() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        linkedList.remove(1);
        assertEquals(4, linkedList.get(1));
        linkedList.remove(2);
        assertEquals(6, linkedList.get(2) );
    }

    @Test

    void checkIfInsertedOnIndex() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);//0
        linkedList.add(3);//1
        linkedList.add(4);//2
        linkedList.add(5); //3
        linkedList.add(6);//4
        linkedList.add(7);//5

        linkedList.insert(3, 3);
        linkedList.insert(4, 4);

        assertAll(
                () -> assertEquals(3, linkedList.get(3)),
                () -> assertEquals(4, linkedList.get(4)),
                () -> assertEquals(5, linkedList.get(5)),
                () -> assertEquals(6,  linkedList.get(6)),
                () -> assertEquals(7, linkedList.get(7))
                );
    }
}

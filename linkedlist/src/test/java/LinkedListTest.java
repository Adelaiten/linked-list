
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LinkedListTest {

    @Test
    void checkIfAddThrowsNullPointerException() {
        LinkedList<String> linkedList = new LinkedList<>();
        assertThrows(NullPointerException.class, () -> linkedList.add(null));
    }

    @Test
    void checkIfAddMethodPushesItem() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(5);
        assertAll(
                () -> assertEquals(4,linkedList.get(0)),
                () -> assertEquals(5,linkedList.get(1)))  ;
    }

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
    void checkIfGetThrowsExceptionWhenIndexHigherThanListLength() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.get(8));
    }

    @Test
    void checkIfGetThrowsExceptionWhenIndexLowerThanZero() {
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

    @Test
    void checkIfInsertPushWhenIndexHigherThanList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);//0
        linkedList.add(3);//1
        linkedList.insert(10, 5);
        assertEquals(5, linkedList.get(2));
    }

    @Test
    void checkIfInsertThrowsNullPointerException() {
        LinkedList<String> linkedList = new LinkedList<>();
        assertThrows(NullPointerException.class, () -> linkedList.insert(1, null));
    }




}

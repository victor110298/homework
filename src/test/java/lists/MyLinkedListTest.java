package lists;

import org.junit.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MyLinkedListTest {
    private MyLinkedList<String> list = new MyLinkedList<>();

    @Test
    public void add() {
        list.add("Test string");
        int sizeBefore = list.size();
        list.add("Test string 2");
        int sizeAfter = list.size();
        assertTrue(sizeBefore != sizeAfter);
    }

    @Test
    public void get() {
        String expected = list.get(0);
        String actual = list.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        list.add("Test string 1");
        list.add("Test string 2");
        list.add("Test string 3");
        list.remove(2);
        int expected = list.size();
        assertEquals(expected, 2);
    }

    @Test(expected = NullPointerException.class)
    public void clear() {
        int expected = 0;
        list.clear();
        int actual = list.size();
        assertEquals(expected, actual);
    }

    @Test
    public void size() {
        int sizeBefor = list.size();
        list.add("Test string");
        int sizeAfter = list.size();
        assertTrue(sizeBefor != sizeAfter);
    }
}

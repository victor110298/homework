package lists;

import org.junit.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MyLinkedListTest {
private MyLinkedList<String> list=new MyLinkedList<>();
    @Test
    public void add() {
        list.add("Test string");
        String actual = (String) list.get(0);
        String expected = "Test string";
        assertEquals(expected, actual);
    }

    @Test
    public void get() {
        list.add("Test string");
        list.get(0);
        String actual = (String) list.get(0);
        String expected = "Test string";
        assertEquals(expected, actual);

    }

    @Test
    public void remove() {
        int actual =list.size();
        list.add("Test string 1");
        list.add("Test string 2");
        list.add("Test string 3");
        list.remove(2);
        int expected = list.size();
        assertEquals(expected, 2);
    }

    @Test
    public void clear() {
        list.add("Test string 1");
        list.clear();
        assertTrue(true);    }

    @Test
    public void size() {
        list.add("Test string");
        list.size();
        assertTrue(true);
    }
}

package lists;

import org.junit.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MyArrayListTest {

    @Test
    public void add() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Test string");
        String actual = list.get(0);
        String expected = "Test string";
        assertEquals(expected, actual);
    }

    @Test
    public void get() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Test string");
        list.get(0);
        String actual = list.get(0);
        String expected = "Test string";
        assertEquals(expected, actual);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void remove() {
        MyArrayList<String> list = new MyArrayList<>();
        int actual = list.size();
        list.add("Test string 1");
        list.remove(2);
        int expected = list.size();
        assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Test string 1");
        list.clear();
        assertTrue(true);
    }

    @Test
    public void size() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Test string");
        list.size();
        assertEquals(1, list.size());
    }
}

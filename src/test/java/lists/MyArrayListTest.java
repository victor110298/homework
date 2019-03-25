package lists;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MyArrayListTest {
    private static final String CONSTANT = "Test string";

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
        list.add(CONSTANT);
        list.get(0);
        String actual = list.get(0);
        String expected = "Test string";
        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void remove() {
        MyArrayList<String> list = new MyArrayList<>();
        list.remove(2);
        list.get(3);
    }

    @Test
    public void clear() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Test string 1");
        int beforeSize = list.size();
        list.clear();
        int afterSize = list.size();
        assertEquals(beforeSize, afterSize);
    }

    @Test
    public void size() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Test string");
        assertEquals(1, list.size());
    }
}

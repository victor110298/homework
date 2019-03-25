package lists;

import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MyStackTest {
private MyStack<String> stack;

    @Before
    public void init(){
        stack=new MyStack<>();
    }

    @Test(expected = NullPointerException.class)
    public void push() {
        int expected = stack.size();
        stack.push("Test string");
        int actual = stack.size();
        assertTrue(expected != actual);
    }

    @Test(expected = NullPointerException.class)
    public void remove() {
        stack.push("Test string 1");
        stack.push("Test string 2");
        stack.push("Test string 3");
        stack.remove();
        int expected = stack.size();
        assertEquals(expected, 2);
    }

    @Test(expected = NullPointerException.class)
    public void clear() {
        stack.push("Test string 1");
        stack.clear();
        assertTrue(stack.size() == 0);
    }

    @Test(expected = NullPointerException.class)
    public void size() {
        int beforeSize = stack.size();
        stack.push("Test string");
        int afterSize = stack.size();
        assertTrue(beforeSize != afterSize);
    }
}

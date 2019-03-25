package lists;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.DEFAULT_CAPACITY;

public class MyStack<E> implements Stack<E> {
    private Object[] array;
    private int size = 0;
    private static final int DEFAUlT_CAPACITY = 10;
    private static final int CUT_RATE = 10;

    @Override
    public void push(E item) {
        if (size == array.length - 1) {
            resizeArray(array.length * 2);
        }
        array[size++] = item;
    }

    @Override
    public void remove() {
        if (!isEmpty()) {
            array[size--] = null;
            if (array.length > DEFAULT_CAPACITY && size < array.length / CUT_RATE) {
                resizeArray(array.length / 2);
            }
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void resizeArray(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}



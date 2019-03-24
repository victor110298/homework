package lists;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private Object[] myStore;
    private int actSize = 0;
    private static final int DEFAUlT_CAPACITY = 10;

    public MyArrayList() {
        myStore = new Object[DEFAUlT_CAPACITY];
    }

    @Override
    public T get(int index) {
        if (index > 0 || index < actSize) {
            return (T) myStore[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public void add(Object obj) {
        if (myStore.length - actSize <= 5) {
            increaseListSize();
        }
        myStore[actSize++] = obj;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index < actSize) {
            T t = (T) myStore[index];
            myStore[index] = null;
            int tmp = index;
            while (tmp < actSize) {
                myStore[tmp] = myStore[tmp + 1];
                myStore[tmp + 1] = null;
                tmp++;
            }
            actSize--;
            return t;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public boolean clear() {
      if (actSize==0) {
          for (int i = 0; i < actSize; i++) {
              myStore[i] = null;
          }
          actSize = 0;
      }
        return true;
    }

    public int size() {
        return actSize;
    }

    private void increaseListSize() {
        myStore = Arrays.copyOf(myStore, myStore.length * 2);
    }
}





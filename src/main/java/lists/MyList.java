package lists;

public interface MyList<T> {
    T get(int i);
    void add(Object t);
    Object remove(int index);
    int size();
    boolean clear();
}




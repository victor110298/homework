package lists;

public interface Stack<E> {
    void push(E item);

    void remove();

    void clear();

    int size();

    E peek();

    E pop();
}


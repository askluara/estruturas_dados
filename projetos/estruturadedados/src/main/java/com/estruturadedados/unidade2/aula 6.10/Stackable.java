public interface Stackable<T> {
    T peek();
    void push(T data);
    T pop();
    void update(T newData);
    boolean isFull();
    boolean isEmpty();
    String print();
}
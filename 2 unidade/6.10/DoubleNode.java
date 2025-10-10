public class DoubleNode<T> {
    private T data;
    private DoubleNode<T> next;
    private DoubleNode<T> prior;

    public DoubleNode(T data) {
        this.data = data;
        this.next = null;
        this.prior = null;
    }

    public DoubleNode<T> getNext() { return next; }
    public DoubleNode<T> getPrior() { return prior; }
    public T getData() { return data; } // <-- corrigido aqui ✅

    public void setData(T data) { this.data = data; }
    public void setNext(DoubleNode<T> next) { this.next = next; }
    public void setPrior(DoubleNode<T> prior) { this.prior = prior; }
}

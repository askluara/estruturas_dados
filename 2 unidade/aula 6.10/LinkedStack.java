/**
 * Implementação de uma pilha dinâmica genérica.
 * Utiliza nós duplamente encadeados para armazenar os elementos.
 * 
 * @author Luara
 * @version 1.1
 * @since 06/10/2025
 */

import java.util.NoSuchElementException;

public class LinkedStack<T> implements Stackable<T> {
    /** Aponta para o topo da pilha */
    private DoubleNode<T> topPointer;

    /** Indica o número atual de elementos na pilha */
    private int numberElements;

    /** Indica o número máximo de elementos que a pilha pode ter */
    private int maxElements;

    /** Construtor padrão (limite de 10 elementos) */
    public LinkedStack() {
        this(10);
    }

    /** Construtor com capacidade máxima definida pelo usuário */
    public LinkedStack(int maxElements) {
        this.topPointer = null;
        this.numberElements = 0;
        this.maxElements = maxElements;
    }

    /** Retorna o elemento do topo da pilha sem removê-lo */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia.");
        }
        return topPointer.getData();
    }

    /** Empilha (insere) um novo elemento no topo */
    @Override
    public void push(T data) {
        if (isFull()) {
            throw new IllegalStateException("A pilha está cheia.");
        }

        DoubleNode<T> newNode = new DoubleNode<>();
        newNode.setData(data);
        newNode.setPrior(topPointer);

        if (topPointer != null) {
            topPointer.setNext(newNode);
        }
        

        topPointer = newNode;
        numberElements++;
    }

    /** Desempilha (remove) o elemento do topo e o retorna */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia.");
        }

        T auxData = topPointer.getData();
        DoubleNode<T> previous = topPointer.getPrior();

        if (previous != null) {
            previous.setNext(null);
        }

        topPointer = previous;
        numberElements--;
        return auxData;
    }

    /** Atualiza o elemento do topo com um novo valor */
    @Override
    public void update(T newData) {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia.");
        }
        topPointer.setData(newData);
    }

    /** Verifica se a pilha está cheia */
    @Override
    public boolean isFull() {
        return numberElements == maxElements;
    }

    /** Verifica se a pilha está vazia */
    @Override
    public boolean isEmpty() {
        return numberElements == 0;
    }

    /** Retorna uma representação textual da pilha (do topo até a base) */
    @Override
    public String print() {
        if (isEmpty()) {
            return "[Pilha está vazia]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Topo -> ");
        DoubleNode<T> current = topPointer;

        while (current != null) {
            sb.append(current.getData());
            if (current.getPrior() != null) sb.append(" | ");
            current = current.getPrior();
        }

        return sb.toString();
    }
}

/* 
 * Implementação de uma pilha dinâmica genérica
 * @author Luara
 * @version 1.0
 * @since 6/10/2025
 */

import java.util.NoSuchElementException;

/**
 *
 * @param <T> o tipo de elementos armazenados na Pilha
 */
public class LinkedStack<T> implements Stackable<T> {
    /** Aponta para o topo da pilha */
    private DoubleNode<T> topPointer;
    /** Indica o número atual de dados da pilha */
    private int numberElements;
    /** Indica o número máximo de elementos que a pilha pode ter */
    private int maxElements;

    /** Construtor padrão que define o tamanho máximo como 10 */
    public LinkedStack() {
        this(10);
    }

    /** Construtor com limite máximo definido pelo usuário */
    public LinkedStack(int maxElements) {
        this.topPointer = null;
        this.numberElements = 0;
        this.maxElements = maxElements;
    }

    /** Retorna o elemento do topo sem removê-lo */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia.");
        }
        return topPointer.getData();
    }

    /** Empilha (adiciona) um novo elemento no topo */
    @Override
    public void push(T data) {
        if (isFull()) {
            throw new IllegalStateException("A pilha está cheia.");
        }

        DoubleNode<T> newNode = new DoubleNode<>(data);
        newNode.setPrior(topPointer); // novo nó aponta para o anterior (antigo topo)

        if (topPointer != null) {
            topPointer.setNext(newNode); // o antigo topo agora aponta para o novo
        }

        topPointer = newNode; // o novo nó vira o topo
        numberElements++;
    }

    /** Desempilha (remove) o elemento do topo */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("A pilha está vazia.");
        }

        T auxData = topPointer.getData();
        DoubleNode<T> priorNode = topPointer.getPrior();

        if (priorNode != null) {
            priorNode.setNext(null);
        }

        topPointer = priorNode;
        numberElements--;
        return auxData;
    }

    /** Atualiza o valor do elemento no topo */
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

    /** Retorna uma representação textual da pilha */
    @Override
    public String print() {
        if (isEmpty()) {
            return "Pilha vazia.";
        }

        StringBuilder sb = new StringBuilder("Topo -> ");
        DoubleNode<T> current = topPointer;

        while (current != null) {
            sb.append(current.getData());
            if (current.getPrior() != null) {
                sb.append(" | ");
            }
            current = current.getPrior();
        }

        return sb.toString();
    }
}

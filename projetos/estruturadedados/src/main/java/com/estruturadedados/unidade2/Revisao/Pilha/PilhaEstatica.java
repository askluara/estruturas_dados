package com.estruturadedados.unidade2.Revisao.Pilha;

public class PilhaEstatica {
    private int[] elementos;
    private int topo; // Índice do último elemento inserido
    private int capacidade;

    public PilhaEstatica(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1; // Indica que a pilha está vazia
    }

    public boolean estaCheia() {
        return topo == capacidade - 1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    // Método de Inserção (Push)
    public void push(int item) {
        if (estaCheia()) {
            System.out.println("ERRO: Pilha cheia. Não é possível empilhar " + item);
            return;
        }
        // As linhas que você pediu a explicação:
        topo++; // Move o ponteiro para a próxima posição vazia
        elementos[topo] = item; // Coloca o item na nova posição do topo
        System.out.println("Empilhado: " + item);
    }

    // Método de Remoção (Pop)
    public int pop() {
        if (estaVazia()) {
            System.out.println("ERRO: Pilha vazia. Não é possível desempilhar.");
            return -1;
        }
        int itemRemovido = elementos[topo];
        topo--;
        return itemRemovido;
    }

    // Método de Consulta (Peek)
    public int peek() {
        if (estaVazia()) {
            return -1;
        }
        return elementos[topo];
    }
}
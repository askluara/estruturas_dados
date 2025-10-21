package com.estruturadedados.unidade2.Revisao.Pilha;

class ExemploPilha {
    public static void main(String[] args) {
        // Cria uma pilha estática com capacidade para 5 elementos
        PilhaEstatica minhaPilha = new PilhaEstatica(5);

        System.out.println("--- Operações de Inserção (PUSH) ---");
        minhaPilha.push(10);
        minhaPilha.push(20);
        minhaPilha.push(30);
        
        System.out.println("\nTopo atual (PEEK): " + minhaPilha.peek()); // 30

        System.out.println("\n--- Operações de Remoção (POP) ---");
        int valorRetirado = minhaPilha.pop();
        System.out.println("Desempilhado: " + valorRetirado); // 30
        
        valorRetirado = minhaPilha.pop();
        System.out.println("Desempilhado: " + valorRetirado); // 20
        
        System.out.println("\nTopo atual (PEEK): " + minhaPilha.peek()); // 10
        
        System.out.println("\n--- Esvaziando e testando erro ---");
        minhaPilha.pop(); // 10
        minhaPilha.pop(); // ERRO: Pilha vazia.
    }
}
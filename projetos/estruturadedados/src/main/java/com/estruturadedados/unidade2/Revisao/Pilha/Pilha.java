package com.estruturadedados.unidade2.Revisao.Pilha;

/*
 
 * revisão do conteudo de pilha

 * 
 * @author Luara
 * @version 1.1
 * @since 20/10/2025
 */
/* 
 * Pilha é um conteudo onde o primeiro a entrar e o ultimo a sair. 
 * a capacidade é definida no momento da criação
*/

public class Pilha{
private int [] elementos; // cria a pilha
private int topo; // cria o elemento do topo
private int capacidade; // cria o total de capacidade

public Pilha (int capacidade){
    this.capacidade = capacidade;
    this.elementos = new int [capacidade];
    this.topo = -1; // se colocasse 0, teoricamente ja seria um espaço. por isso é -1
}
/*metodos que verificam se está cheia ou vazia. */
public boolean estaCheia (){
    return topo == capacidade -1; // capacidade é menos um pq o topo já é configurado pra ter -1
}

public boolean estaVazia(){
    return topo == -1;
}
//push (item): insere algo no topo

public void push (int item){
    if (estaCheia()){
        System.out.println("Erro! a pilha está cheia");
        return;
    }else{
        topo ++; // incrementa um valor em topo
        elementos [topo] = item; //armazena o (item) no array (elementos), na posição que é indicada o topo
    }

// pop (): remove o topo


}

public void pop(){
    if (estaVazia()){
        System.out.println("Erro! A pilha está vazia");
        System.out.println("-1");
    }else{
        int itemremovido = elementos [topo]; // estamos apontando que o itemremovido é o topo, para retornar ele depois
        topo --;  // removemos o item do topo
        System.out.println(itemremovido); // retornamos aquela variavel que foi armazenada o topo removido
    }

}

// peek (): consulta o topo
public int peek (){
    if (estaVazia()) {
        return -1;
    }else{
        return elementos [topo];
        
    }
}


}
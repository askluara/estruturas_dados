package com.estruturadedados.unidade2.Revisao.Vetores;


public class VetorEstatico {
private int [] dados;
private int tamanhoatual; // variavel criada pra rastrear quantos estão preenchidos
public VetorEstatico (int capacidademaxima){
this.dados = new int [capacidademaxima]; 
this.tamanhoatual = 0; // inicialmente esta vazio
}

public boolean estavazio (){
return tamanhoatual == 0;
}

public boolean estacheio (){
    return tamanhoatual == dados.length;
}


public boolean inserir (int valor){
    if (!estacheio()){
        dados [tamanhoatual] = valor;
        tamanhoatual++;
        System.out.println("inserido o valor " +valor);
        return true;
    }else{
        System.out.println("o vetor está cheio");
        return false;
    }
}

public int buscar(int valor) {
        // Percorre apenas as posições que contêm dados (até tamanhoAtual)
        for (int i = 0; i < tamanhoatual; i++) {
            if (dados[i] == valor) {
                System.out.println("Valor " + valor + " encontrado no índice " + i);
                return i;
            }
        }
        System.out.println("Valor " + valor + " não encontrado.");
        return -1;
    }

public boolean remover(int valor){
        if (!estavazio()) {
            System.out.println("o vetor está vazio");
            return false;
        }else{


            /*
             * Quando adicionamos um indice pra remover, acionamos
             * o metodo buscar com o valor a ser buscado, a partir dai
             * o metodo mostra qual a posição do valor. o indice pra 
             * remover é a posição do valor
             */
            int indicepraremover = buscar(valor);
            /*
             * Criamos um if, caso seja diferente de -1, deslocamos os 
             * outros valores posteriores pra não ficar com buraco 
             */
            if (indicepraremover != -1) {
                for (int i = indicepraremover; i < tamanhoatual - 1; i++) {
                    dados[i] = dados [i+1];
                }
                tamanhoatual--;
                System.out.println("valor: "+valor+" removido do indice"+indicepraremover);
                return true;
            }else{

                return false;
            }

        }
      

}

  public void exibir(){
            System.out.println("exibindo os valores[");
            for (int i =0; i<tamanhoatual; i++){
                System.out.println(dados[i]+" \n");


            }
            System.out.println("] (tamanho: "+tamanhoatual+ ", capacidade: "+dados.length);
        }


}
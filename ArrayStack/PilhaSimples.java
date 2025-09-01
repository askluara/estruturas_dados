import java.util.Stack;
//importação do pacote Stack

public class PilhaSimples {
    public static void main(String[] args) {
    // ---------------------------------------------------    
    
        //declarando um objeto do tipo Stack pra armazenas vetores do tipo string com nome pilha
        Stack<String> pilha = new Stack<>();

   // ---------------------------------------------------    

        //Mostrando o tamanho da pilha
        System.out.println("Tamanho da pilha....: "+pilha.size()); 
   // --------------------------------------------------- 
      
        //Mostrando se a pilha está vazia
        System.out.println("Pilha vazia?...: "+pilha.empty()); 
  
    // ---------------------------------------------------    
        //o método push adiciona elementos na pilha
        pilha.push("parque de exposição");
        pilha.push("vila do bosque");
        pilha.push ("Av. Olivia Flores");


    // ---------------------------------------------------    
        //imprimindo a pilha
        System.out.println("Vagando por....: "+pilha); 
    
    // ---------------------------------------------------    
        //imprimindo elemento do topo
        System.out.println("Elemento do topo....: "+pilha.peek()); 
    // ---------------------------------------------------    
        //Buscando a posição de um elemento
        System.out.println("Posição da 'Vila do Bosque'....: "+pilha.search("Vila do Bosque")); 
   // ---------------------------------------------------    
        //Mostrando o tamanho da pilha
        System.out.println("Tamanho da pilha....: "+pilha.size()); 
   // ---------------------------------------------------    
        //Mostrando se a pilha está vazia
        System.out.println("Pilha vazia?....: "+pilha.empty()); 
        // ---------------------------------------------------    
        // O método POP remove o elemento mais recente da pilha
        String removido = pilha.pop();  
        
        // --------- OBS: ---- COLOQUEI ELE EM UMA VARIAVEL SÓ PARA MOSTRAR O QUE FOI RETIRADO ----------

    // ---------------------------------------------------    
        //imprimindo o que foi removido
        System.out.println("Elemento removido....: "+removido);
    // ---------------------------------------------------    
        //imprimindo a pilha novamente
        System.out.println("Vagando por....: "+pilha); 

    }


}


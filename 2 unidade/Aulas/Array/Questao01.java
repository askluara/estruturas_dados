import java.util.Scanner;

//Faça um programa que leia um vetor de 5 números inteiros e mostre-os.

public class Questao01 {
public static void main(String[] args) {
    

//criar o objeto scanner
Scanner sc = new Scanner (System.in);

// criar o vetor
int [] num = new int [5];


// laço de repetição

for (int i = 0; i < num.length; i++){ // i é menor do que nosso numero de vetores

System.out.println("Digite um número: "); // pede ao usuário para digitar o numero
num[i] = sc.nextInt(); // lê e armazena


}

System.out.println("Os números digitados foram: ");

// for para mostrar os numeros armazenados e em que posição eles ficaram.
for (int i = 0; i < num.length; i++) {
    System.out.println("Posição ["+i+"] "+num[i]);
}
sc.close();

}
}

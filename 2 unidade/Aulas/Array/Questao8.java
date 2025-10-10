/*8. Faça um programa em Java que peça a idade e a altura de 5 pessoas, 
armazene cada informação no seu respectivo vetor. Imprima a idade e 
a altura na ordem inversa a ordem lida. */

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] idade = new int [5];
    double [] altura = new double[5];

     for (int i = 0; i < 5; i++) {
            

            System.out.print("Digite a idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Digite a altura (ex: 1.75): ");
            altura[i] = sc.nextDouble();
        }
        sc.close();
    for (int i = 4; i >=0; i--){
        System.out.println("------ IDADE ------");
        System.out.println(+idade[i]);
        System.out.println("------ ALTURA ------");
        System.out.println(+altura[i]);
    }
    

    }
}

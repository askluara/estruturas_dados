//3. Faça um programa em Java que leia 4 notas, mostre as notas e a média na tela.

//criando classe scanner

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner (System.in);

        double [] notas = new double [4];
        double soma = 0;
    for (int i = 0; i < notas.length; i++) {
        System.out.println("Insira a nota "+ i +" ");
          notas[i] = sc.nextDouble();

          soma +=notas[i];
    }
    double media = soma/4;

    System.out.println("A media ficou: "+media);

sc.close();
    }
}

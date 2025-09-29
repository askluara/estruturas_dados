// Faça um programa em Java que leia um vetor de 10 números reais e mostre-os na ordem inversa.

import java.util.ArrayList;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // criar o vetor
        int [] num = new int [10];
        
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        // ler os números normalmente
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número: ");
            num[i] = sc.nextInt();
        }

        // mostrar na ordem inversa
        System.out.println("\nOs números digitados na ordem inversa são:");
        for (int i = num.length -1; i >= 0; i--) {
            System.out.println("Posição [" + i + "] = " + num[i]);
        }

        sc.close();
    }
}
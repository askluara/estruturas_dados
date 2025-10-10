/* 4. Faça um programa em Java que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. 
Imprima as consoantes. */
import java.util.Scanner;
import java.util.ArrayList;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] caracteres = new char[10];
        ArrayList<Character> consoantes = new ArrayList<>();

        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Insira o caractere " + (i + 1) + ": ");
            caracteres[i] = sc.next().charAt(0);

            // Verifica se o caractere é uma consoante
            if (Character.isLetter(caracteres[i]) && !"AEIOUaeiou".contains(String.valueOf(caracteres[i]))) {
                consoantes.add(caracteres[i]);
            }
        }

        System.out.println("Número de consoantes: " + consoantes.size());
        System.out.println("Consoantes lidas: " + consoantes);

        sc.close();
    }
}
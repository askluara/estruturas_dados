import java.util.Scanner;
import java.util.ArrayList;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numint = new int[20];
ArrayList<Integer> pares = new ArrayList<>();
ArrayList<Integer> impares = new ArrayList<>();
        int numeroAtual;
        for (int i = 0; i < 20 ; i++) {
            System.out.println("Insira o número " + (i + 1) + ": ");
            numint[i] = sc.nextInt();
            numeroAtual = numint[i];
            
            if (numeroAtual % 2 == 0) {
                pares.add(numeroAtual);
            } else {
                impares.add(numeroAtual);
                
            }


        }

        for (int num : numint) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nVetor de números pares: " + pares);
        System.out.println("Vetor de números ímpares: " + impares);
     sc.close();
    }
}

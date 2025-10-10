import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [] numinteiros = new int [5];

        int soma = 0, multiplicacao = 1;

for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numinteiros[i] = sc.nextInt();
        soma += numinteiros [i];
        multiplicacao = multiplicacao * numinteiros [i];

    }
    System.out.println("SOMA DOS NUMEROS: "+soma);
    System.out.println("MULTIPLICAÇÃO DOS NUMEROS: "+multiplicacao);
    
    System.out.println("NÚMEROS DIGITADOS: ");

      for (int num : numinteiros) {
            System.out.print(num + " ");
        }
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class Questao6 {
    public static void main(String[] args) {
        
        ArrayList <Double> notas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        double media, soma = 0;;

        for (int i = 0; i <4; i++){
            
            System.out.println("Digite a nota " + (i+1) + ": ");
            notas.add(sc.nextDouble());
            soma += notas.get(i);
        }
        media = soma/4;
        System.out.println("A média das notas é: " + media);
    sc.close();
    }
}

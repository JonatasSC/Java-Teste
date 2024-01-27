package ExerciciosEP2;

import java.util.Scanner;

public class ex001 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("digite um valor: ");
            float num1 = scan.nextFloat();

            System.out.println("Digite outro valor: ");
            float num2 = scan.nextFloat();

            float media = (num1 + num2) / 2;

            if (media == 10) {
                System.out.println("Você esta de parabéns!");
            } else if (media >= 7 && media < 10) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado!");
            }
        }   
    }
}
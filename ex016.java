package ExerciciosEP2;

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite um numero inteiro: ");
            int num = scan.nextInt();

            if (num % 2 != 0) {
                System.out.println("numero impar!");
            } else {
                System.out.println("Numero par!");
            }
        }
    }
}

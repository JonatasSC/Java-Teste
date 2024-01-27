package ExerciciosEP2;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            int valor = scan.nextInt();

            if (valor < 0) {
                System.out.println("O numero é negativo");
            }else {
                System.out.println("O valor é positivo");
            }
        }

    }
}

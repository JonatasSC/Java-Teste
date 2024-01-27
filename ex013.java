package ExerciciosEP2;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Programa que caucula uma função de segundo gral");
            System.out.println("Digite o alor de A: ");
            double A = scan.nextDouble();
            if (A == 0) {
            System.out.println("Não é uma função de segundo gral");
            } else {
            System.out.println("Digite o valor de B: ");
            double B = scan.nextDouble();

            System.out.println("Digite o valor de C: ");
            double C = scan.nextDouble();

            Double delta = Math.pow(B, 2) - (4 * A * C);

                if (delta < 0) {
                    System.out.println("Não possui raizes reais!");
                } else {
                    double calc1 = (( -B ) + Math.sqrt(delta)) / (2*A);
                    double calc2 = (( -B ) - Math.sqrt(delta)) / (2*A);

                    System.out.println("Delta: " + delta);
                    System.out.println("Raizes");
                    System.out.println(calc1);
                    System.out.println(calc2);
                }
            }
        }
    }
}

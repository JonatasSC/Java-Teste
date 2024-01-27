package ExerciciosEP2;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um valor: ");
            double lado1 = scan.nextDouble();
            System.out.println("Informe outro valor: ");
            double lado2 = scan.nextDouble();
            System.out.println("Informe um terceiro valor: ");
            double lado3 = scan.nextDouble();


            if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.println("Triângulo equilátero!");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Triângulo Isósceles!");
                } else {
                    System.out.println("Triângulo Escaleno!");
                }
            }else {
                System.out.println("Não forma um trinagulo!");
            }
        }
    }
}

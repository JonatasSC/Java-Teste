package ExerciciosEP2;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            int num1 = scan.nextInt();

            System.out.println("Digite um segundo valor: ");
            int num2 = scan.nextInt();

            System.out.println("Digite um terceiro valor: ");
            int num3 = scan.nextInt();
   
            if (num1 > num2 && num1 > num3) {
                if (num2 > num3) {
                    System.out.println("O maior é " + num1);
                    System.out.println("O menor é " + num3);
                }else {
                    System.out.println("O maior é " + num1);
                    System.out.println("O menor é: " + num2);
                }
                 
            } else if (num2 > num1 && num2 > num3) {
                if (num1 > num3) {
                    System.out.println("O maior é "+ num2);
                    System.out.println("O menor é " + num3);   
                } else {
                    System.out.println("O maior é " + num2);
                    System.out.println("O menor é " + num1);
                }
                
            } else if (num3 > num1 && num3 > num2 ) {
                if (num1 > num2) {
                    System.out.println("O maior é " + num3);
                    System.out.println("O menor é " + num2);   
                } else {
                    System.out.println("O maior é " + num3);
                    System.out.println("O menor é " + num1);
                }
                
            }
        }
    }
}

package ExerciciosEP2;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o valor de um produto: ");
            float prod1 = scan.nextFloat();

            System.out.println("Informe o valor do segundo produto: ");
            float prod2 = scan.nextFloat();

            System.out.println("Informe o valor do terceiro produto: ");
            float prod3 = scan.nextFloat();


            if (prod1 > prod2 && prod2 > prod3) {
                System.out.println("Compre o produto com o valor " + prod3);
            }else if (prod2 > prod1 && prod1 > prod3) {
                System.out.println("Compre o produto com o valor " + prod3);
            }else if (prod3 > prod2 && prod2 > prod1) {
                System.out.println("Compre o produto com o valor " + prod1);
            }else {
                System.out.println("Compre o produto com o valor " + prod2);
            }
        }
    }
}

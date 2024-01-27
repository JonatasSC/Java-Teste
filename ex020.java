package ExerciciosEP2;

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite G para gasolina ou A para álcool");
            String GorA = scan.next();

            System.out.println("informe a quantidade em litros que vai abastecer: ");
            double qtd = scan.nextDouble();

            double gasolina = 2.50;
            double alcool = 1.90;
            double disconto = 0;
            double total = 0;
            double soma = 0;
            double totalapagar;

            if (GorA.equalsIgnoreCase("a")) {
                if (qtd <= 20) {
                    disconto = 0.03;
                } else {
                    disconto = 0.05;
                }
                total = qtd * alcool;
            } else if (GorA.equalsIgnoreCase("g")) {
                if (qtd <= 20) {
                    disconto = 0.04;
                } else {
                    disconto = 0.06;
                }
                total = qtd * gasolina; 
            }
            
            soma = total * disconto;
            totalapagar = total - soma ;
            System.out.println("Total a pagar: " + totalapagar );
        }
    }
}

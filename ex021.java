package ExerciciosEP2;

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Digite a quantidade em KG's de Maçã: ");
            double pesomaca = scan.nextDouble();
            System.out.println("Digito a quantidade em KG's de Morango: ");
            double pesomorango = scan.nextDouble();
            
            double valormaca = 0;
            double valormorango = 0;
            double calc = 0;
            double calc2 = 0;
            double pesos = pesomaca + pesomorango;
            double soma = 0;
            double desc = 0;
            if ( pesomaca < 5) {
                valormaca = 1.80;
            } else {
                valormaca = 1.50;
            }
            if (pesomorango < 5) {
                valormorango = 2.50;
            } else {
                valormorango = 2.30;
            }
            if (pesos < 8) {
                desc = 0;
            } else {
                desc = 0.1;
            }

            calc = valormaca * pesomaca;
            calc2 = valormorango * pesomorango;
            soma = calc + calc2;

            if (soma > 25) {
                desc = soma * desc;
                soma = soma - desc;
                System.out.println("O valor total é: " + soma + "R$");
                System.out.println("O desconto aplicado foi de  " + desc + "R$");
            } else {
                System.out.println("O valor total é: " + soma + "R$");
            }
            
        }
    }
}

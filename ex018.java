package ExerciciosEP2;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.println("Digite um numero: ");
            double num1 = scan.nextDouble();
            System.out.println("Digite outro: ");
            double num2 = scan.nextDouble();

            System.out.println("Qual operação matematica você deseja fazer?");
            
            System.out.println("Digite (-), (+), (*) ou (/)");
            String operation = scan.next();
            
            double Resultado = 0;

            switch (operation) {
                case "-": Resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + Resultado);
                    break;
                case "+": Resultado = num1 + num2;    
                System.out.println("Resultado da adição: " + Resultado);
                    break;
                case "*": Resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + Resultado);
                break;
                case "/": Resultado = num1 / num2;
                System.out.println("Resultado da divisão: " + Resultado);
                    break;
                default: System.out.println("Operação invalida!");
                    break;
            }
            if (Resultado % 2 == 0) {
                System.out.println("numero par!");
            } else {
                System.out.println("Numero impar!");
            }
            if (Resultado > 0) {
                System.out.println("Numero positivo!");
            } else{
                System.out.println("Numero negativo!");
            }
        }
    }
}

package ExerciciosEP2;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Digite um numero para cada dia da semana: ");
            int dia = scan.nextInt();

            switch (dia) {
                case 1: System.out.println("Domingo!");
                    break;
                case 2: System.out.println("Segunda-feira!");
                    break;
                case 3: System.out.println("Terça-feira!");
                    break;
                case 4: System.out.println("Quarta-feira!");
                    break;
                case 5: System.out.println("Quinta-feira!");
                    break;
                case 6: System.out.println("Sexta-feira");
                    break;
                case 7: System.out.println("Sabádo!");
                    break;
            
                default: System.out.println("Valor invalido!");
                    break;
            }
        } 
    }
}

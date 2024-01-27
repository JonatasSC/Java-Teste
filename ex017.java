package ExerciciosEP2;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite uma data no formato DD/MM/AAAA: ");
            System.out.println("Digite o dia: ");
            int dia = scan.nextInt();
            System.out.println("digite o mês: ");
            int mes = scan.nextInt();
            System.out.println("Digite o ano: ");
            int ano = scan.nextInt();

            if (dia <= 0 || mes <= 0 || ano <= 0) {
                System.out.println("Data invalida!");
            } else {
                System.out.println("Data informada: " + dia + "/" + mes + "/" + ano);
            }
        }

    }
}

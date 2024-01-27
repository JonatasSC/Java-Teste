package ExerciciosEP2;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double soma;
            System.out.println("Digite o valor ganho por hora: ");
            double salario = scan.nextDouble();
            System.out.println("digite o tanto de horas: ");
            int horas = scan.nextInt();
            salario = salario * horas;

            if (salario <= 280) {
                double reajuste = salario * 0.2;
                soma = reajuste + salario;
                System.out.println("Salario com reajuste é: " + soma);
                System.out.println("Salario antes do reajuste: " + salario);
                System.out.println("Valor do reajuste " + reajuste);
                System.out.println("Porcentagem do reajuste: 20%");
            } else if (salario > 280 && salario < 700) {
                double reajuste = salario * 0.15;
                soma = reajuste + salario;
                System.out.println("Salario com o reajuste é: " + soma);
                System.out.println("Salario antes do reajuste: " + salario);
                System.out.println("Valor do reajuste: " + reajuste);
                System.out.println("Porcentagem do reajuste: 15%");
            } else if (salario > 700 && salario < 1500) {
                double reajuste = salario * 0.1;
                soma = reajuste + salario;
                System.out.println("Novo salario: " + soma);
                System.out.println("Salario antes do reajuste: " + salario);
                System.out.println("Valor do reajuste: " + reajuste);
                System.out.println("Porcentagem do reajuste: 10%");
            } else if (salario > 1500){
                double reajuste = salario * 0.05;
                soma = reajuste + salario;
                System.out.println("Novo salario: " + soma);
                System.out.println("Salario antes do reajuste: " + salario);
                System.out.println("Valor do reajuste: " + reajuste);
                System.out.println("Porcentagem do reajuste: 5%");
            }
        }
    }
}
